package com.projectAlex.mgb.Security.Service;

import com.projectAlex.mgb.Security.Enums.RolNombre;
import com.projectAlex.mgb.Security.Repository.IRolRepository;
import com.projectAlex.mgb.Security.entity.Rol;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired 
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
