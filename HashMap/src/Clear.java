import java.util.HashMap;

public class Clear {
    public static void main(String[] args) {

        
        HashMap<String, Integer> edades = new HashMap<>();
        
        // Agregamos datos al HashMap
        edades.put("Juan", 18);
        edades.put("Andres", 22);
        
        System.out.println(edades);
        // METODO -> clear()

        // Este metodo nos sirve para limpiar todo el HashMap
        // Eliminar todos los elementos que hay en él

        // Eliminamos todos los datos del HashMap
        edades.clear();
        System.out.println(edades);

    }
}
