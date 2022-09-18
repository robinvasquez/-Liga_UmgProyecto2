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

import com.ligas.api.model.participanteliga;
import com.ligas.api.model.solicitudesliga;
import com.ligas.api.repository.participanteligaRepository;
import com.ligas.api.repository.solicitudesligaRepository;

@RestController
@RequestMapping("/api")
public class participanteligaController {

	@Autowired
	private participanteligaRepository repositorys;
	
	@GetMapping("/participante")
	public List<participanteliga> allPersons(){
		return repositorys.findAll();
	}
	@PostMapping("/participante")
	public participanteliga createPerson(@RequestBody participanteliga participanteliga) {
		return repositorys.save(participanteliga);
	}
	@PutMapping("/participante/{id_ParticipanteLiga}")
	public participanteliga updateParticipante(@PathVariable int id_ParticipanteLiga ,@RequestBody participanteliga participanteliga) {
		return repositorys.save(participanteliga);
	}
	@DeleteMapping("/participante/{id_ParticipanteLiga}")
	public void deleteSolicitud(@PathVariable("id_ParticipanteLiga") Long id) {
		repositorys.deleteById(id);
	}
	
	
	
	
	
}
