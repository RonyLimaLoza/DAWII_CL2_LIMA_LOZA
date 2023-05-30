package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Rol;

@Repository
public interface RolRepository {
    Rol findByNomrol(String nomrol);
}
