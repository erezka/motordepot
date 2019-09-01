package epam.finalproject.motordepot.entities;

public class Driver {
    private int driverId;
    private String fullname;
    private int age;
    private int drivingExpirience;
    private long drivingLicenceNumber;

    public Driver() {
    }

    public Driver(int driverId, String fullname, int age, int drivingExpirience, long drivingLicenceNumber) {
        this.driverId = driverId;
        this.fullname = fullname;
        this.age = age;
        this.drivingExpirience = drivingExpirience;
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public Driver(String fullname, int age, int drivingExpirience, long drivingLicenceNumber) {
        this.fullname = fullname;
        this.age = age;
        this.drivingExpirience = drivingExpirience;
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExpirience() {
        return drivingExpirience;
    }

    public void setDrivingExpirience(int drivingExpirience) {
        this.drivingExpirience = drivingExpirience;
    }

    public long getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(long drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", drivingExpirience=" + drivingExpirience +
                ", drivingLicenceNumber=" + drivingLicenceNumber +
                '}' +"\n";
    }
}
