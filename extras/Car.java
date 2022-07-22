class Car {
    private String make, model;
    private Boolean is_sold;

    public Car(String make, String model, Boolean is_sold) {
        this.make = make;
        this.model = model;
        this.is_sold = is_sold;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public Boolean getIsSold() {
        return this.is_sold;
    }

    public void setIsSold(Boolean current_status) {
        this.is_sold = current_status;
    }
}

class Main {
    public static void main(String[] args) {
        Car i10 = new Car("Hyundai", "i10", false);
        i10.setIsSold(true);
        System.out.println("The Car " + i10.getMake() + " " + i10.getModel() + " is sold - " + i10.getIsSold());
    }
}
