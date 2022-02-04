package quiz;

public class TV {
	private int channel, volume;
	private String color;
	
	public TV() {
		//생성자
	}
	//생성자 Using field
	public TV(int channel, int volume, String color) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.color = color;
	}
	//getter, setter
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", color=" + color + "]";
	}
	private void Output() {
		System.out.println(this.toString());
	}
	
}
