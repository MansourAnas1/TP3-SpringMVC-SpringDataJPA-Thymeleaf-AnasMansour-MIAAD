package ma.miaad.hopitalmansouranastp3sd.security.service;

import lombok.AllArgsConstructor;
import ma.miaad.hopitalmansouranastp3sd.security.entities.AppRole;
import ma.miaad.hopitalmansouranastp3sd.security.entities.AppUser;
import ma.miaad.hopitalmansouranastp3sd.security.repo.AppRoleRepository;
import ma.miaad.hopitalmansouranastp3sd.security.repo.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional @AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AppUserRepository appUserRepository;
    private AppRoleRepository appRoleRepository;
    private PasswordEncoder passwordEncoder;

    @Override
    public AppUser addNewUser(String username, String password, String email, String confirmPassword) {
        AppUser appUser=appUserRepository.findByUsername(username);
        //if(appUser!=null) throw new RuntimeException("This user already exists !!");
        //if (password.equals(confirmPassword)) throw new RuntimeException("Password is not matched ");
        appUser =AppUser.builder()
                .userId(UUID.randomUUID().toString())
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .build();
        AppUser savedAppUser = appUserRepository.save(appUser);
        return savedAppUser;
    }

    @Override
    public AppRole addNewRole(String role) {
        AppRole appRole =appRoleRepository.findById(role).orElse(null);
        //if (appRole!=null) throw new RuntimeException("this role already exists");
        appRole=AppRole.builder()
                .role(role)
                .build();
        return appRoleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String role) {
        //supposons que l'utilisateur et le role exists :
        AppUser appUser=appUserRepository.findByUsername(username);
        AppRole appRole=appRoleRepository.findById(role).get();
        appUser.getRoles().add(appRole);
        //appUserRepository.save(appUser);    //on peut ne pas utiliser cette ligne , car nous avons utilisé @Transactionnal qui fais ça automatiquement

    }

    @Override
    public void removeRoleFromUser(String username, String role) {
        AppUser appUser=appUserRepository.findByUsername(username);
        AppRole appRole=appRoleRepository.findById(role).get();
        appUser.getRoles().remove(appRole);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }
}