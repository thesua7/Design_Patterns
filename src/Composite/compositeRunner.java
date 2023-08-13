package Composite;
//obj structure
//For example, imagine that you have two types of objects: Products and Boxes.
// A Box can contain several Products as well as a number of smaller Boxes.
// These little Boxes can also hold some Products or even smaller Boxes, and so on.
public class compositeRunner {
    public static void main(String[] args) {
        leafObj mouse = new leafObj("Mouse",600);
        leafObj keyboard = new leafObj("Keyboard",350);
        leafObj monitor = new leafObj("Monitor",6000);
        leafObj ram = new leafObj("Ram",7000);
        leafObj cpu = new leafObj("Processor",18000);
        leafObj cooler = new leafObj("Cooler",3600);
        leafObj gpu = new leafObj("GPU",12000);
        leafObj hd = new leafObj("Hard Disk",3500);
        leafObj ssd = new leafObj("SSD",3500);
        leafObj fans = new leafObj("FANS",3000);


        CompositeObj casing = new CompositeObj("Casing");
        CompositeObj accessories = new CompositeObj("Peripherals");
        CompositeObj motherboard = new CompositeObj("Motherboard");
        CompositeObj computer = new CompositeObj("Computer");


        accessories.addComponents(mouse);
        accessories.addComponents(keyboard);
        accessories.addComponents(monitor);

        motherboard.addComponents(ram);
        motherboard.addComponents(ssd);
        motherboard.addComponents(hd);
        motherboard.addComponents(cpu);
        motherboard.addComponents(cooler);
        motherboard.addComponents(fans);
        motherboard.addComponents(gpu);

        casing.addComponents(motherboard);

        computer.addComponents(computer);
        computer.addComponents(accessories);

        motherboard.ShowPrice();





    }
}
