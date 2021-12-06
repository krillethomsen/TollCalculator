public class TollCalculator {

    public static void main(String[] args) {
        

        Car car1 = new Car(true, 2);
        Car car2 = new Car(true, 5);
        Car car3 = new Car(false, 1);
        Motorbike motorbike1 = new Motorbike(true, 5);
        Motorbike motorbike2 = new Motorbike(false, 10);

        car1.PrintDetail();
        car2.PrintDetail();
        car3.PrintDetail();
        motorbike1.PrintDetail();
        motorbike2.PrintDetail();

    }
}
