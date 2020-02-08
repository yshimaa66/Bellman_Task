package com.example.bellman_task.Model;

import java.util.List;

public class AttractionsItem{
	private List<Object> offers;
	private int isActive;
	private String lng;
	private Object markup;
	private City city;
	private Object facebook;
	private String description;
	private Object instagram;
	private List<String> photos;
	private String durationUnit;
	private String duration;
	private List<Object> features;
	private Object twitter;
	private String trypsId;
	private String terms;
	private List<WorkingHoursItem> workingHours;
	private String arabicName;
	private String generalTerms;
	private String exlcude;
	private String name;
	private int id;
	private List<CategoriesItem> categories;
	private String arabicDescription;
	private String lat;

	public void setOffers(List<Object> offers){
		this.offers = offers;
	}

	public List<Object> getOffers(){
		return offers;
	}

	public void setIsActive(int isActive){
		this.isActive = isActive;
	}

	public int getIsActive(){
		return isActive;
	}

	public void setLng(String lng){
		this.lng = lng;
	}

	public String getLng(){
		return lng;
	}

	public void setMarkup(Object markup){
		this.markup = markup;
	}

	public Object getMarkup(){
		return markup;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	public void setFacebook(Object facebook){
		this.facebook = facebook;
	}

	public Object getFacebook(){
		return facebook;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setInstagram(Object instagram){
		this.instagram = instagram;
	}

	public Object getInstagram(){
		return instagram;
	}

	public void setPhotos(List<String> photos){
		this.photos = photos;
	}

	public List<String> getPhotos(){
		return photos;
	}

	public void setDurationUnit(String durationUnit){
		this.durationUnit = durationUnit;
	}

	public String getDurationUnit(){
		return durationUnit;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setFeatures(List<Object> features){
		this.features = features;
	}

	public List<Object> getFeatures(){
		return features;
	}

	public void setTwitter(Object twitter){
		this.twitter = twitter;
	}

	public Object getTwitter(){
		return twitter;
	}

	public void setTrypsId(String trypsId){
		this.trypsId = trypsId;
	}

	public String getTrypsId(){
		return trypsId;
	}

	public void setTerms(String terms){
		this.terms = terms;
	}

	public String getTerms(){
		return terms;
	}

	public void setWorkingHours(List<WorkingHoursItem> workingHours){
		this.workingHours = workingHours;
	}

	public List<WorkingHoursItem> getWorkingHours(){
		return workingHours;
	}

	public void setArabicName(String arabicName){
		this.arabicName = arabicName;
	}

	public String getArabicName(){
		return arabicName;
	}

	public void setGeneralTerms(String generalTerms){
		this.generalTerms = generalTerms;
	}

	public String getGeneralTerms(){
		return generalTerms;
	}

	public void setExlcude(String exlcude){
		this.exlcude = exlcude;
	}

	public String getExlcude(){
		return exlcude;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategories(List<CategoriesItem> categories){
		this.categories = categories;
	}

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	public void setArabicDescription(String arabicDescription){
		this.arabicDescription = arabicDescription;
	}

	public String getArabicDescription(){
		return arabicDescription;
	}

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"AttractionsItem{" + 
			"offers = '" + offers + '\'' + 
			",is_active = '" + isActive + '\'' + 
			",lng = '" + lng + '\'' + 
			",markup = '" + markup + '\'' + 
			",city = '" + city + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",description = '" + description + '\'' + 
			",instagram = '" + instagram + '\'' + 
			",photos = '" + photos + '\'' + 
			",duration_unit = '" + durationUnit + '\'' + 
			",duration = '" + duration + '\'' + 
			",features = '" + features + '\'' + 
			",twitter = '" + twitter + '\'' + 
			",tryps_id = '" + trypsId + '\'' + 
			",terms = '" + terms + '\'' + 
			",working_hours = '" + workingHours + '\'' + 
			",arabic_name = '" + arabicName + '\'' + 
			",general_terms = '" + generalTerms + '\'' + 
			",exlcude = '" + exlcude + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",categories = '" + categories + '\'' + 
			",arabic_description = '" + arabicDescription + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}