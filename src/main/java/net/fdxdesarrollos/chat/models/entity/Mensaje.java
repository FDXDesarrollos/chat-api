package net.fdxdesarrollos.chat.models.entity;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String texto;
	private Date fecha;
	private String usuario;
	private String tipo;
	private String color; 
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
