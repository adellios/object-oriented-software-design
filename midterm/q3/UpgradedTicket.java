public class UpgradedTicket extends Flight
{
    public enum UpgradeType {ECONOMY_PLUS, BUSINESS_CLASS;}

    private String passengerName = null;
    private Flight flight = null;
    private int row = 0;
    private char seat = 'X';
    private UpgradeType upgrade = UpgradeType.ECONOMY_PLUS;

    public UpgradedTicket(UpgradeType upgrade, String name, Flight flight, int row, char seat)
    {
        super();
        this.upgrade = upgrade;
        this.passengerName = passengerName;
        this.flight = flight;
        this.row = row;
        this.seat = seat;

    }
}