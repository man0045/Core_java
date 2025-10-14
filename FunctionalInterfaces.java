@FunctionalInterface
interface A {
    void show();
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello from Functional Interface!");
        obj.show();
    }
}