package app.service;

import app.entity.Cap;
import app.entity.Cloth;
import app.entity.Shirt;

import java.util.Map;

public class BuilderService {
    public Cloth build(Map<String, String> clothChoice) {
        Cloth cloth;
        if (clothChoice.get("Name").equals("Cap")) {
            cloth = new Cap();
        } else {
            cloth = new Shirt();
        }
        cloth.setName(clothChoice.get("Name"));
        cloth.setManufacturer(clothChoice.get("Manufacturer"));
        cloth.setColor(clothChoice.get("Color"));
        cloth.setPrice(clothChoice.get("Price"));

        return cloth;
    }
}
