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
import com.ligas.api.model.solicitudesliga;
import com.ligas.api.repository.UsuarioRepository;
import com.ligas.api.repository.solicitudesligaRepository;

@RestController
@RequestMapping("/api")
public class solicitudesligaController {
	@Autowired
	private solicitudesligaRepository repositorys;
	
	@GetMapping("/solicitud")
	public List<solicitudesliga> allPersons(){
		return repositorys.findAll();
	}
	@PostMapping("/solicitud")
	public solicitudesliga createPerson(@RequestBody solicitudesliga solicitudesliga) {
		return repositorys.save(solicitudesliga);
	}
	@PutMapping("/solicitud/{id_Solicitudesliga}")
	public solicitudesliga updateSolicitud(@PathVariable Long id_Solicitudesliga ,@RequestBody solicitudesliga solicitudesliga) {
		return repositorys.save(solicitudesliga);
	}
	@DeleteMapping("/solicitud/{id_Solicitudesliga}")
	public void deleteSolicitud(@PathVariable("id_Solicitudesliga") Long id) {
		repositorys.deleteById(id);
	}
	
	
	
	

}
