/** 
 * @author Jerelyn Co, Marion Ivan Tan
 * @version 1.0
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Class Clock will display the digital time.
 */

public class Clock {
	/*
	 * @return String "Time: " and the formatted time from method digital time
	 * @param args For console's use
	 */
	public static void main(String[] args) {
		String last = "";
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		while(!stopTime()){
			if(!digitalTime(df).equals(last)){
				last = digitalTime(df);
				System.out.println("Time: " + last);
			}
		}
	}
	/*
	 * @return String formatted time to display at main
	 * @param df Format for the time
	 */
	public static String digitalTime(DateFormat df){
		Calendar calobj = Calendar.getInstance();
		return df.format(calobj.getTime());
	}
	/*
	 *stopTime will be used in the main to determine whether the application has to stop or not 
	 * @return boolean to stop time
	 */
	public static boolean stopTime(){
		return false;	
	}
	/*
	 *alarm will be used in the main to determine whether the application has to stop or not 
	 * @return boolean true if the alarm is successfully set
	 */
	public static boolean setAlarm(){
		return true;
	}

};