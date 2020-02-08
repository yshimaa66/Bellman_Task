package com.example.bellman_task.Model;

import java.util.List;

public class HotSpotsItem{
	private String shortDescription;
	private List<Object> externalRating;
	private Object city;
	private List<Object> cuisineTypes;
	private String description;
	private Object instagram;
	private List<Object> video;
	private Object facebookImage;
	private List<String> photos;
	private List<Object> features;
	private Object twitter;
	private int id;
	private List<CategoriesItem> categories;
	private List<Object> menus;
	private Object arabicDescription;
	private String lat;
	private int views;
	private List<Object> offers;
	private Object arabicShortDescription;
	private String website;
	private String address;
	private String lng;
	private String profilePhoto;
	private Object facebook;
	private Object facebookId;
	private Object phone;
	private Object arabicName;
	private String name;
	private String priceOfTwo;
	private Object neighborhood;
	private Object cityId;

	public void setShortDescription(String shortDescription){
		this.shortDescription = shortDescription;
	}

	public String getShortDescription(){
		return shortDescription;
	}

	public void setExternalRating(List<Object> externalRating){
		this.externalRating = externalRating;
	}

	public List<Object> getExternalRating(){
		return externalRating;
	}

	public void setCity(Object city){
		this.city = city;
	}

	public Object getCity(){
		return city;
	}

	public void setCuisineTypes(List<Object> cuisineTypes){
		this.cuisineTypes = cuisineTypes;
	}

	public List<Object> getCuisineTypes(){
		return cuisineTypes;
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

	public void setVideo(List<Object> video){
		this.video = video;
	}

	public List<Object> getVideo(){
		return video;
	}

	public void setFacebookImage(Object facebookImage){
		this.facebookImage = facebookImage;
	}

	public Object getFacebookImage(){
		return facebookImage;
	}

	public void setPhotos(List<String> photos){
		this.photos = photos;
	}

	public List<String> getPhotos(){
		return photos;
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

	public void setMenus(List<Object> menus){
		this.menus = menus;
	}

	public List<Object> getMenus(){
		return menus;
	}

	public void setArabicDescription(Object arabicDescription){
		this.arabicDescription = arabicDescription;
	}

	public Object getArabicDescription(){
		return arabicDescription;
	}

	public void setLat(String lat){
		this.lat = lat;
	}

	public String getLat(){
		return lat;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setOffers(List<Object> offers){
		this.offers = offers;
	}

	public List<Object> getOffers(){
		return offers;
	}

	public void setArabicShortDescription(Object arabicShortDescription){
		this.arabicShortDescription = arabicShortDescription;
	}

	public Object getArabicShortDescription(){
		return arabicShortDescription;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setLng(String lng){
		this.lng = lng;
	}

	public String getLng(){
		return lng;
	}

	public void setProfilePhoto(String profilePhoto){
		this.profilePhoto = profilePhoto;
	}

	public String getProfilePhoto(){
		return profilePhoto;
	}

	public void setFacebook(Object facebook){
		this.facebook = facebook;
	}

	public Object getFacebook(){
		return facebook;
	}

	public void setFacebookId(Object facebookId){
		this.facebookId = facebookId;
	}

	public Object getFacebookId(){
		return facebookId;
	}

	public void setPhone(Object phone){
		this.phone = phone;
	}

	public Object getPhone(){
		return phone;
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

	public void setPriceOfTwo(String priceOfTwo){
		this.priceOfTwo = priceOfTwo;
	}

	public String getPriceOfTwo(){
		return priceOfTwo;
	}

	public void setNeighborhood(Object neighborhood){
		this.neighborhood = neighborhood;
	}

	public Object getNeighborhood(){
		return neighborhood;
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
			"HotSpotsItem{" + 
			"short_description = '" + shortDescription + '\'' + 
			",external_rating = '" + externalRating + '\'' + 
			",city = '" + city + '\'' + 
			",cuisineTypes = '" + cuisineTypes + '\'' + 
			",description = '" + description + '\'' + 
			",instagram = '" + instagram + '\'' + 
			",video = '" + video + '\'' + 
			",facebook_image = '" + facebookImage + '\'' + 
			",photos = '" + photos + '\'' + 
			",features = '" + features + '\'' + 
			",twitter = '" + twitter + '\'' + 
			",id = '" + id + '\'' + 
			",categories = '" + categories + '\'' + 
			",menus = '" + menus + '\'' + 
			",arabic_description = '" + arabicDescription + '\'' + 
			",lat = '" + lat + '\'' + 
			",views = '" + views + '\'' + 
			",offers = '" + offers + '\'' + 
			",arabic_short_description = '" + arabicShortDescription + '\'' + 
			",website = '" + website + '\'' + 
			",address = '" + address + '\'' + 
			",lng = '" + lng + '\'' + 
			",profile_photo = '" + profilePhoto + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",facebook_id = '" + facebookId + '\'' + 
			",phone = '" + phone + '\'' + 
			",arabic_name = '" + arabicName + '\'' + 
			",name = '" + name + '\'' + 
			",price_of_two = '" + priceOfTwo + '\'' + 
			",neighborhood = '" + neighborhood + '\'' + 
			",city_id = '" + cityId + '\'' + 
			"}";
		}
}