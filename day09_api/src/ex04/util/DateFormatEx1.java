package ex04.util;
import java.util.Date;
import java.text.SimpleDateFormat;

class DateFormatEx1{
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);  //
		SimpleDateFormat sdf1, sdf4;
		sdf1 = new SimpleDateFormat("yy-MM-dd");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a E");
		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf4.format(today));
	}
}