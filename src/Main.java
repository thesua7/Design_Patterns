import SingleTon.Singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.hashCode());
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.hashCode());


    }
}