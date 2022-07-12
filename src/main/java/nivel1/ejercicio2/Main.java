package nivel1.ejercicio2;

public class Main {
    public static void main(String[] args) {
GenericMethods callGenericMethods=new GenericMethods();
//the elements can be from different type, or the same, and the order when calling the method doesn't matter for generics.
 //because in the beginning we don't know which type arguments they will have.
callGenericMethods.genericMethod(new Person("Laura", "Gambarte",30),"Tomate",10);
callGenericMethods.genericMethod(10,"Tomate",new Person("Grey", "Whiskers",5));
callGenericMethods.genericMethod(1,2,3);
    }
}
