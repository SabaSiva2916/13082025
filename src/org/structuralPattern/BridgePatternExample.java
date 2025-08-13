package org.structuralPattern;

interface Tv {
	void on();

	void off();

	void tuneChannel(int channelNo);
}

class SonyTV implements Tv {

	public void on() {
		System.out.println("Sony TV is ON");

	}

	public void off() {
		System.out.println("Sony TV is OFF");

	}

	public void tuneChannel(int channelNo) {
		System.out.println("Sony TV tuned to Channel :" + channelNo);
	}

}

class SamsungTV implements Tv {
	public void on() {
		System.out.println("Samsung TV is ON");

	}

	public void off() {
		System.out.println("Samsung TV is OFF");

	}

	public void tuneChannel(int channelNo) {
		System.out.println("Samsung TV tuned to Channel :" + channelNo);
	}
}

abstract class RemoteControl {

	protected Tv tv;

	public RemoteControl(Tv tv) {
		this.tv = tv;
	}

	public abstract void turnON();

	public abstract void turnOFF();

	public abstract void setChannel(int channel);
}

class BasicRemote extends RemoteControl {

	public BasicRemote(Tv tv) {
		super(tv);

	}

	public void turnON() {
		tv.on();

	}

	public void turnOFF() {
		tv.off();

	}

	public void setChannel(int channel) {
		tv.tuneChannel(channel);

	}

}

public class BridgePatternExample {

	public static void main(String[] args) {

		Tv sony = new SonyTV();
		RemoteControl control = new BasicRemote(sony);
		control.turnON();
		control.setChannel(1000);
		control.turnOFF();

	}

}
