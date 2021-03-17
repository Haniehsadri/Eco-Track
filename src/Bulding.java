public class Bulding implements CarbonFootprint {
    private double biuldingsarea;
    private double averagetemperature;
    private String floor;
    public  Bulding(double buldingsarea,double averagetemperature,String floor){
        if (buldingsarea < 0) {
            throw new IllegalArgumentException("buldingsarea must be >= 0");
        }
        if (averagetemperature < 0) {
            throw new IllegalArgumentException("averagetemperature must be >= 0");
        }
        this.averagetemperature=averagetemperature;
        this.biuldingsarea=buldingsarea;
        this.floor=floor;
    }
    public void setBiuldingsarea(double biuldingsarea) {
        if (biuldingsarea< 0) {
            throw new IllegalArgumentException("buldingsarea must be >= 0");
        }
        this.biuldingsarea=biuldingsarea;
    }
    public void setAveragetemperature(double averagetemperature){
        if (averagetemperature< 0) {
            throw new IllegalArgumentException("averagetemperature must be >= 0");
        } this.averagetemperature=averagetemperature;
    }
    public double getBiuldingsarea(){
        return biuldingsarea;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }

    public double getAveragetemperature(){
        return averagetemperature;
    }
    @Override
    public double getCarbonFootprint(){
        return getAveragetemperature()*getBiuldingsarea()*0.2;
    }
    public String toString(){
        return String.format("carbonfootprint for the bulding on floor %s is: ",getFloor());
    }


}



















