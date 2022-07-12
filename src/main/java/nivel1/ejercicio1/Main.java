package nivel1.ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods names =new NoGenericMethods("Laura","Jonathan", "Grey");
        //Pruebo que en la llamada al constructor no importa el orden de los argumentos. Todos son String.
        NoGenericMethods moreNames =new NoGenericMethods("Jonathan","Laura", "Grey");
    }
}
