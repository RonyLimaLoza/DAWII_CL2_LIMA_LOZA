package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Especialidad;

@Repository
public interface EspecialidadRepository
        extends JpaRepository<Especialidad, String> {
}
