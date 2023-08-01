package com.nimesa.nimesa_test_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationServiceTest {

	@Autowired
	RestTemplate restTemplate;

	String API_URL = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";

	public Map<String, ArrayList<Double>> locationTest(int input, String date) throws ParseException {
		
		Root root = null;
		Map<String, Double> map = new HashMap<>();
		
		switch (input) {
		case 0: {
			System.exit(0);
		}
		case 1: {
			root = getApiResponse();
			return getWeatherTest(root, date);
		}
		case 2: {
			root = getApiResponse();
			return windSpeedTest(root, date);
		}
		case 3: {
			root = getApiResponse();
			return pressureTest(root, date);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}

	}

	public Map<String, ArrayList<Double>> getWeatherTest(Root root, String date) throws ParseException {
		Map<String, ArrayList<Double>> map = new HashMap<>();
		ArrayList lst = new ArrayList<>();
		ArrayList<List> list = root.getList();
		
		
		for(int i=0; i<list.size();i++) {
			String resDate = list.get(i).dt_txt;
			String date1=new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyy-MM-dd").parse(resDate));
			if (date1.equals(date)) {
				Main main = list.get(i).getMain();
				lst.add(main.getTemp());
			}
		}
		
		map.put(date, lst);
		return map;
	}

	public Map<String, ArrayList<Double>> windSpeedTest(Root root, String date) throws ParseException {
		Map<String, ArrayList<Double>> map = new HashMap<>();
		ArrayList lst = new ArrayList<>();
		ArrayList<List> list = root.getList();
		
		for(int i=0; i<list.size();i++) {
			String resDate = list.get(i).dt_txt;
			String date1=new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyy-MM-dd").parse(resDate));
			if (date1.equals(date)) {
				Wind wind = list.get(i).getWind();
				lst.add(wind.getSpeed());
			}
		}
		map.put(date, lst);
		return map;

	}

	public Map<String, ArrayList<Double>> pressureTest(Root root, String date) throws ParseException {
		Map<String, ArrayList<Double>> map = new HashMap<>();
		ArrayList lst = new ArrayList<>();
		ArrayList<List> list = root.getList();
		
		for(int i=0; i<list.size();i++) {
			String resDate = list.get(i).dt_txt;
			String date1=new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("yyyy-MM-dd").parse(resDate));
			if (date1.equals(date)) {
				Main main = list.get(i).getMain();
				lst.add(main.getPressure());
			}
		}
		map.put(date, lst);
		return map;

	}
	public Root getApiResponse() {
		return restTemplate.getForObject(API_URL, Root.class);
	}

}
