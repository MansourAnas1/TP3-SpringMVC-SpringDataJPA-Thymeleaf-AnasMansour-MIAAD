package ma.miaad.hopitalmansouranastp3sd.security.repo;


import ma.miaad.hopitalmansouranastp3sd.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}