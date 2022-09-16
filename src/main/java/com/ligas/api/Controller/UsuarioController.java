package com.ligas.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ligas.api.model.Usuario;
import com.ligas.api.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	@Autowired
	private UsuarioRepository repositorys;
	
	
	@GetMapping("/usuario")
	public List<Usuario> allPersons(){
		return repositorys.findAll();
	}
	/*@GetMapping("/usuario/{name}")
	public List<Usuario> findByname(@PathVariable("name") String name) {
		return repositorys.findByName(name);
	}*/
	
	@PostMapping("/usuario")
	public Usuario createPerson(@RequestBody Usuario usuario) {
		return repositorys.save(usuario);
	}
	
	@PutMapping("/usuario/{idUsuario}")
	public Usuario updatePerson(@PathVariable int idUsuario ,@RequestBody Usuario usuario) {
		return repositorys.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id_Usuario}")
	public void deletePerson(@PathVariable("id_Usuario") Long id) {
		repositorys.deleteById(id);
	}

}
