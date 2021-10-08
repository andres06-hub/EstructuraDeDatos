import java.util.HashMap;

public class Values {

    public static void main(String[] args) {

        // Creamos el HaspMap es muy parecido a la creacion de los (Array , ArrayLisrt)
        HashMap<String, String> capitales = new HashMap<>();
        
        // Con el metodo .put() se agrega elementos al HashMap
        capitales.put("Colombia", "Bogota");
        capitales.put("Ecuador", "Quito");
        capitales.put("Mexico", "CDMX");
        capitales.put("Peru", "Lima");
        capitales.put("Venezuela", "Caracas");

        // METODO -> values

        // Este metodo nos sirve para que nos de solo los valores de los elementos
        // Recorremos el HashMap para que nos entregue todos los valores que tiene

        // Se hace un foreach 
        for (String valor : capitales.values()) {
            System.out.println(valor);
        }
        
        
    }
}
