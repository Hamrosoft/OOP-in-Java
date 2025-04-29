package core_package;

public class WrapUnwrapExample {

    public static void main(String[] args) {

        
        int a = 10;
        double d = 10.5;
        char c = 'x';

        
        Integer integerObject = new Integer(a);
        Double doubleObject = new Double(d);
        Character characterObject = new Character(c);

        System.out.println("after wrapping ... ");

        System.out.println("Integer " + integerObject.intValue());
        System.out.println("Double " + doubleObject);
        System.out.println("Character " + characterObject);

        // unwrapping the objects their respective data types

        int a1 = integerObject;
        double d1 = doubleObject;
        char c1 = characterObject;

        System.out.println("After unwrapping");

        System.out.println("Integer " + a1);
        System.out.println("Double " + d1);
        System.out.println("Character " + c1);

    }
}