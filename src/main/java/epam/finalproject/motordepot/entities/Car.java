package epam.finalproject.motordepot.entities;

public class Car {
    private int carId;
    private String model;
    private String number;
    private int mileage;
    private String category;
    private int state;
    private double maxCargoWeight;

    public Car(int carId, String model, String number, int mileage, String category, int state, double maxCargoWeight) {
        this.carId = carId;
        this.model = model;
        this.number = number;
        this.mileage = mileage;
        this.category = category;
        this.state = state;
        this.maxCargoWeight = maxCargoWeight;
    }

    public Car(String model, String number, int mileage, String category, int state, double maxCargoWeight) {
        this.model = model;
        this.number = number;
        this.mileage = mileage;
        this.category = category;
        this.state = state;
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", number=" + number +
                ", mileage=" + mileage +
                ", category='" + category + '\'' +
                ", state=" + state +
                ", maxCargoWeight=" + maxCargoWeight +
                '}';
    }
}
