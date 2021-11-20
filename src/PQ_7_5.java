
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		if(!( MIN_CHANNEL <= channel && channel <= MAX_CHANNEL)) return;
		prevchannel = this.channel;
		this.channel = channel;
		
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		if(!(MIN_VOLUME <= volume && volume <= MAX_VOLUME)) return;
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevchannel);
	}
	
	
}

public class PQ_7_5 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
