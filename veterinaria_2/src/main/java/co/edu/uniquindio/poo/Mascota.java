package co.edu.uniquindio.poo;

    public record Mascota(int ID,int edad, double peso, String color, String nombre, String especie, String raza, String genero) {

        public Mascota{

            assert nombre != null && nombre != "":"no se permiten datos vacios o nulos";
            assert color != null && color != "" :"no se permiten datos vacios o nulos";
            assert especie != null && especie != "":"no se permiten datos vaios o nulos";
            assert raza != null && raza != "":"no se permiten datos vacios o nulos";
            assert genero != null && genero != "":"no se permiten datos vacios o nulos";
            assert edad > 0 && edad < 100:"no se permite edades negativas o mayores a 100";
            assert peso > 0 && peso < 100: "no se permite pesos negativos o mayores a 100";


    }

    
}