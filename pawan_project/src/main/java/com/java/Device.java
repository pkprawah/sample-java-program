package com.java;

import java.util.List;

public class Device {
	
	private String deviceName;
	private List<String> portNo;
	private String deviceLocation;
	

	
	public String getDeviceLocation() {
		return deviceLocation;
	}
	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}
	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", Location=" + deviceLocation + "]";
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public List<String> getPortNo() {
		return portNo;
	}
	public void setPortNo(List<String> portNo) {
		this.portNo = portNo;
	}
		
}
