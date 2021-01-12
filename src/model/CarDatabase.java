package model;

import java.util.HashMap;

public class CarDatabase {
    HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase(HashMap<String, Vehicle> db) {
        this.db = db;
    }

    public CarDatabase() {
        MagicGenerator m = new MagicGenerator();

        for(int i =0; i<1000; i++) {
            String color = m.getRandomColor();
            String owner = m.getRandomName();
            String manufactor = m.getRandomManufacturer();
            String model = m.getRandomModel(manufactor);
            String licensePlate = m.getRandomLicencePlate();
            Vehicle v = new Vehicle(color, owner, manufactor, model, licensePlate);
            db.put(licensePlate, v);
            System.out.println("Created vehicle with license plate " +licensePlate);
        }
    }

    public Vehicle[] search(String licencePlate, boolean exact) {
        return null;
    }
}
