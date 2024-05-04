package org.juanpla.iphone;

import java.util.HashMap;
import java.util.Map;

import org.juanpla.iphone.hwdrivers.FileSystem;
import org.juanpla.iphone.hwdrivers.HardwareDriver;
import org.juanpla.iphone.hwdrivers.ProximitySensor;
import org.juanpla.iphone.hwdrivers.Screen;
import org.juanpla.iphone.hwdrivers.Speaker;

public class IPhone {
	private Map<DRIVER_NAME, HardwareDriver> drivers;

	public enum DRIVER_NAME {
		SPEAKER, PROXIMITY, SCREEN, FILE_SYSTEM
	};

	public Map<DRIVER_NAME, HardwareDriver> getDrivers() {
		return drivers;
	}

	public void setDrivers(Map<DRIVER_NAME, HardwareDriver> drivers) {
		this.drivers = drivers;
	}

	public IPhone() {
		setDrivers(new HashMap<DRIVER_NAME, HardwareDriver>());
		loadDrivers();
	}

	private void loadDrivers() {
		FileSystem fileSystem = new FileSystem();
		ProximitySensor proximitySensor = new ProximitySensor();
		Screen screen = new Screen();
		Speaker speaker = new Speaker();

		drivers.put(DRIVER_NAME.SPEAKER, speaker);
		drivers.put(DRIVER_NAME.FILE_SYSTEM, fileSystem);
		drivers.put(DRIVER_NAME.SCREEN, screen);
		drivers.put(DRIVER_NAME.PROXIMITY, proximitySensor);
	}

}
