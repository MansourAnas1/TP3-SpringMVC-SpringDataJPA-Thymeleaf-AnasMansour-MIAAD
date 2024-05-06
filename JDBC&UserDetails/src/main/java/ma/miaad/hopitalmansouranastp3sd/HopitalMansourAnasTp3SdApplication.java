package ma.miaad.hopitalmansouranastp3sd;

import ma.miaad.hopitalmansouranastp3sd.entities.Patient;
import ma.miaad.hopitalmansouranastp3sd.repository.Patientrespositoty;
import ma.miaad.hopitalmansouranastp3sd.security.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
public class HopitalMansourAnasTp3SdApplication implements CommandLineRunner {
    private final Patientrespositoty patientrespositoty;

    public HopitalMansourAnasTp3SdApplication(Patientrespositoty patientrespositoty) {
        this.patientrespositoty = patientrespositoty;
    }


    public static void main(String[] args) {
        SpringApplication.run(HopitalMansourAnasTp3SdApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Anas");
        patient.setDateNaissace(new Date());
        patient.setMalade(false);
        patient.setScore(20);

        Patient patient2 = new Patient(null , "Mansour" , new Date() , false , 14);


        Patient patient3=Patient.builder()
                .nom("SALAH")
                .dateNaissace(new Date())
                .score(33)
                .malade(true)
                .build();

        patientrespositoty.save(patient);
        patientrespositoty.save(patient2);
        patientrespositoty.save(patient3);



    }
    //@Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager  jdbcUserDetailsManager){
        PasswordEncoder passwordEncoder = passwordEncoder();
        return args -> {
            UserDetails u1=jdbcUserDetailsManager.loadUserByUsername("anas");
            if (u1==null)
                jdbcUserDetailsManager.createUser(
                    User.withUsername("Anas").password(passwordEncoder.encode("1234")).roles("USER").build()
            );
            UserDetails u2=jdbcUserDetailsManager.loadUserByUsername("Mansour");
            if (u2==null)
                jdbcUserDetailsManager.createUser(
                    User.withUsername("Mansour").password(passwordEncoder.encode("1234")).roles("USER").build()
            );
            UserDetails u3=jdbcUserDetailsManager.loadUserByUsername("admin2");
            if (u3==null)
                jdbcUserDetailsManager.createUser(
                    User.withUsername("admin2").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
            );


        };
    }
    //@Bean
    CommandLineRunner commandLineRunnerUserDetails(AccountService accountService){
        return args -> {
            accountService.addNewRole("USER");
            accountService.addNewRole("ADMIN");
            accountService.addNewUser("user1","1234","user1@gmail.com","1234");
            accountService.addNewUser("user2","1234","user2@gmail.com","1234");
            accountService.addNewUser("admin","1234","admin@gmail.com","1234");

            accountService.addRoleToUser("user1","USER");
            accountService.addRoleToUser("user2","USER");
            accountService.addRoleToUser("admin","USER");
            accountService.addRoleToUser("admin","ADMIN");


        };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
