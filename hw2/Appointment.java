import java.util.Calendar;
import java.util.GregorianCalendar;

public class Appointment extends Event
{
	private int startBuffer;

	public Appointment(Contact organizer, GregorianCalendar dateTime, String description)
	{
		this.organizer = organizer;
		this.dateTime = dateTime;
		this.description = description;
	}

	public GregorianCalendar getStartTime()
	{
		return dateTime;
	}

	public GregorianCalendar getEndTime()
	{
		GregorianCalendar endtime = dateTime;
		endtime.add(Calendar.HOUR, 1);
		
		return endtime;
	}

	public void setStartBuffer(int startBuffer)
	{
		dateTime.add(Calendar.MINUTE, startBuffer);
	}

	
}