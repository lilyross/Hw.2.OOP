public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 ");
        Car lada = new Car( " Lada", " Granta ", 2015, " России. ", " Желтый. ", 1.7 );
        System.out.println(lada);
        Car audi = new Car( " Audi", " A8 50 L TDI quattro ", 2020, " Германии. ", " Черный. ", 3.0 );
        System.out.println(audi);
        Car bmw = new Car( " BMW", " Z8 ", 2021, " Германии. ", " Черный. ", 3.0 );
        System.out.println(bmw);
        Car kia = new Car( " Kia", " Sportage 4-го поколения ", 2018, " Южной Корее. ", " Красный. ", 2.4 );
        System.out.println(kia);
        Car hyundai  = new Car( " Hyundai", " Avante", 2016, " Южной Корее. ", " Оранжевый. ", 1.6 );
        System.out.println(hyundai);

    }
}