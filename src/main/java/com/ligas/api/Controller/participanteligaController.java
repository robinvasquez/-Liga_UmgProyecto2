package com.ligas.api.Controller;
import java.util.ArrayList;
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
	
	@GetMapping("/participantesliga/{idLiga}")
	public List<participanteliga> getParticipantes(@PathVariable Long idLiga) {
		List<participanteliga> participantes =repositorys.findAll();
		List<participanteliga> participantes2=new ArrayList<participanteliga>();
		for(int i=0;i<participantes.size();i++) {
			if(participantes.get(i).getId_Liga()==idLiga) {
				participantes2.add(participantes.get(i));
			}
		}		
		return participantes2;	
	}
	
	@GetMapping("/ligasquepertenezco/{idUsuario}")
	public List<participanteliga> getMisLigas(@PathVariable Long idUsuario) {
		List<participanteliga> misligas =repositorys.findAll();
		List<participanteliga> misligas2=new ArrayList<participanteliga>();
		for(int i=0;i<misligas.size();i++) {
			if(misligas.get(i).getId_Usuario()==idUsuario) {
				misligas2.add(misligas.get(i));
			}
		}		
		return misligas2;	
	}
	
	@PostMapping("/participante")
	public participanteliga createPerson(@RequestBody participanteliga participanteliga) {
		return repositorys.save(participanteliga);
	}
	@PutMapping("/participante/{id_ParticipanteLiga}")
	public participanteliga updateParticipante(@PathVariable Long id_ParticipanteLiga ,@RequestBody participanteliga participanteliga) {
		return repositorys.save(participanteliga);
	}
	@DeleteMapping("/participante/{id_ParticipanteLiga}")
	public void deleteSolicitud(@PathVariable("id_ParticipanteLiga") Long id) {
		repositorys.deleteById(id);
	}
	
	
	
	
	
}
