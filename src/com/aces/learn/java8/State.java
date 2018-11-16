package com.aces.learn.java8;

/**
 * @author aagarwal
 * This is a Test Change Directly on GitHub 2
 */
public class State {
	private String code;
	private String name;
	private Integer counties;
	private boolean eastCoast;
	private LOCATION location;
	
	public State(){
		
	}
	/**
	 * 
	 */
	public State(String code, String name, Integer counties, boolean eastCoast, State.LOCATION location){
		this.code = code;
		this.name = name;
		this.counties = counties;
		this.eastCoast = eastCoast;
		this.location = location;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the eastCoast
	 */
	public boolean isEastCoast() {
		return eastCoast;
	}
	/**
	 * @param eastCoast the eastCoast to set
	 */
	public void setEastCoast(boolean eastCoast) {
		this.eastCoast = eastCoast;
	}
	/**
	 * @return the counties
	 */
	public Integer getCounties() {
		return counties;
	}
	/**
	 * @param counties the counties to set
	 */
	public void setCounties(Integer counties) {
		this.counties = counties;
	}
	/**
	 * 
	 */
	public String toString(){
		return "\nState -> {Name:"+this.name+", No Of Counties:"+this.counties+", East Coast:"+this.eastCoast+"}";
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the location
	 */
	public LOCATION getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(LOCATION location) {
		this.location = location;
	}
	/**
	 * 
	 * @author aagarwal
	 *
	 */
	public enum LOCATION { EAST, WEST, NORTH, SOUTH , CENTRAL }
}
