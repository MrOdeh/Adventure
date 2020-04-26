package com.local.mahmoud;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private Map<String, Integer> exist;

    public Location(int locationId, String description, HashMap<String, Integer> exist) {
        this.locationID = locationId;
        this.description = description;
        this.exist = new HashMap<>(exist);
        this.exist.put("Q", 0);
    }

    public void addLocation(int location, String direction) {
        exist.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return new HashMap<>(exist);
    }
}