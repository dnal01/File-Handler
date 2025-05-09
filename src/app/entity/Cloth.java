package app.entity;

public abstract class Cloth {
    public abstract void setColor(String color);
    public abstract void setPrice(String price);
    public abstract void setManufacturer(String manufacturer);
    public abstract void setName(String name);

    public abstract String getColor();
    public abstract String getPrice();
    public abstract String getManufacturer();
    public abstract String getName();
}
