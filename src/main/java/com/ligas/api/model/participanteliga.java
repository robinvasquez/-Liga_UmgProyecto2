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
@Table(name = "participanteliga")
@EntityListeners(AuditingEntityListener.class)

public class participanteliga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_ParticipanteLiga;
	@Column(name = "Id_Liga")
	private String id_Liga;
	@Column(name = "Id_Usuario")
	private String id_Usuario;
	@Column(name = "Estado")
	private String Estado;
	
	public participanteliga() {

	}
	public participanteliga(String id,String id_Liga, String id_Usuario, String Estado) {
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	public String getId_ParticipanteLiga() {
		return id_ParticipanteLiga;
	}
	public void setId_ParticipanteLiga(String id_ParticipanteLiga) {
		this.id_ParticipanteLiga = id_ParticipanteLiga;
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
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "participanteliga [id_ParticipanteLiga=" + id_ParticipanteLiga + ", id_Liga=" + id_Liga + ", id_Usuario="
				+ id_Usuario + ", Estado=" + Estado + "]";
	}
	
	
	
	
	
	

}
