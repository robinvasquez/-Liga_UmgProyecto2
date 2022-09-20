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
	private Long id_ParticipanteLiga;
	@Column(name = "Id_Liga")
	private Long id_Liga;
	@Column(name = "Id_Usuario")
	private Long id_Usuario;
	@Column(name = "Estado")
	private Long Estado;
	
	public participanteliga() {

	}
	public participanteliga(Long id,Long id_Liga, Long id_Usuario, Long Estado) {
		this.id_ParticipanteLiga=id;
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	public participanteliga(Long id_Liga, Long id_Usuario, Long Estado) {
		this.id_Liga = id_Liga;
		this.id_Usuario = id_Usuario;
		this.Estado = Estado;
	}
	public Long getId_ParticipanteLiga() {
		return id_ParticipanteLiga;
	}
	public void setId_ParticipanteLiga(Long id_ParticipanteLiga) {
		this.id_ParticipanteLiga = id_ParticipanteLiga;
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
	public Long getEstado() {
		return Estado;
	}
	public void setEstado(Long estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "participanteliga [id_ParticipanteLiga=" + id_ParticipanteLiga + ", id_Liga=" + id_Liga + ", id_Usuario="
				+ id_Usuario + ", Estado=" + Estado + "]";
	}
	
	
	
	
	
	

}
