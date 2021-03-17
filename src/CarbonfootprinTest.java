import java.util.ArrayList;

public class CarbonfootprinTest {
    public static void main(String[] args){

        Bulding bulding =new Bulding(68,25,"two");
        Car car=new Car(Car.FuelType.PETROL,60


                ,1998,"bmw");

        Bicycle bicycle=new Bicycle(60,"red");
        ArrayList<CarbonFootprint>carbonfootprint=new ArrayList<CarbonFootprint>();
        carbonfootprint.add(bulding);
          carbonfootprint.add(car);

        carbonfootprint.add( bicycle);
        for (CarbonFootprint currentcarbon:carbonfootprint){
            System.out.printf("%s%.2f",currentcarbon.toString(),currentcarbon.getCarbonFootprint());
            System.out.println();
        }


    }

}


