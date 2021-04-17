package tickets;

import java.time.LocalTime;

public class Hour {
	public static void hours()
	{
		LocalTime cabTime = LocalTime.parse("17:00");
		int hour = cabTime.getHour();
		System.out.println("Hour: " + hour);
		if (hour >= 16 && hour <= 18) // 4pm to 6pm (16:00 to 18:00)
		{
			System.out.println("peak Hours");
			Citizen.citizen();
		}
	}

}

