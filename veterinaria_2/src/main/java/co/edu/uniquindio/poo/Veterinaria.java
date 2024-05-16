package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Veterinaria {

    private String nombre;

    private Collection<Mascota> listaMascotas;

    // CONSTRUCTOR

    public Veterinaria(String nombre, Collection<Mascota> listaMascotas) {
        this.nombre = nombre;
        this.listaMascotas = new LinkedList<>();

        assert nombre != null && nombre != "":"no se permiten datos vacios o nulos";
        
        
    }


    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public String agregarMascota (Mascota nuevaMascota, Collection<Mascota> listaMascota){

	String mensaje = "";

	for (Mascota mascota : listaMascotas){

		if(mascota.ID() == nuevaMascota.getID()){
		
		mensaje = "La mascota ya existe";

		return mensaje;

		}

		else {

		listaMascota.add(nuevaMascota);
		
		mensaje = "La mascota fue anadida con exito";

		}

	}
		return mensaje;
	
}
}