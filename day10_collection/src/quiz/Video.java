package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Video {
	
	String title;
	String category;
	String lendDate;
	String lend;
	String lendName;
	
	public Video() { }

	public String getTitle() {
		return title;
	}
	

	public Video(String title, String category, String lend) {
		super();
		this.title = title;
		this.category = category;
		this.lend = lend;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate() {
		Date day = Calendar.getInstance().getTime();
		SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");
		this.lendDate = today.format(day);
	}

	public String getLend() {
		return lend;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	@Override
	public String toString() {
		if(this.lendDate==null) {
			this.lendDate="No";
		}
		if(this.lendName==null) {
			this.lendName="No";
		}
		return "\n1. title=" + title + "\n2. category=" + category + "\n3. lendDate=" + lendDate + "\n4. lend=" + lend
				+ "\n5. lendName=" + lendName;
	}
	
}
