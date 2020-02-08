package com.example.bellman_task.Model;

import java.util.List;

public class EventsItem{
	private String endDate;
	private String shortDescription;
	private City city;
	private String description;
	private String instagram;
	private List<Object> photos;
	private String videoPreview;
	private List<FeaturesItem> features;
	private String twitter;
	private int id;
	private List<CategoriesItem> categories;
	private String arabicDescription;
	private Object lat;
	private int views;
	private String startDate;
	private String wholePrice;
	private List<Object> offers;
	private String arabicShortDescription;
	private Object website;
	private String address;
	private Object lng;
	private String ticketPrice;
	private String facebook;
	private String arabicName;
	private String name;
	private String pricePerDay;
	private int cityId;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setInstagram(String instagram){
		this.instagram = instagram;
	}

	public String getInstagram(){
		return instagram;
	}

	public void setPhotos(List<Object> photos){
		this.photos = photos;
	}

	public List<Object> getPhotos(){
		return photos;
	}

	public void setVideoPreview(String videoPreview){
		this.videoPreview = videoPreview;
	}

	public String getVideoPreview(){
		return videoPreview;
	}

	public void setFeatures(List<FeaturesItem> features){
		this.features = features;
	}

	public List<FeaturesItem> getFeatures(){
		return features;
	}

	public void setTwitter(String twitter){
		this.twitter = twitter;
	}

	public String getTwitter(){
		return twitter;
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

	public void setLat(Object lat){
		this.lat = lat;
	}

	public Object getLat(){
		return lat;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setWholePrice(String wholePrice){
		this.wholePrice = wholePrice;
	}

	public String getWholePrice(){
		return wholePrice;
	}

	public void setOffers(List<Object> offers){
		this.offers = offers;
	}

	public List<Object> getOffers(){
		return offers;
	}

	public void setArabicShortDescription(String arabicShortDescription){
		this.arabicShortDescription = arabicShortDescription;
	}

	public String getArabicShortDescription(){
		return arabicShortDescription;
	}

	public void setWebsite(Object website){
		this.website = website;
	}

	public Object getWebsite(){
		return website;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setLng(Object lng){
		this.lng = lng;
	}

	public Object getLng(){
		return lng;
	}

	public void setTicketPrice(String ticketPrice){
		this.ticketPrice = ticketPrice;
	}

	public String getTicketPrice(){
		return ticketPrice;
	}

	public void setFacebook(String facebook){
		this.facebook = facebook;
	}

	public String getFacebook(){
		return facebook;
	}

	public void setArabicName(String arabicName){
		this.arabicName = arabicName;
	}

	public String getArabicName(){
		return arabicName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPricePerDay(String pricePerDay){
		this.pricePerDay = pricePerDay;
	}

	public String getPricePerDay(){
		return pricePerDay;
	}

	public void setCityId(int cityId){
		this.cityId = cityId;
	}

	public int getCityId(){
		return cityId;
	}

	@Override
 	public String toString(){
		return 
			"EventsItem{" + 
			"end_date = '" + endDate + '\'' + 
			",short_description = '" + shortDescription + '\'' + 
			",city = '" + city + '\'' + 
			",description = '" + description + '\'' + 
			",instagram = '" + instagram + '\'' + 
			",photos = '" + photos + '\'' + 
			",video_preview = '" + videoPreview + '\'' + 
			",features = '" + features + '\'' + 
			",twitter = '" + twitter + '\'' + 
			",id = '" + id + '\'' + 
			",categories = '" + categories + '\'' + 
			",arabic_description = '" + arabicDescription + '\'' + 
			",lat = '" + lat + '\'' + 
			",views = '" + views + '\'' + 
			",start_date = '" + startDate + '\'' + 
			",whole_price = '" + wholePrice + '\'' + 
			",offers = '" + offers + '\'' + 
			",arabic_short_description = '" + arabicShortDescription + '\'' + 
			",website = '" + website + '\'' + 
			",address = '" + address + '\'' + 
			",lng = '" + lng + '\'' + 
			",ticket_price = '" + ticketPrice + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",arabic_name = '" + arabicName + '\'' + 
			",name = '" + name + '\'' + 
			",price_per_day = '" + pricePerDay + '\'' + 
			",city_id = '" + cityId + '\'' + 
			"}";
		}
}