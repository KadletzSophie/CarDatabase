package model;

import java.util.HashMap;

public class CarDatabase {
    HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase(HashMap<String, Vehicle> db) {
        this.db = db;
    }

    public Vehicle[] search(String licencePlate, boolean exact) {
        return null;
    }
}
