package SingleTon;
// Only can create one instance at a time
// No multiple instance/obj of a class
// Singleton classes are used for logging, driver objects, caching and thread pool, database connections.
public class Singleton {
static Singleton SingletonObj = new Singleton();
private Singleton(){

}

public static Singleton getInstance(){
    if (SingletonObj==null)
        SingletonObj = new Singleton();
    return SingletonObj;
}



}
