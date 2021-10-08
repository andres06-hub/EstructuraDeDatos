import java.util.HashMap;


public class Remove {
    public static void main(String[] args) {

        
        // Creamos el HaspMap es muy parecido a la creacion de los (Array , ArrayLisrt)
        HashMap<String, String> capitales = new HashMap<>();
        
        // Con el metodo .put() se agrega elementos al HashMap
        capitales.put("Colombia", "Bogota");
        capitales.put("Ecuador", "Quito");
        capitales.put("Mexico", "CDMX");
        capitales.put("Peru", "Lima");
        capitales.put("Venezuela", "Caracas");
        
        System.out.println(capitales);

        
        // METODO -> remove()
        // Para eiminar un Articulo (Solo uno) 
        // Consulte la clave para poder eliminarlo

        capitales.remove("Peru");

        System.out.println(capitales);

    }

}
