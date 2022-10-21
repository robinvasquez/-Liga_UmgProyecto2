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
@Table(name = "prediccion")
@EntityListeners(AuditingEntityListener.class)
public class Prediccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Prediccion;
	

	@Column(name = "id_Partido")
	private Integer id_Partido;
	
	@Column(name = "id_Usuario")
	private Long id_Usuario;
	
	@Column(name = "resA")
	private Long resA;
	
	@Column(name = "resB")
	private Long resB;
	
	@Column(name = "puntos")
	private Long puntos;
	
	public Prediccion() {
	}
	
	public Prediccion(Integer id_Partido, Long id_Usuario, Long resA, Long resB, Long puntos) {
		this.id_Partido =id_Partido;
		this.id_Usuario =id_Usuario;
		this.resA =resA;
		this.resB =resB;
		this.puntos =puntos;
	}
	
	public Long getId_Prediccion() {
		return id_Prediccion;
	}

	public void setId_Prediccion(Long id_Prediccion) {
		this.id_Prediccion = id_Prediccion;
	}

	public Integer getId_Partido() {
		return id_Partido;
	}

	public void setId_Partido(Integer id_Partido) {
		this.id_Partido = id_Partido;
	}

	public Long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public Long getResA() {
		return resA;
	}

	public void setResA(Long resA) {
		this.resA = resA;
	}

	public Long getResB() {
		return resB;
	}

	public void setResB(Long resB) {
		this.resB = resB;
	}

	public Long getPuntos() {
		return puntos;
	}

	public void setPuntos(Long puntos) {
		this.puntos = puntos;
	}


	@Override
	public String toString() {
		return "Prediccion [id_Prediccion=" + id_Prediccion + ", id_Partido=" + id_Partido + ", id_Usuario="
				+ id_Usuario + ", resA=" + resA + ", resB=" + resB + ", puntos=" + puntos + "]";
	}
}
