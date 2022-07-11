public class StandbyTicket extends Flight
{
    private String passengerName;
    private Flight flight;

    public StandbyTicket(String passengerName, Flight flight)
    {
        super();
        this.passengerName = passengerName;
        this.flight = flight;
    }
}