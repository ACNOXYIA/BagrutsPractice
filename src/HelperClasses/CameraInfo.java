package HelperClasses;

public class CameraInfo {
    private int city;
    private int maxSpeed;
    private CarInfo[] cars;

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarInfo[] getCars() {
        return cars;
    }

    public void setCars(CarInfo[] cars) {
        this.cars = cars;
    }

    public CameraInfo(int city, int maxSpeed, CarInfo[] cars) {
        if (city < 0 || city > 99) {
            throw new IllegalArgumentException("City code must be between 0 and 99");
        }
        this.city = city;
        this.maxSpeed = maxSpeed;
        this.cars = cars;
    }

    public boolean allGood() {
        for(int i = 0; i < this.cars.length; i++){
            if(cars[i].illegal(this.maxSpeed)){
                return false;
            }
        }
        return true;
    }
}
