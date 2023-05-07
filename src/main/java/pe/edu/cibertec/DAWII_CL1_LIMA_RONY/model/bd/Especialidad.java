package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    private String idesp;

    @Column(name = "nomesp")
    private String nomesp;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alumno> listaalumno = new ArrayList<>();
}
