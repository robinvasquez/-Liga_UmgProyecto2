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

import com.ligas.api.model.*;
import com.ligas.api.repository.*;
@RestController
@RequestMapping("/api")
public class PartidoliveController {
	
	@Autowired
	private PartidoliveRepository PartidoliveRepositorys;
	
	public PartidoliveController() {
	}
	
	@GetMapping("/partidolive")
	public List<Partidolive> allPersons(){
		return PartidoliveRepositorys.findAll();
	}
	@GetMapping("/partidolive/{idpartidolive}")
	public Partidolive getLigabyid(@PathVariable Long idpartidolive) {
		Partidolive Partido= new Partidolive();
		List<Partidolive> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId_Partidolive().equals(idpartidolive)) {
				Partido=lista.get(i);
			}
		}
		return Partido;		
	}
	@PostMapping("/partidolive")
	public Partidolive createPerson(@RequestBody Partidolive Partido) {
		return PartidoliveRepositorys.save(Partido);
	} 
	
	@PutMapping("/partidolive/{id_partidolive}")
	public Partidolive updatepartidolive(@PathVariable Long id_partido ,@RequestBody Partidolive partido) {
		return PartidoliveRepositorys.save(partido);
	}
	
	public Partidolive createPartidolive(Partidolive Partido) {
		return PartidoliveRepositorys.save(Partido);
	} 

}
