import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Meeting extends Event
{
	private ArrayList<String> attendees;
	private int endBuffer;

	public Meeting(Contact organizer, GregorianCalendar dateTime, String description)
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

	public ArrayList<String> getAttendees()
	{
		return attendees;
	}

	public void setEndBuffer(int endBuffer)
	{
		dateTime.add(Calendar.MINUTE, endBuffer);
	}

	public void addAttendee(String attendee)
	{
		attendees.add(attendee);
	}

}