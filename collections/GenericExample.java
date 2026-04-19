package collections;

public class GenericExample {

    public static void main(String[] args) {
        GenericClass<Integer> integer = new GenericClass<Integer>(5);
        GenericClass<String> string = new GenericClass<String>("Ronit don 💔");
        GenericClass<Double> dbl = new GenericClass<>(5.5);

        integer.print();
        string.print();
        dbl.print();

    }

}
