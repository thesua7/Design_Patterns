package Composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void ShowPrice();
}
class leafObj implements Component{

    String name;
    int price;

    public leafObj(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void ShowPrice() {

        System.out.println(name+" "+price);
    }
}

class CompositeObj implements Component{

    String name;
    List<Component> components = new ArrayList<>();

    public CompositeObj(String name) {
        super();
        this.name = name;
    }

    public void addComponents(Component component){
        components.add(component);
    }

    @Override
    public void ShowPrice() {
        System.out.println(name);

        for (Component c:components){
            c.ShowPrice();
        }



    }
}