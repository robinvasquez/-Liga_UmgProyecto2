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
@Table(name = "liga")
@EntityListeners(AuditingEntityListener.class)
public class liga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Liga;
	
	@Column(name = "id_Usuario")
	private Long id_Usuario;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Estado")
	private Long Estado;
	
	
	public liga() {
		
	}
	public liga(Long id,Long id_Usuario, String Nombre, Long Estado) {
		this.id_Liga=id;
		this.id_Usuario = id_Usuario;
		this.Nombre = Nombre;
		this.Estado = Estado;
	}
	public liga(Long id_Usuario, String Nombre, Long Estado) {
		this.id_Usuario = id_Usuario;
		this.Nombre = Nombre;
		this.Estado = Estado;
	}
	
	
	public Long getId_Liga() {
		return id_Liga;
	}
	public void setId_Liga(Long id_Liga) {
		this.id_Liga = id_Liga;
	}
	public Long getId_Usuario() {
		return id_Usuario;
	}
	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Long getEstado() {
		return Estado;
	}
	public void setEstado(Long estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "liga [id_Liga=" + id_Liga + ", id_Usuario=" + id_Usuario + ", Nombre=" + Nombre + ", Estado=" + Estado
				+ "]";
	}
	
	
	
	

}
