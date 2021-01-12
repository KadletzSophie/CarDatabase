package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public Vehicle[] search(String licencePlate, boolean exact){
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        long start = System.nanoTime();

        if (exact){
            Vehicle tmp = db.get(licencePlate);
            if(tmp != null) {
                vehicles.add(tmp);
            }

        }
        else{
            for (Map.Entry<String, Vehicle> entry : db.entrySet()) {
                Vehicle tmp = entry.getValue();
                if(tmp.getLicensePlate().contains(licencePlate)){
                    vehicles.add(tmp);
                }
            }

        }

        return vehicles.toArray(Vehicle[]::new);
    }
}
