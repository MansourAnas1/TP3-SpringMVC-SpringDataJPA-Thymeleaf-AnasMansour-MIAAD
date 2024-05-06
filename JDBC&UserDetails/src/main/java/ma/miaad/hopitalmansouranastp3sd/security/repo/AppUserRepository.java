package ma.miaad.hopitalmansouranastp3sd.security.repo;


import ma.miaad.hopitalmansouranastp3sd.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>
{
    AppUser findByUsername(String username);
}