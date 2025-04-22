package app.repository;

public interface Cloth {
    void setColor(String color);
    void setPrice(String price);
    void setManufacturer(String manufacturer);
    void setName(String name);

    String getColor();
    String getPrice();
    String getManufacturer();
    String getName();
}
