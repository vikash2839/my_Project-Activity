package com.ltts.playerproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player{
	@Id
	@GeneratedValue
	
	private int playernumber;
	private String playername;
	public int getPlayernumber() {
		return playernumber;
	}
	public void setPlayernumber(int playernumber) {
		this.playernumber = playernumber;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
