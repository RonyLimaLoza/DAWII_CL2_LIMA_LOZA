package pe.edu.cibertec.DAWII_CL1_LIMA_RONY.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Rol;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.model.bd.Usuario;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository.RolRepository;
import pe.edu.cibertec.DAWII_CL1_LIMA_RONY.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder
            = new BCryptPasswordEncoder();

    public Usuario buscarUsuarioPorNomusuario(String nomUsuario){
        return usuarioRepository.findByNomusuario(nomUsuario);
    }

    public Usuario guardarUsuario(Usuario usuario){
        usuario.setPassusuario(bCryptPasswordEncoder
                .encode(usuario.getPassusuario()));
        Rol rol = rolRepository.findByNomrol("ADMIN");
        usuario.setRoles(new HashSet<>(Arrays.asList(rol)));
        return usuarioRepository.save(usuario);
    }
}
