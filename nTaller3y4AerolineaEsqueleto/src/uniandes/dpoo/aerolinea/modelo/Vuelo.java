package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	public Ruta ruta;
	public Avion avion;
	
	
	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		super();
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	
	
	public String getFecha() {
		return fecha;
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return null;
	}
	
	public boolean equals(Object obj) {
		return false;
	}

}
