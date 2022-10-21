package com.ligas.api.Controller;
import java.util.*;

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
import com.ligas.api.Controller.*;
@RestController
@RequestMapping("/api")
public class PartidoController {
	@Autowired
	private PartidoRepository PartidoRepositorys;
	private PartidoliveController partidolivecontroller= new PartidoliveController() ;
	
	@GetMapping("/partido")
	public List<Partido> allPersons(){
		return PartidoRepositorys.findAll();
	}
	@GetMapping("/partido/{idpartido}")
	public Partido getPartido(@PathVariable Long idpartido) {
		Partido Partido= new Partido();
		List<Partido> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId_Partido()==idpartido) {
				Partido=lista.get(i);
			}
		}
		return Partido;		
	}
	@PostMapping("/partido")
	public Partido createPerson(@RequestBody Partido Partido) {
		Partido partido= PartidoRepositorys.save(Partido);
		/*Partidolive partidolive=new Partidolive(partido.getId_Partido(),partido.getPaisA(),partido.getPaisB(),partido.getFecha(),partido.getHora());
		
		Partidolive res=partidolivecontroller.createPartidolive(partidolive);
		
		return partido;*/
		return partido;
		
	} 

	@PostMapping("/partido/{id_partido}")
	public Partido updatepartido(@PathVariable Long id_partido ,@RequestBody Partido partido) {
		Partido p= new Partido();
		List<Partido> listp =allPersons();
		for(int i=0;i<listp.size();i++) {
			if(listp.get(i).getId_Partido()==id_partido) {
				p=listp.get(i);
			}
		}
		p.setResA(partido.getResA());
		p.setResB(partido.getResB());

		return PartidoRepositorys.save(p);
	}
	
}
