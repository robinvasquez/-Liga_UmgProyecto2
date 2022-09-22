package com.ligas.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@EntityListeners(AuditingEntityListener.class)
public class ligaDetalle {
	private Long idligadetalle;
	private Long idUsuario;
	private String Usuario;
	private String NombreLiga;
	private Long estado;
	
	public ligaDetalle() {
		
	}
	public ligaDetalle(Long idligadetalle, Long idUsuario,String Usuario, String NombreLiga, Long estado) {
		this.idligadetalle=idligadetalle;
		this.idUsuario=idUsuario;
		this.Usuario=Usuario;
		this.NombreLiga=NombreLiga;
		this.estado=estado;
	}
	@Override
	public String toString() {
		return "liga [id_Liga=" + idligadetalle + ", id_Usuario=" + idUsuario + ", Usuario=" + Usuario+ ", nombre=" + NombreLiga + ", estado=" + estado
				+ "]";
	}
}
