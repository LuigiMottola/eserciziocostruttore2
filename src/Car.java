public class Car {
    private String engineDisplacement;
    private String plate;
    private String brand;
    private String model;

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(String engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

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

    public Car(String engineDisplacement, String plate, String brand, String model) {
        this.engineDisplacement = engineDisplacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;

    }
    @Override
    public String toString() {
        return "Car{" +
                "engineDisplacement='" + engineDisplacement + '\'' +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

