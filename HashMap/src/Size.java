
import java.util.HashMap;


public class Size {
    public static void main(String[] args) {

        
        // Creamos el HaspMap es muy parecido a la creacion de los (Array , ArrayLisrt)
        HashMap<String, String> capitales = new HashMap<>();
        
        // Con el metodo .put() se agrega elementos al HashMap
        capitales.put("Colombia", "Bogota");
        capitales.put("Ecuador", "Quito");
        capitales.put("Mexico", "CDMX");
        capitales.put("Peru", "Lima");
        capitales.put("Venezuela", "Caracas");
        
        // METODO -> size()
        
        // Para saber cuantos elementos hay
        double elementos = capitales.size();

        System.out.println(elementos);
    }

}
