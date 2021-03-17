public class Car implements CarbonFootprint {

    enum FuelType {DIESEL, PETROL};
    private FuelType fueltype;
    private  double distance;
    private double  year;
    private String model;
    public Car(FuelType fueltype,double distance,double year,String model){
        if(distance<0){
            throw new IllegalArgumentException("distane should be grater than zero");
        } if(year<1980){
            throw new IllegalArgumentException("your car is out of stuff");

        }
        this.fueltype=fueltype;
        this.year=year;
        this.model=model;
        this.distance=distance;

    }

    public void setFueltype(FuelType fueltype) {
        this.fueltype = fueltype;
    }

    public void setDistance(double distance) {if(distance<0){
        throw new IllegalArgumentException("distane should be grater than zero");
    }
        this.distance = distance;
    }

    public void setYear(double year) {if(year<1980){
        throw new IllegalArgumentException("your car is out of stuff");

    }
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFueltype() {
        return fueltype;
    }

    public double getDistance() {
        return distance;
    }

    public double getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getCarbonFootprint(){
        double fuelfactor;
        if(fueltype==FuelType.DIESEL){
            fuelfactor=0.5;
            return distance*(year/12)*fuelfactor;

        }
        if(fueltype==FuelType.PETROL){
            fuelfactor=0.1;
            return  distance*(year/12)*fuelfactor;
        }
        return 0;

    }
    public String toString(){
        return String.format("carbonfootprint for the %S is: ",getModel());
    }


}
