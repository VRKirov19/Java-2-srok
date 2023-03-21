public class Car {
    private int age;
    private String model;
    private String brand;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
    public Car(int age, String model, String brand) {
        this.age = age;
        this.model = model;
        this.brand = brand;
    }
}