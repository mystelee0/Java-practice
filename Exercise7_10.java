//자바의 정석 320 7-11문제
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prechannel=0;

	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;

	public boolean getPower(){ return isPowerOn; }
	public void setPower(boolean power){ this.isPowerOn=power; } 

	public int getChannel(){ return channel; }
	public void setChannel(int channel){ 
		prechannel=this.channel; //이전 채널을 저장한다
		this.channel=channel; 
	} 

	public int getVolume(){ return volume; }
	public void setVolume(int volume){ this.volume=volume; } 

	public void gotoPreChannel(){ //채널 교환 
		int temp=channel;
		channel=prechannel; 
		prechannel=temp;
	}
}

public class Exercise7_10{
	public static void main(String[] args){
		MyTv2 t =new MyTv2();

		t.setPower(true);
		System.out.println("POWER: "+t.getPower());
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel() );
		/*t.setVolume(30);
		System.out.println("VOL: "+t.getVolume() );*/
		t.setChannel(50);
		System.out.println("CH: "+t.getChannel() );

		t.gotoPreChannel();
		System.out.println("CH: "+t.getChannel() );

		t.setChannel(70);
		System.out.println("CH: "+t.getChannel() );

		t.gotoPreChannel();
		System.out.println("CH: "+t.getChannel() );
	}
}