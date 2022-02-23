package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMapDemo {

	public static void main(String[] args) {

		Device device = new Device();
		List<Device> deviceList = new ArrayList<Device>();

		device.setDeviceLocation("Kormangala");
		device.setDeviceName("FX");

		Device device1 = new Device();
		device1.setDeviceLocation("Indira Nagar");
		device1.setDeviceName("CX");

		Device device2 = new Device();
		device2.setDeviceLocation("Indira Nagar");
		device2.setDeviceName("BX");

		Device device3 = new Device();
		device3.setDeviceLocation("JAYA Nagar");
		device3.setDeviceName("BX");

		Device device4 = new Device();
		device4.setDeviceLocation("JAYA Nagar");
		device4.setDeviceName("AX");

		Device device5 = new Device();

		device5.setDeviceName("AX");
		device5.setDeviceLocation("BTM");

		deviceList.add(device);
		deviceList.add(device1);
		deviceList.add(device2);
		deviceList.add(device3);
		deviceList.add(device4);
		deviceList.add(device5);

		System.out.println("Device List details:: " + deviceList);

		// deviceList.forEach()

		/*
		 * Map<String, List<String>> map = deviceList.stream()
		 * .collect(Collectors.
		 * groupingBy(deviceList::getDeviceName,Collectors.mapping(deviceList.
		 * stream().filter(device->device.getDeviceLocation()),
		 * Collectors.toList()));
		 * 
		 */

		/*
		 * private Map<String, Choice> toMap(List books) { final Map hashMap =
		 * new HashMap<>(); for (final Book book : books) {
		 * if(hashMap.containsKey(book.getISBN())){
		 * =hashMap.get(book.getISBN()); } hashMap.put(book.getISBN(), book); }
		 * 
		 * return hashMap; }
		 */

		Map<String, List<String>> map = deviceList.stream().flatMap(dev -> {
			Map<String, String> um = new HashMap<>();
			um.put("names", dev.getDeviceName());
			um.put("loc", dev.getDeviceLocation());
			return um.entrySet().stream();
		}) // produces a Stream<Map.Entry<String,String>>
				.collect(Collectors.groupingBy(Map.Entry::getKey,
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

		System.out.println("converting list of device object into map<String,List<String>>" + map);

		Map<String, String> mapvalue = deviceList.stream().collect(Collectors.toMap(new Function<Device, String>() {

			@Override
			public String apply(Device t) {

				return t.getDeviceName();
			}

		}, new Function<Device, String>() {

			@Override
			public String apply(Device t) {

				return t.getDeviceLocation();
			}

		}, (oldvalue, newValue) -> oldvalue));

		System.out.println("map functionss :: " + mapvalue);

		Map<String, List<String>> result = deviceList.stream().collect(Collectors.groupingBy(Device::getDeviceName,
				Collectors.mapping(Device::getDeviceLocation, Collectors.toList())));

		System.out.println("Required result is ::" + result);

		Map<String, List<Device>> resultObject = deviceList.stream().collect(Collectors
				.groupingBy(Device::getDeviceName, Collectors.mapping(Function.identity(), Collectors.toList())));

		System.out.println("Required result of device object is  ::" + resultObject);

	}

}
