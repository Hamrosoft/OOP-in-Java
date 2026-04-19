package core_package;

public class DataTypeExample {
    public static void main(String[] args) {
        String s = "123";

        Double d = Double.valueOf(s);

        if (d.equals(123.2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");

        }
    }

}
