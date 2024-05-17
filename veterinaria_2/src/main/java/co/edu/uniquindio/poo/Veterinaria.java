package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Veterinaria {

    private String nombre;

    private Collection<Mascota> listaMascotas;

    // CONSTRUCTOR

    public Veterinaria(String nombre) {
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
        return Collections.unmodifiableCollection(listaMascotas);
    }

    public void agregarMascota (Mascota nuevaMascota){

	    assert !verificarMascota(nuevaMascota) : "La mascota no existe";
                
		        listaMascotas.add(nuevaMascota);
	
}

public boolean verificarMascota (Mascota nuevMascota){


    var respuesta = false;

    for (var mascota : listaMascotas){

        if (mascota.ID() == nuevMascota.ID()) {

            respuesta = true;


            
        }
    }
    return respuesta;
    }

    public List listaMayoresDe10(){

        List listaMayores = new LinkedList<>();

        for (var mascota : listaMascotas){

            if (mascota.ID() > 10) {
                

                listaMayores.add(mascota);
            }
        }
        return listaMayores;
    }
}