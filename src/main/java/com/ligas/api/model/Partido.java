package com.ligas.api.model;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "partido")
@EntityListeners(AuditingEntityListener.class)
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Partido;
	
	@Column(name = "paisA")
	private String paisA;
	
	@Column(name = "resA")
	private Long resA;
	
	@Column(name = "paisB")
	private String paisB;
	
	@Column(name = "resB")
	private Long resB;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "hora")
	private String hora;
	
	@Column(name = "estado")
	private Integer estado;
	


	public Partido() {
	}
	
	public Partido(Integer id_Partido,String paisA,String paisB,String fecha,String hora, Integer estado) {
		this.id_Partido=id_Partido;
		this.paisA =paisA ;
		this.paisB = paisB;
		this.fecha =fecha ;
		this.hora = hora;
		this.estado = estado;
	}
	public Partido(String paisA,String paisB,String fecha,String hora) {
		this.paisA =paisA ;
		this.paisB = paisB;
		this.fecha =fecha ;
		this.hora = hora;
		this.estado=0;
	}
	public Integer getId_Partido() {
		return id_Partido;
	}

	public void setId_Partido(Integer id_Partido) {
		this.id_Partido = id_Partido;
	}

	public String getPaisA() {
		return paisA;
	}

	public void setPaisA(String paisA) {
		this.paisA = paisA;
	}

	public Long getResA() {
		return resA;
	}

	public void setResA(Long resA) {
		this.resA = resA;
	}

	public String getPaisB() {
		return paisB;
	}

	public void setPaisB(String paisB) {
		this.paisB = paisB;
	}

	public Long getResB() {
		return resB;
	}

	public void setResB(Long resB) {
		this.resB = resB;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Partido [id_Partido=" + id_Partido + ", paisA=" + paisA + ", paisbB=" + paisB + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado
				+ "]";
	}
	
}
