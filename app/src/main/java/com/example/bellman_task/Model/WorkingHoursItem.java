package com.example.bellman_task.Model;

public class WorkingHoursItem{
	private Object date;
	private String from;
	private int id;
	private String to;

	public void setDate(Object date){
		this.date = date;
	}

	public Object getDate(){
		return date;
	}

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTo(String to){
		this.to = to;
	}

	public String getTo(){
		return to;
	}

	@Override
 	public String toString(){
		return 
			"WorkingHoursItem{" + 
			"date = '" + date + '\'' + 
			",from = '" + from + '\'' + 
			",id = '" + id + '\'' + 
			",to = '" + to + '\'' + 
			"}";
		}
}
