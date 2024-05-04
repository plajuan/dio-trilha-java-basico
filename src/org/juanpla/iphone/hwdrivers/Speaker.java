package org.juanpla.iphone.hwdrivers;

public class Speaker implements HardwareDriver{
	private int volume;
	
	public void play() {
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void idle() {
		// TODO Auto-generated method stub
		
	}
}
