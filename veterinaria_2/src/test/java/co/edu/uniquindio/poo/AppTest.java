/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }


@Test

    public void datosCompletos(){

        Mascota mascota1 = new Mascota(1, 12, 9.0, "Cafe", "Toby", "Canino", "Husky", "Masculino");   

        assertEquals(mascota1.edad(), 12);
        assertEquals(mascota1.peso(), 9.0);
        assertEquals(mascota1.color(), "Cafe");
        assertEquals(mascota1.nombre(), "Toby");
        assertEquals(mascota1.especie(), "Canino");
        assertEquals(mascota1.raza(), "Husky");
        assertEquals(mascota1.genero(), "Masculino");

    }

@Test

    public void agregarMascota(){

        Veterinaria veterinaria = new Veterinaria("Amigos Peludos");

        Mascota mascota1 = new Mascota(1, 9, 20.0, "Plata", "Kira", "Canino", "Husky", "Femenino");
        
        veterinaria.agregarMascota(mascota1);

                assertEquals(1, veterinaria.getListaMascotas().size());


        System.out.println(veterinaria.getListaMascotas());


    }

@Test

    public void veterinariaNula(){

       
        
        assertThrows(Throwable.class, ()->new Veterinaria(null));

    
    }

@Test

    public void agregarMascotaRepetida(){

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");

        Mascota mascota1 = new Mascota(1, 21, 17.0, "Cafe", "Carlos", "Canino", "Pincher", "Masculino");
        Mascota mascota2 = new Mascota(1, 21, 17.0, "Cafe", "Carlos", "Canino", "Pincher", "Masculino");


        veterinaria.agregarMascota(mascota1);

        assertThrows(Throwable.class, ()->veterinaria.agregarMascota(mascota2));

        
        assertEquals(1, veterinaria.getListaMascotas().size());

    }

    @Test

    public void listaMayoresDe10(){

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");

        Mascota mascota1 = new Mascota(11, 21, 17.0, "Cafe", "Carlos", "Canino", "Pincher", "Masculino");
        Mascota mascota2 = new Mascota(9, 21, 17.0, "Cafe", "Carlos", "Canino", "Pincher", "Masculino");


        veterinaria.agregarMascota(mascota1);

        veterinaria.agregarMascota(mascota2);



        
        assertEquals(1, veterinaria.listaMayoresDe10().size());

    }
}



