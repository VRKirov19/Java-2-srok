import java.util.Iterator;
public class Garage implements Iterable < Car > {
    private Car[] cars;
    public Garage(Car...cars) {
        this.cars = cars;
    }
    private final class GarageIterator implements Iterator < Car > {
        private int index = cars.length - 1;
        @Override
        public boolean hasNext() {
            if (this.index >= 0) {
                return true;
            } else {
                return false;
            }
        }
        @Override
        public Car next() {
            Car carToReturn = cars[index];
            index--;
            return carToReturn;
        }
    }
    @Override
    public Iterator < Car > iterator() {
        return new GarageIterator();
    }
}