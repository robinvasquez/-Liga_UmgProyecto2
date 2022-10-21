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

import com.ligas.api.model.Usuario;
import com.ligas.api.model.participanteliga;
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
	@GetMapping("/missolicitudes/{idUsuario}")
	public List<solicitudesliga> getMisSolicitudes(@PathVariable Long idUsuario) {
		List<solicitudesliga> missolicitudes =repositorys.findAll();
		List<solicitudesliga> missolicitudes2=new ArrayList<solicitudesliga>();
		for(int i=0;i<missolicitudes.size();i++) {
			if(missolicitudes.get(i).getIdUsuario().equals(idUsuario)) {
				missolicitudes2.add(missolicitudes.get(i));
			}
		}		
		return missolicitudes2;	
	}
	@GetMapping("/solicitudesliga/{idliga}")
	public List<solicitudesliga> getSolicitudesLiga(@PathVariable Long idliga) {
		List<solicitudesliga> solicitudesliga =repositorys.findAll();
		List<solicitudesliga> solicitudesliga2=new ArrayList<solicitudesliga>();
		for(int i=0;i<solicitudesliga.size();i++) {
			if(solicitudesliga.get(i).getIdliga().equals(idliga)) {
				if(solicitudesliga.get(i).getEstado()==0) {
					solicitudesliga2.add(solicitudesliga.get(i));
				}
				
				
			}
		}		
		return solicitudesliga2;	
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
