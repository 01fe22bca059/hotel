
public class roomdetails {
    protected String name;
    protected String date;
    protected int room;

    public void displayCustomerdetails(String name, String date, int room) {
        this.name = name;
        this.date = date;
        this.room = room;

        System.out.println("Customer: " + name);
        System.out.println("Date of Booking: " + date);
        System.out.println("Assigned Room: " + room);
        
    }

    public void displayFloorNum() {
        if (room <= 10)
            System.out.println(" 1st floor");
        else if (room <= 20)
            System.out.println(" 2nd floor");
        else if (room <= 30)
            System.out.println(" 3rd floor");
        else if (room <= 40)
            System.out.println("4th floor");
        else if (room <= 50)
            System.out.println("5th floor");
        
    }
}

