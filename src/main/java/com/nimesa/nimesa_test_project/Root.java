package com.nimesa.nimesa_test_project;

import java.util.ArrayList;

public class Root{
	 public String cod;
	 public double message;
	 public int cnt;
	 public ArrayList<List> list;
	 public Root city;
	 
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public double getMessage() {
		return message;
	}
	public void setMessage(double message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public ArrayList<List> getList() {
		return list;
	}
	public void setList(ArrayList<List> list) {
		this.list = list;
	}
	public Root getCity() {
		return city;
	}
	public void setCity(Root city) {
		this.city = city;
	}
	 
	}
class City{
 public int id;
 public String name;
 public Coord coord;
 public String country;
 public int population;
}

class Clouds{
 public int all;
}

class Coord{
 public double lat;
 public double lon;
}

class List{
 public long dt;
 public Main main;
 public ArrayList<Weather> weather;
 public Clouds clouds;
 public Wind wind;
 public Sys sys;
 public String dt_txt;
public long getDt() {
	return dt;
}
public void setDt(long dt) {
	this.dt = dt;
}
public Main getMain() {
	return main;
}
public void setMain(Main main) {
	this.main = main;
}
public ArrayList<Weather> getWeather() {
	return weather;
}
public void setWeather(ArrayList<Weather> weather) {
	this.weather = weather;
}
public Clouds getClouds() {
	return clouds;
}
public void setClouds(Clouds clouds) {
	this.clouds = clouds;
}
public Wind getWind() {
	return wind;
}
public void setWind(Wind wind) {
	this.wind = wind;
}
public Sys getSys() {
	return sys;
}
public void setSys(Sys sys) {
	this.sys = sys;
}
public String getDt_txt() {
	return dt_txt;
}
public void setDt_txt(String dt_txt) {
	this.dt_txt = dt_txt;
}
 
 
}

class Main{
 public double temp;
 public double temp_min;
 public double temp_max;
 public double pressure;
 public double sea_level;
 public double grnd_level;
 public int humidity;
 public double temp_kf;
 
public double getTemp() {
	return temp;
}
public void setTemp(double temp) {
	this.temp = temp;
}
public double getTemp_min() {
	return temp_min;
}
public void setTemp_min(double temp_min) {
	this.temp_min = temp_min;
}
public double getTemp_max() {
	return temp_max;
}
public void setTemp_max(double temp_max) {
	this.temp_max = temp_max;
}
public double getPressure() {
	return pressure;
}
public void setPressure(double pressure) {
	this.pressure = pressure;
}
public double getSea_level() {
	return sea_level;
}
public void setSea_level(double sea_level) {
	this.sea_level = sea_level;
}
public double getGrnd_level() {
	return grnd_level;
}
public void setGrnd_level(double grnd_level) {
	this.grnd_level = grnd_level;
}
public int getHumidity() {
	return humidity;
}
public void setHumidity(int humidity) {
	this.humidity = humidity;
}
public double getTemp_kf() {
	return temp_kf;
}
public void setTemp_kf(double temp_kf) {
	this.temp_kf = temp_kf;
}
 
}

class Sys{
 public String pod;
}

class Weather{
 public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
public int id;
 public String main;
 public String description;
 public String icon;
}

class Wind{
 public double speed;
 
 public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public double deg;
}

