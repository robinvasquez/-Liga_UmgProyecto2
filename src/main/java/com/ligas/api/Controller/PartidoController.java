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
@RestController
@RequestMapping("/api")
public class PartidoController {
	@Autowired
	private PartidoRepository PartidoRepositorys;
	
	@GetMapping("/partido")
	public List<Partido> allPersons(){
		return PartidoRepositorys.findAll();
	}
	@GetMapping("/partido/{idpartido}")
	public Partido getLigabyid(@PathVariable Long idpartido) {
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
		return PartidoRepositorys.save(Partido);
	} 
	
}
