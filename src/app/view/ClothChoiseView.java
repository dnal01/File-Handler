package app.view;

import app.repository.Cloth;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ClothChoiseView {
    Map<String, String> cloth;

    public Map<String, String> getCloth() {
        cloth = new LinkedHashMap<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the cloth name you want to add (Cap / Shirt)");
        cloth.put("Name", s.nextLine());
        System.out.println("Please enter the manufacturer name you want to add");
        cloth.put("Manufacturer", s.nextLine());
        System.out.println("Please enter the color you want to add");
        cloth.put("Color", s.nextLine());
        System.out.println("Please enter the price you want to add");
        // Right now price is not validate. Can be added a validator.
        cloth.put("Price", s.nextLine());

        return cloth;
    }
    public String printProducts(Cloth cloth1, Cloth cloth2, double totalPrice) {
        System.out.println("Order:");
        System.out.println(cloth1.getName() + " " + cloth1.getColor() + " " + cloth1.getManufacturer() + " " + cloth1.getPrice());
        System.out.println(cloth2.getName() + " " + cloth2.getColor() + " " + cloth2.getManufacturer() + " " + cloth2.getPrice());
        System.out.println("Total price: " + totalPrice);
        return "Success";
    }

}
