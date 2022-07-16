package nivel2.ejercicio1;

public class Main {
    public static void main(String[] args) {
GenericMethods callGenericMethods=new GenericMethods();

//  the order when calling the method does matter in this case because the 3rd element has to be an Integer. not a generic.
//but i can switch the order of the first two elements
        //arguments are the values sent to the parameters of the method.
   callGenericMethods.genericMethod(new Person("Laura", "Gambarte",30), "asado", 45);
   callGenericMethods.genericMethod("panacota", new Person("Marta", "Gambarte", 50),789);


    }
}
