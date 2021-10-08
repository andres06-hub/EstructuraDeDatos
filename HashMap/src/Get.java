import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class Get {
    public static void main(String[] args) {

        // METODO -> get()

        // creacion del HashMap
        // Esto funciona para cualquier numero de elementos
        // Dentro del HashMap ingresamos un Map
        HashMap<String, String> capitales = new HashMap<>(
                Map.ofEntries(entry("Colombia", "Bogota"), entry("Mexico", "CDMX")));

        // Metodo para acceder a un elemento

        String valor = capitales.get("Colombia");
        // Se accede a la Key pero lo que me devuelve es el valor
        // Accedo a la clave para que me devuelva el valor

        // Se imprime el valor obtenidoa
        System.out.println(valor); // Obtenemos el valor de la Key
    }

}
