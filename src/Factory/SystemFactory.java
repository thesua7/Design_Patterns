package Factory;
//In Factory pattern, we create object without exposing the creation logic to the client
// and refer to newly created object using a common interface
//The factory design pattern is used when we have a superclass with multiple sub-classes and based on input,
// we need to return one of the sub-class.

public class SystemFactory {
    public OS getInstance(String str){
        if (str.toLowerCase().equals("android")){
            return new Android();
        }
       else if (str.toLowerCase().equals("ios")){
            return new Ios();
        }
        else {
            return new Windows();
        }
    }
}
