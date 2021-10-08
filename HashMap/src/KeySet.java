import java.util.HashMap;

public class KeySet {
    public static void main(String[] args) {

        

        // Creamos el HaspMap es muy parecido a la creacion de los (Array , ArrayList)
        HashMap<String, String> capitales = new HashMap<>();
        
        // Con el metodo .put() se agrega elementos al HashMap
        capitales.put("Colombia", "Bogota");
        capitales.put("Ecuador", "Quito");
        capitales.put("Mexico", "CDMX");
        capitales.put("Peru", "Lima");
        capitales.put("Venezuela", "Caracas");

        // METODO -> keySet()
        // Este metodo es solo si solo desea las claves
        
        // Hacemos un foreach para pasar por cada elemneto 
        // y obtener la clave
         
        for (String clave : capitales.keySet()) {
            System.out.println(clave);
            
        }

        
    }

}
