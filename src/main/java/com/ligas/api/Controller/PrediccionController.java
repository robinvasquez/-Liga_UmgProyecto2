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
public class PrediccionController {
	@Autowired
	private PrediccionRepository PrediccionRepository;
	
	@GetMapping("/prediccion")
	public List<Prediccion> allPersons(){
		return PrediccionRepository.findAll();
	}
	
	@GetMapping("/prediccion/{id_prediccion}")
	public Prediccion getprediccion(@PathVariable Long id_prediccion) {
		Prediccion Prediccion= new Prediccion();
		List<Prediccion> lista =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId_Prediccion().equals(id_prediccion)) {
				Prediccion=lista.get(i);
			}
		}
		return Prediccion;		
	}
	@PostMapping("/prediccion")
	public Prediccion createPerson(@RequestBody Prediccion Prediccio) {
		Prediccion Prediccion= PrediccionRepository.save(Prediccio);
		return Prediccion;		
	} 

	@PostMapping("/prediccion/{id_prediccion}")
	public Prediccion updatePrediccion(@PathVariable Long id_prediccion ,@RequestBody Prediccion Prediccion) {
		
		Prediccion p= new Prediccion();
		List<Prediccion> listp =allPersons();
		for(int i=0;i<listp.size();i++) {
			if(listp.get(i).getId_Prediccion().equals(id_prediccion)) {
				p=listp.get(i);
			}
		}
		p.setResB(Prediccion.getPuntos());

		return PrediccionRepository.save(p);
	}
	
	@GetMapping("/prediccionporpartido/{id_Partido}")
	public List<Prediccion> getprediccionporpartido(@PathVariable Long id_Partido) {
		Integer x=id_Partido.intValue();
		List<Prediccion> lista =allPersons();
		List<Prediccion> listaparticipantes =allPersons();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getId_Partido().equals(x)) {
				listaparticipantes.add(lista.get(i));
			}
		}
		return listaparticipantes;		
	}

}