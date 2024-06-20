package Customer;

import Airplane.AirPlane;
import Airplane.PlaneStatus;

public class Test {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer(1206, "Nguyen Hieu", "13/07/2004");
        AirPlane a1 = new AirPlane(001, "Su-57", "Sukhoi", "20/10/2029", PlaneStatus.EASE);
        Booking b1 = new Booking(1, c1.getName(), a1.getName(), 001, "23/01/2024", "24/01/2024");
        System.out.println(b1);
        System.out.println(c1.getCustomer());
    }
}
