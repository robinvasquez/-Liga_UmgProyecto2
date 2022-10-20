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
import com.ligas.api.Controller.*;
@RestController
@RequestMapping("/api")
public class PrediccionJugadorController {
	@Autowired
	private PrediccionJugadorRepository PrediccionJugadorRepository;
	@GetMapping("/prediccionJ")
	public List<PrediccionJugador> allPersons(){
		return PrediccionJugadorRepository.findAll();
	}
	@GetMapping("/prediccionJ/{id_Prediccion}")
	public PrediccionJugador getprediccion(@PathVariable Long id_Prediccion) {
		PrediccionJugador PrediccionJugador= new PrediccionJugador();
		List<PrediccionJugador> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId_Prediccion()==id_Prediccion) {
				PrediccionJugador=lista.get(i);
			}
		}
		return PrediccionJugador;		
	}
}
