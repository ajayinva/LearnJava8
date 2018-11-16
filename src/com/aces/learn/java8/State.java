package com.aces.learn.java8;

/**
 * @author aagarwal
 */
public class State {
  private String code;
  private String name;
  private Integer counties;
  private boolean eastCoast;
  private LOCATION location;
  private String test;

  public State(){

  }
  /**
   *
   */
  public State(final String code, final String name, final Integer counties, final boolean eastCoast, final State.LOCATION location){
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
    return this.name;
  }
  /**
   * @param name the name to set
   */
  public void setName(final String name) {
    this.name = name;
  }
  /**
   * @return the eastCoast
   */
  public boolean isEastCoast() {
    return this.eastCoast;
  }
  /**
   * @param eastCoast the eastCoast to set
   */
  public void setEastCoast(final boolean eastCoast) {
    this.eastCoast = eastCoast;
  }
  /**
   * @return the counties
   */
  public Integer getCounties() {
    return this.counties;
  }
  /**
   * @param counties the counties to set
   */
  public void setCounties(final Integer counties) {
    this.counties = counties;
  }
  /**
   *
   */
  @Override
  public String toString(){
    return "\nState -> {Name:"+this.name+", No Of Counties:"+this.counties+", East Coast:"+this.eastCoast+"}";
  }
  /**
   * @return the code
   */
  public String getCode() {
    return this.code;
  }
  /**
   * @param code the code to set
   */
  public void setCode(final String code) {
    this.code = code;
  }
  /**
   * @return the location
   */
  public LOCATION getLocation() {
    return this.location;
  }
  /**
   * @param location the location to set
   */
  public void setLocation(final LOCATION location) {
    this.location = location;
  }
  /**
   *
   * @author aagarwal
   *
   */
  public enum LOCATION { EAST, WEST, NORTH, SOUTH , CENTRAL }
}
