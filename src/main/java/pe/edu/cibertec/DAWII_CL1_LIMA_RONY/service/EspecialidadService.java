package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Especialidad;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository.EspecialidadRepository;

import java.util.List;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> listarEspecialidades(){
        return especialidadRepository.findAll();
    }

    public void registrarEstado(Especialidad especialidad){
        especialidadRepository.save(especialidad);
    }

    public void eliminarEstado(Especialidad especialidad){especialidadRepository.deleteById(especialidad.getIdesp());
    }

}
