package com.mta.se.lab.basic.classes;
/**
 * 
 * @author ADY
 * @since 2014-10-30 
 * This is an abstract class that models maintenance part for every plane
 */

public abstract class Plane {
	
	  private String  mModel;
	  
	  public String getmModel() {
		return mModel;
	}
	public void setmModel(String mModel) {
		this.mModel = mModel;
	}
	/**
	   * The default constructor initialize the model of the plane
	   * @param model The model of the plane
	   */
	  public Plane(String model)
	  {
	   this.mModel=model;
	  }
	/**
	 * This method shows how many days a specific plane has until inspection
	 * @return An integer representing number of days remained until inspection
	 * @param inspected This parameter shows how many days have past from the last inspection 
	 */
	public abstract int  daysUntilInspection(int inspected);
	/**
	 * This method shows all the problems detected at a specific plane
	 * @param sitsProblem Boolean parameter showing if there is any problem with the passengers sits
	 * @param engineProblem Boolean parameter showing if there is any problem at the engine 
	 */
	public void problemsDetected(boolean sitsProblem,boolean engineProblem)
	{
		if(!sitsProblem)
			System.out.println("Problem with passengers sits detected ");
		else
			System.out.println("Passengers doesn't report any problem with their sits");
		if(!engineProblem)
			System.out.println("Problem at the engine detected ");
		else
			System.out.println("The engine is working properly");
	}
	
	/**
	 * This method shows total costs of a specific plane for maintenance
	 * @param model This parameter represent the model of the plane
	 * @return A float representing total costs of maintenance 
	 */
	public abstract float maintenanceCosts(String model);
	
}
