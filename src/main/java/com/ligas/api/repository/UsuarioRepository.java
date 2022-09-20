package com.ligas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ligas.api.model.Usuario;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
