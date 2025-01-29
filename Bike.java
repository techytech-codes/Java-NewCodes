public class Bike {
    private String brand;
    private String model;
    private int price;
    private int mileage;

    public Bike(String brand, String model, int price, int mileage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bike [brand=" + brand + ", model=" + model + ", price=" + price + ", mileage=" + mileage + "]";
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}