package com.ligas.api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.ligas.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
