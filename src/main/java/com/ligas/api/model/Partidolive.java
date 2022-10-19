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
@Table(name = "partidolive")
@EntityListeners(AuditingEntityListener.class)
public class Partidolive {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Partidolive;
	
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
	
	public Partidolive() {
	}
	
	public Partidolive(Long id_Partidolive,String paisA,String paisB,String fecha,String hora) {
		this.id_Partidolive=id_Partidolive;
		this.paisA =paisA ;
		this.paisB = paisB;
		this.fecha =fecha ;
		this.hora = hora;
	}
	public Partidolive(String paisA,String paisB,String fecha,String hora) {
		this.paisA =paisA ;
		this.paisB = paisB;
		this.fecha =fecha ;
		this.hora = hora;
	}
	public Long getId_Partidolive() {
		return id_Partidolive;
	}

	public void setId_Partidolive(Long id_Partido) {
		this.id_Partidolive = id_Partido;
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
	
	@Override
	public String toString() {
		return "Partidolive [id_Partidolive=" + id_Partidolive + ", paisA=" + paisA + ", paisbB=" + paisB + ", fecha=" + fecha + ", hora=" + hora
				+ "]";
	}
}
