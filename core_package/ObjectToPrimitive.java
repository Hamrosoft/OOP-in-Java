package core_package;

public class ObjectToPrimitive {

    public static void main(String[] args) {

        Integer i = new Integer(11);
        Float f = new Float(11.2);

        // making integer into float
        float fValue = i.floatValue();
        // making float into integer
        int iValue = f.intValue();

        System.out.println("intger after converting it to float " + fValue);
        System.out.println("float after converting it to integer " + iValue);

    }

}
