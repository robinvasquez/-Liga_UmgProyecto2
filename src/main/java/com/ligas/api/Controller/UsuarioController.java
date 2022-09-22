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
	
	public  UsuarioController() {
		
	}
	
	
	@GetMapping("/usuario")
	public List<Usuario> allPersons(){
		return repositorys.findAll();
	}
	
	/*@GetMapping("/usuario/{name}")
	public List<Usuario> findByname(@PathVariable("name") String name) {
		return repositorys.findByName(name);
	}*/
	@GetMapping("/usuario/{idusuario}")
	public Usuario getUserbyid(@PathVariable Long idusuario) {
		Usuario usuario= new Usuario();
		List<Usuario> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId()==idusuario) {
				usuario=lista.get(i);
			}
		}
		return usuario;		
	}
	
	
	@PostMapping("/usuario")
	public Usuario createPerson(@RequestBody Usuario usuario) {
		return repositorys.save(usuario);
	}
	@PostMapping("/usuario/{correo}/{clave}")
	public Usuario valMail(@PathVariable String correo,@PathVariable String clave) {
		Usuario usuario;
		usuario= new Usuario();
		//String respuesta="false";
		String correolista="";
		String clavelista="";
		List<Usuario> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			correolista=lista.get(i).getcorreo();
			if(correo.equals(correolista)) {
				clavelista=lista.get(i).getClave();
				if(clave.equals(clavelista)) {
					//respuesta="true,"+lista.get(i).toString();
					usuario=lista.get(i);
					i=lista.size();
							
				}
			}
		}
		return usuario;
	}
	
	@PutMapping("/usuario/{idUsuario}")
	public Usuario updatePerson(@PathVariable Long idUsuario ,@RequestBody Usuario usuario) {
		return repositorys.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id_Usuario}")
	public void deletePerson(@PathVariable("id_Usuario") Long id) {
		repositorys.deleteById(id);
	}

}
