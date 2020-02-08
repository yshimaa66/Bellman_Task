package com.example.bellman_task.Model;

public class CategoriesItem{
	private String coverImageUrl;
	private String name;
	private String iconImageUrl;
	private String arName;
	private int id;

	public void setCoverImageUrl(String coverImageUrl){
		this.coverImageUrl = coverImageUrl;
	}

	public String getCoverImageUrl(){
		return coverImageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIconImageUrl(String iconImageUrl){
		this.iconImageUrl = iconImageUrl;
	}

	public String getIconImageUrl(){
		return iconImageUrl;
	}

	public void setArName(String arName){
		this.arName = arName;
	}

	public String getArName(){
		return arName;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CategoriesItem{" + 
			"cover_image_url = '" + coverImageUrl + '\'' + 
			",name = '" + name + '\'' + 
			",icon_image_url = '" + iconImageUrl + '\'' + 
			",ar_name = '" + arName + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
