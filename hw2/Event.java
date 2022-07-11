import java.util.GregorianCalendar;
import java.util.Calendar;

public abstract class Event
{
	protected GregorianCalendar dateTime;
	protected Contact organizer;
	protected String description;

	public String getDescription()
	{
		return description;
	}

	public String toString()
	{
		String value = "(date time: " + dateTime + ", organizer: " + organizer + ", description: " + description + ")";
		return value;
	}

	public abstract GregorianCalendar getStartTime();

	public abstract GregorianCalendar getEndTime();

}