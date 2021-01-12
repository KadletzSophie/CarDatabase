package model;

public class Vehicle {
    private String color;
    private String owner;
    private String maufacturing;
    private String model;
    private String licensePlate;

    public Vehicle(String color, String owner, String maufacturing, String model, String licensePlate) {
        this.color = color;
        this.owner = owner;
        this.maufacturing = maufacturing;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMaufacturing() {
        return maufacturing;
    }

    public void setMaufacturing(String maufacturing) {
        this.maufacturing = maufacturing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Manufactor: " + maufacturing + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Licence Plate: " + licensePlate + '\n' +
                "Owner: " + owner + '\n';
    }

}
