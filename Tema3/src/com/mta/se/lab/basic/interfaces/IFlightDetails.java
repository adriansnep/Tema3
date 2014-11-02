package com.mta.se.lab.basic.interfaces;

import com.mta.se.lab.basic.exceptions.PlaneStateException;

/**
 * 
 * @author ADY
 * @since 2014-10-30
 * This is an interface for all types of planes 
 */
public interface IFlightDetails {
	/**
	 * This method shows the flight schedule of a plane
	 * @param destination This parameter is the destination of the flight
	 */
	public void flightSchedule(String destination);
	/**
	 * This method shows the state of a plane at a time
	 * @throws PlaneStateException
	 */
	public void plainState() throws PlaneStateException;
	/**
	 * This method shows the costs of a flight for a specific plane
	 * @param model This parameter represents the model of the plane
	 */
	public void flightCosts(String model);
}
