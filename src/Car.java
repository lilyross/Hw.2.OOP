public class Car {
   public String brand;

    public String model;

    public double engineVolume;

    public String color;

    public int productionYear;

    public String productionCountry;

    Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = " default ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = " default ";
        } else {
            this.model = model;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }else {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isBlank()) {
            this.color = " Белый ";
        }else {
            this.color = color;
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        }else {
            this.productionYear = 2000;
        }
            if (productionCountry == null || productionCountry.isBlank()) {
                this.productionCountry = " default ";
            } else {
                this.productionCountry = productionCountry;
            }
        }

    public String toString() {
        return brand + " " + model + "," + productionYear + " Год выпуска, сборка в " + productionCountry + " Цвет " + color + " Объем двигателя " + engineVolume;
    }
}
