import java.util.GregorianCalendar;

public class Flight
{

	private String passengerName;
    private Flight flight;
    private int row;
    private char seat;
    
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
    private String departureAirport;
    private String arrivalAirport;

    public void setPassengerName(String name)
    {
        this.passengerName = name;
    }

    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    public void reserveSeat(int row, char seat)
    {
        this.row = row;
        this.seat = seat;
    }

}
