package com.example.bellman_task.Model;

import java.util.List;

public class Data{
	private List<HotSpotsItem> hot_spots;
	private List<AttractionsItem> attractions;
	private List<EventsItem> events;

	public void setHotSpots(List<HotSpotsItem> hot_spots){
		this.hot_spots = hot_spots;
	}

	public List<HotSpotsItem> getHotSpots(){
		return hot_spots;
	}

	public void setAttractions(List<AttractionsItem> attractions){
		this.attractions = attractions;
	}

	public List<AttractionsItem> getAttractions(){
		return attractions;
	}

	public void setEvents(List<EventsItem> events){
		this.events = events;
	}

	public List<EventsItem> getEvents(){
		return events;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"hot_spots = '" + hot_spots + '\'' +
			",attractions = '" + attractions + '\'' + 
			",events = '" + events + '\'' + 
			"}";
		}
}