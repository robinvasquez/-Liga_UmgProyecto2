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
	private Long id_Solicitudesliga;
	
	@Column(name = "Id_Liga")
	private Long id_Liga;
	
	@Column(name = "Id_Usuario")
	private Long id_Usuario;
	
	@Column(name = "Estado")
	private Long Estado;
	
	
	public solicitudesliga() {

	}

	public solicitudesliga(Long id,Long id_Liga, Long id_Usuario, Long Estado) {
		this.id_Solicitudesliga=id;
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	public solicitudesliga(Long id_Liga, Long id_Usuario, Long Estado) {
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	
	public Long getId() {
		return id_Solicitudesliga;
	}

	public void setId(Long id_Solicitudesliga) {
		this.id_Solicitudesliga = id_Solicitudesliga;
	}

	public Long getIdliga() {
		return id_Liga;
	}
	
	public void setIdliga(Long id_Liga) {
		this.id_Liga = id_Liga;
	}

	public Long getIdUsuario() {
		return id_Usuario;
	}
	
	public void setIdUsuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	
	public Long getEstado() {
		return Estado;
	}
	
	public void setEstado(Long Estado) {
		this.Estado = Estado;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [id_Solicitudesliga=" + id_Solicitudesliga + ", id_Liga=" + id_Liga + ", id_Usuario=" + id_Usuario + ", Estado=" + Estado + "]";
	}	
}