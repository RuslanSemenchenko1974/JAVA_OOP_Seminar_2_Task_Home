/**
 * CarMain
 */
public class CarMain {

    public static void main(String[] args) {
        Road road = new Road(50);
        Car car = new Car();
        road.pass(car);
        
    }
    public static class Car implements CanRun {
        public int getDistance() {
            // 
            return 20;
        }

        @Override
        public int getRun() {
            // TODO Auto-generated method stub
            return getDistance();
        }
    }
}