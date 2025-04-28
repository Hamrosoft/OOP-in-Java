package collections;

public class GenericClass<T> {    
    public T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }
}
