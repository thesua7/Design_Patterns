package Builder;

//A Builder class builds the final object step by step. This builder is independent of other objects.

//The simplest real world example of the builder pattern, which most of us are familiar with, is
// when we make (or order) a pizza. The pizza toppings cannot be added in any random order or
// the whole thing is likely to come out a mess.
// Instead, there is a step-by-step process that is followed.

public class ObjBuilder {

    private String carBrand;
    private float speed;

    private float price;

    public float getPrice() {
        return price;
    }

    public float getSpeed() {
        return speed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public ObjBuilder(Builder builder){

        this.carBrand =  builder.carBrand;
        this.speed = builder.speed;
        this.price = builder.price;

    }

    public static class Builder{
        private String carBrand;
        private float speed;

        private float price;
        public Builder(String carBrand,float speed){
        this.carBrand = carBrand;
        this.speed = speed;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public ObjBuilder build(){
            return new ObjBuilder(this);
        }
    }
}
