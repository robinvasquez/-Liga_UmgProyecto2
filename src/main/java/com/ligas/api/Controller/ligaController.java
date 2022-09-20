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

import com.ligas.api.model.liga;
import com.ligas.api.model.solicitudesliga;
import com.ligas.api.repository.ligarepository;
import com.ligas.api.repository.solicitudesligaRepository;
@RestController
@RequestMapping("/api")
public class ligaController {
	@Autowired
	private ligarepository repositorys;
	@GetMapping("/liga")
	public List<liga> allPersons(){
		return repositorys.findAll();
	}
	@PostMapping("/liga")
	public liga createPerson(@RequestBody liga liga) {
		return repositorys.save(liga);
	}
	@PutMapping("/liga/{id_Liga}")
	public liga updateliga(@PathVariable int id_Liga ,@RequestBody liga liga) {
		return repositorys.save(liga);
	}
	@DeleteMapping("/liga/{id_Liga}")
	public void deleteSolicitud(@PathVariable("id_Liga") Long id) {
		repositorys.deleteById(id);
	}
	
	
	
	
	
}
