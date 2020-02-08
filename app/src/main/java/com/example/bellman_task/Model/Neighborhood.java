package com.example.bellman_task.Model;

public class Neighborhood{
	private Object lng;
	private String updatedAt;
	private Object arabicName;
	private String name;
	private String createdAt;
	private Object zoom;
	private int id;
	private Object lat;
	private Object cityId;

	public void setLng(Object lng){
		this.lng = lng;
	}

	public Object getLng(){
		return lng;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setArabicName(Object arabicName){
		this.arabicName = arabicName;
	}

	public Object getArabicName(){
		return arabicName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
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

	public void setCityId(Object cityId){
		this.cityId = cityId;
	}

	public Object getCityId(){
		return cityId;
	}

	@Override
 	public String toString(){
		return 
			"Neighborhood{" + 
			"lng = '" + lng + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",arabic_name = '" + arabicName + '\'' + 
			",name = '" + name + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",zoom = '" + zoom + '\'' + 
			",id = '" + id + '\'' + 
			",lat = '" + lat + '\'' + 
			",city_id = '" + cityId + '\'' + 
			"}";
		}
}
