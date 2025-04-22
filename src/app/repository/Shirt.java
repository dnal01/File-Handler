package app.repository;

public class Shirt implements Cloth {
    String color;
    String price;
    String manufacturer;
    String name;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public String getPrice() {
        return price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getName() {
        return name;
    }
}
