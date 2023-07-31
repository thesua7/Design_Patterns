package Factory;
//In Factory pattern, we create object without exposing the creation logic to the client
// and refer to newly created object using a common interface

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
