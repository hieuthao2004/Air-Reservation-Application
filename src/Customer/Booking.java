package Customer;
public class Booking {
    private long id;
    private String name;
    private String plane;
    private int planeId;
    private String flyDate;
    private String finishDate;

    public Booking(long id, String name, String plane, int planeId, String flyDate, String finishDate) {
        this.id = id;
        this.name = name;
        this.plane = plane;
        this.planeId = planeId;
        this.flyDate = flyDate;
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket\n");
        sb.append("----------------------------------------------------------------------------------------------------\n");
        sb.append("ID: "); sb.append(id); sb.append("Customer's name: "); sb.append(name); 
        sb.append(plane); sb.append(planeId);
        sb.append(flyDate); sb.append(finishDate);
        return sb.toString();
    }
} 
