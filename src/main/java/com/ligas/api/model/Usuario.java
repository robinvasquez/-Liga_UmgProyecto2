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
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idUsuario;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Correo")
	private String correo;
	
	@Column(name = "Clave")
	private String clave;
	
	@Column(name = "Avatar")
	private String avatar;
	
	@Column(name = "Estado")
	private String estado;
	
	public Usuario() {

	}

	public Usuario(String id,String nombre, String apellido, String correo, String clave, String avatar, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.clave = clave;
		this.avatar = avatar;
		this.estado = estado;
	}
	
	public String getId() {
		return idUsuario;
	}

	public void setId(String id) {
		this.idUsuario = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public String getcorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Correo=" + correo +", Clave=" + clave +", Avatar=" + avatar +", Estado=" + estado + "]";
	}
}
