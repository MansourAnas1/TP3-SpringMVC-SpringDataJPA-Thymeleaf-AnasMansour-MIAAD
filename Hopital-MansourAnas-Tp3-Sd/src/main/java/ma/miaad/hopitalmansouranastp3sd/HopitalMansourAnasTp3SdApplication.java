package ma.miaad.hopitalmansouranastp3sd;

import ma.miaad.hopitalmansouranastp3sd.entities.Patient;
import ma.miaad.hopitalmansouranastp3sd.repository.Patientrespositoty;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
