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
public class ligaController {
	@Autowired
	private ligarepository repositorys;
	private UsuarioRepository usuariorepository;
	
	@GetMapping("/liga")
	public List<liga> allPersons(){
		return repositorys.findAll();
	}
	@GetMapping("/ligasUsuario/{idusuario}")
	public List<liga> getLiga(@PathVariable Long idusuario) {
		List<liga> liga =repositorys.findAll();
		List<liga> ligausuario=new ArrayList<liga>();
		for(int i=0;i<liga.size();i++) {
			if(liga.get(i).getId_Usuario()==idusuario) {
				ligausuario.add(liga.get(i));
			}
		}		
		return ligausuario;	
	}
	/*
	@GetMapping("/ligadetalle")
	public List<ligaDetalle> allPersonswithname(){
		List<liga> liga =repositorys.findAll();
		List<ligaDetalle> ligadetalle=new ArrayList<ligaDetalle>();
		for(int i=0;i<liga.size();i++) {
			liga ligaselect = liga.get(i);
			//Usuario usuarioselect= new Usuario();
			Usuario usuarioselect= GetUserByID(ligaselect.getId_Usuario());
			ligaDetalle ligadet= new ligaDetalle(ligaselect.getId_Liga(),ligaselect.getId_Usuario(),usuarioselect.getNombre()+" "+usuarioselect.getapellido(),ligaselect.getNombre(),ligaselect.getEstado());
			ligadetalle.add(ligadet);
		}
		return ligadetalle;
		
	}
	public Usuario GetUserByID( Long idUsuario) {
		Usuario usuarioselect = new Usuario();
		UsuarioController usuariocontrol=new UsuarioController();
		//List<Usuario> usuarios =usuariorepository.findAll();
		List<Usuario> usuarios =usuariocontrol.allPersons();
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).getId()==idUsuario) {
				usuarioselect=usuarios.get(i);
				i=usuarios.size();
			}
		}
		
		return usuarioselect;
	}
	*/
	
	@PostMapping("/liga")
	public liga createPerson(@RequestBody liga liga) {
		return repositorys.save(liga);
	}
	@PutMapping("/liga/{id_Liga}")
	public liga updateliga(@PathVariable Long id_Liga ,@RequestBody liga liga) {
		return repositorys.save(liga);
	}
	@DeleteMapping("/liga/{id_Liga}")
	public void deleteSolicitud(@PathVariable("id_Liga") Long id) {
		repositorys.deleteById(id);
	}
	
	
	
	
	
}
