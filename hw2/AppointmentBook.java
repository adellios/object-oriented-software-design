import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppointmentBook 
{
	private ArrayList<Event> events;
	private int overlaps = 0;
	private ArrayList<Event> eventsfordate;

	public boolean addEvent(Event event)
	{

		for (int i = 0; i < events.size(); i++)
		{
			if (event.getEndTime().compareTo(events.get(i).getStartTime()) < 0 && event.getStartTime().compareTo(events.get(i).getEndTime()) > 0) 
			{
				events.add(event);
			} else {
				overlaps++;
			}
		}
		if (overlaps > 0)
		{
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<Event> getEventsForDate(GregorianCalendar date)
	{
		for (int i = 0; i < events.size(); i++)
		{
			if (events.get(i).dateTime.get(Calendar.DAY_OF_MONTH) == date.get(Calendar.DAY_OF_MONTH))
			{
				eventsfordate.add(events.get(i));
			} else {
				;
			}
		}
		return eventsfordate;
	}
}
