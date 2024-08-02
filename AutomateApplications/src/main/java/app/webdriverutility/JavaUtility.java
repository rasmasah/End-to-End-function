package app.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getrandomnumber() {
		Random random=new Random();
		int randomnumber=random.nextInt(5000);
		return randomnumber;
	}
	public String getSystemDateYYYYDDMM() {
		Date dateObj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		String date=sdf.format(dateObj);
		return date;
	}
	public String getRequiredDateYYYYDDMM(int days) {
		Date dateObj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-dd");
		String startDate=sim.format(dateObj);
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		String reqDate=sim.format(cal.getTime());
		return reqDate;

	}

}
