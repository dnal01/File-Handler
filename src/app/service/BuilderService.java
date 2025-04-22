package app.service;

import app.repository.Cap;
import app.repository.Cloth;
import app.repository.Shirt;

import java.util.Map;

public class BuilderService {
    public Cloth build(Map<String, String> clothChoise) {
        Cloth cloth;
        if (clothChoise.get("Name").equals("Cap")) {
            cloth = new Cap();
        } else {
            cloth = new Shirt();
        }
        cloth.setName(clothChoise.get("Name"));
        cloth.setManufacturer(clothChoise.get("Manufacturer"));
        cloth.setColor(clothChoise.get("Color"));
        cloth.setPrice(clothChoise.get("Price"));

        return cloth;
    }
}
