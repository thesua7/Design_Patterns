import Adapter.AdapterConverter;
import Adapter.Pen;
import Adapter.Task;
import Builder.ObjBuilder;
import Factory.OS;
import Factory.SystemFactory;
import SingleTon.Singleton;


public class Main {
    public static void main(String[] args) {


        //Creation patterns #1
        Singleton obj1 = Singleton.getInstance();
        System.out.println("Singleton test: "+ obj1.hashCode());
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Singleton test: "+ obj2.hashCode());


        //Creation patterns #2
        SystemFactory systemFactory = new SystemFactory();
        OS obj = systemFactory.getInstance("Android");
        obj.spec();

        //Creation patterns #3
        ObjBuilder bugatti = new ObjBuilder.Builder("Bugatti",300).build();
        System.out.println("Name: "+ bugatti.getCarBrand());
        System.out.println("Speed: "+ bugatti.getSpeed());

        ObjBuilder pagani = new ObjBuilder.Builder("Pagani",260).setPrice(2.10F).build();
        System.out.println("Name: "+ pagani.getCarBrand());
        System.out.println("Speed: "+ pagani.getSpeed());
        System.out.println("Price: "+ pagani.getPrice()+" Millions");


        //Structural Patterns #1
        Pen writter = new AdapterConverter();
        Task task = new Task();
        task.setP(writter);
        task.write("Hello! I'm pencil");






    }
}