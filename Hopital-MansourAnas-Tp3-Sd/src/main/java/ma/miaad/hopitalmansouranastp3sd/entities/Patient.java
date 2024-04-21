package ma.miaad.hopitalmansouranastp3sd.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotEmpty
    @Size(min = 3, max = 30)
    private String nom;
    private Date dateNaissace ;
    private  boolean malade;
    @DecimalMin("10")
    private int score;
}
