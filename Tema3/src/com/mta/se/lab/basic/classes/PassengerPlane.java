package com.mta.se.lab.basic.classes;

import com.mta.se.lab.basic.exceptions.PlaneStateException;
import com.mta.se.lab.basic.interfaces.IFlightDetails;


/**
 * 
 * @author ADY
 * @since 2014-10-30
 * This class is specific for a passengers plane
 */

public class PassengerPlane extends Plane implements IFlightDetails{

	/**
	 * This is the default constructor which initialize the plane model
	 * @param model The parameter represent the model of the plane
	 */
	public PassengerPlane(String model) {
		super(model);
		
	}

	@Override
	public int daysUntilInspection(int inspected) {
		int daysToInspection=60-inspected;
		return daysToInspection;
	}

	@Override
	public float maintenanceCosts(String model) {
		if(model.equals("Boeing747"))
			return 400;
		else
			return 500;
	}

	@Override
	public void flightSchedule(String destination) {
		if(destination.equals("Chicago"))
			System.out.println("Schedule of the flight is Bucharest-London-Chicago.");
		else 
			System.out.println("The schedule isn't established yet.");
		
	}

	@Override
	public void plainState() throws PlaneStateException {
		if(getmModel()==null)
			System.out.println("Please introduce the model of the plane.");
		else
			System.out.println("This plane is ready to fly.");
		
	}

	@Override
	public void flightCosts(String model) {
		if(model.equals("Airbus A380"))
			System.out.println("This fly will cost company 1000$.");
		else
			System.out.println("This fly will cost company 1200$.");
	}

}
