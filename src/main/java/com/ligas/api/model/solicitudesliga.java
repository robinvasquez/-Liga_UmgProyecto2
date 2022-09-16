package com.ligas.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "solicitudesliga")
@EntityListeners(AuditingEntityListener.class)
public class solicitudesliga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_Solicitudesliga;
	
	@Column(name = "Id_Liga")
	private String id_Liga;
	
	@Column(name = "Id_Usuario")
	private String id_Usuario;
	
	@Column(name = "Estado")
	private String Estado;
	
	
	public solicitudesliga() {

	}

	public solicitudesliga(String id,String id_Liga, String id_Usuario, String Estado) {
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	
	public String getId() {
		return id_Solicitudesliga;
	}

	public void setId(String id_Solicitudesliga) {
		this.id_Solicitudesliga = id_Solicitudesliga;
	}

	public String getIdliga() {
		return id_Liga;
	}
	
	public void setIdliga(String id_Liga) {
		this.id_Liga = id_Liga;
	}

	public String getIdUsuario() {
		return id_Usuario;
	}
	
	public void setIdUsuario(String id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String Estado) {
		this.Estado = Estado;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [id_Solicitudesliga=" + id_Solicitudesliga + ", id_Liga=" + id_Liga + ", id_Usuario=" + id_Usuario + ", Estado=" + Estado + "]";
	}	
}