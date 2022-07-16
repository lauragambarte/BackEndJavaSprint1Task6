package nivel2.ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        GenericMethods callGenericMethods = new GenericMethods();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Laura");
        names.add("Grey");
        names.add("Jonte");
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(20);
        numbers.add(59);
        numbers.add(15);
        callGenericMethods.genericMethod(names);
        callGenericMethods.genericMethod(numbers);


    }
}
