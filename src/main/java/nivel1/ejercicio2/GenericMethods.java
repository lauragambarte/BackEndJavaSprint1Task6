package nivel1.ejercicio2;

public class GenericMethods {
    //1-we need to put the generic type parameter "T"
    //2-comes the return type, in this case void
    //3-name of the method
    //4-parameters of the method
    //all classes inherit from Object because are generic, and Object has a tostring,we can use to string even though we don't know which type will be.
    public <T, U, V> void genericMethod(T element1, U element2, V element3) {
        System.out.println(element1.toString());
        System.out.println(element2.toString());
        System.out.println(element3.toString());
    }
}