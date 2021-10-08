import java.util.HashMap;

public class Put {
    public static void main(String[] args) {

        // METODO -> put()

        // Creamos el HaspMap es muy parecido a la creacion de los (Array , ArrayLisrt)
        HashMap<String, String> capitales = new HashMap<>();

        // Con el metodo .put() se agrega elementos al HashMap
        capitales.put("Colombia", "Bogota");
        capitales.put("Ecuador", "Quito");
        capitales.put("Mexico", "CDMX");
        capitales.put("Peru", "Lima");
        capitales.put("Venezuela", "Caracas");

        // Se muestra los elelmnetodsque estan en el HashMap
        System.out.println(capitales);

    }
}
