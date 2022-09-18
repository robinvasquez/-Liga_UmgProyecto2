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
	private String id_Liga;
	
	@Column(name = "id_Usuario")
	private String id_Usuario;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Estado")
	private String Estado;
	
	
	public liga() {
		
	}
	public liga(String id,String id_Usuario, String Nombre, String Estado) {
		this.id_Usuario = id_Usuario;
		this.Nombre = Nombre;
		this.Estado = Estado;
	}
	
	
	public String getId_Liga() {
		return id_Liga;
	}
	public void setId_Liga(String id_Liga) {
		this.id_Liga = id_Liga;
	}
	public String getId_Usuario() {
		return id_Usuario;
	}
	public void setId_Usuario(String id_Usuario) {
		this.id_Usuario = id_Usuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "liga [id_Liga=" + id_Liga + ", id_Usuario=" + id_Usuario + ", Nombre=" + Nombre + ", Estado=" + Estado
				+ "]";
	}
	
	
	
	

}
