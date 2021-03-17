public class Bicycle implements  CarbonFootprint {
    private double distance;
    private final double caloriespermie=32.0;
    private String color;
    public Bicycle(double distance,String color){
        if(distance<0){
            throw  new IllegalArgumentException("distance shoulde be grater than zero");
        }
        this.distance=distance;
        this.color=color;
    }

    public void setDistance(double distance) {
        if(distance<0){
            throw  new IllegalArgumentException("distance shoulde be grater than zero");
        }
        this.distance = distance;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistance() {
        return distance;
    }

    public String getColor() {
        return color;
    }
    public double getCarbonFootprint(){
        return (distance/12*caloriespermie);
    }
    public String toString(){
        return String.format("carbonfootprint for the %s  bicycle is :",getColor());
    }
}
