package ma.miaad.hopitalmansouranastp3sd.security.service;

import ma.miaad.hopitalmansouranastp3sd.security.entities.AppRole;
import ma.miaad.hopitalmansouranastp3sd.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username,String password,String email,String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username,String role);
    void removeRoleFromUser(String username,String role);
    AppUser loadUserByUsername(String username);
}