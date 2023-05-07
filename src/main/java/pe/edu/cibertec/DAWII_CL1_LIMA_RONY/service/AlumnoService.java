package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Alumno;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumnos(){
        return alumnoRepository.findAll();
    }
    public void registrarAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }
    public void eliminarAlumno(String idalumno){
        alumnoRepository.deleteById(idalumno);
    }
}
