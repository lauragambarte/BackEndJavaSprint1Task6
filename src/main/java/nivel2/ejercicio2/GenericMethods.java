package nivel2.ejercicio2;

import java.util.Collection;

public class GenericMethods {
    //1-we need to put the generic type parameter "T".
    //2-comes the return type, in this case void
    //3-name of the method
    //4-parameters of the method:The exercise is about a list(collection is a list)
    //all classes inherit from Object because are generic, and Object has a tostring,we can use to string even though we don't know which type will be.

    public <T> void genericMethod(Collection<T> elements) {
        for(T element:elements){
            System.out.println(element);
        }

    }
}