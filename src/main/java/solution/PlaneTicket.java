package solution;

public class PlaneTicket extends Ticket{
    protected boolean isFrequentFlyer;

    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price, boolean isFrequentFlyer) {
        super(id, origin, destination, seatNumber, price);
    }


    @Override
    public void printPaymentAmt() {
        System.out.println(getPrice());
    }
}
