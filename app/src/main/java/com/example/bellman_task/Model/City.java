package com.example.bellman_task.Model;

public class City{
	private Object lng;
	private String name;
	private Object zoom;
	private int id;
	private Object lat;

	public void setLng(Object lng){
		this.lng = lng;
	}

	public Object getLng(){
		return lng;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setZoom(Object zoom){
		this.zoom = zoom;
	}

	public Object getZoom(){
		return zoom;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLat(Object lat){
		this.lat = lat;
	}

	public Object getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"City{" + 
			"lng = '" + lng + '\'' + 
			",name = '" + name + '\'' + 
			",zoom = '" + zoom + '\'' + 
			",id = '" + id + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}
