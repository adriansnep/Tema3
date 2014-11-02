package com.mta.se.lab.basic.classes;

import com.mta.se.lab.basic.exceptions.PlaneStateException;
import com.mta.se.lab.basic.interfaces.IFlightDetails;


/**
 * 
 * @author ADY
 * @since 2014-10-30
 * This class is specific for a cargo plane
 */
public class CargoPlane extends Plane implements IFlightDetails
{
	private float mCapacity;

	public float getmCapacity() {
		return mCapacity;
	}

	public void setmCapacity(float capacity) {
		this.mCapacity = capacity;
	}

	public CargoPlane(String model,int capacity) {
		super(model);
		mCapacity=capacity;
	}

	@Override
	public int daysUntilInspection(int inspected) {
		int daysToInspection=90-inspected;
		return daysToInspection;
	}

	@Override
	public float maintenanceCosts(String model) {
		if(model.equals("Antonov"))
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
		if(getmModel()==null && getmCapacity()==0)
			System.out.println("Please introduce the model and the capacity of the plane .");
		else
			System.out.println("This plane is ready to fly.");
		
	}

	@Override
	public void flightCosts(String model) {
		if(model.equals("Antonov"))
			System.out.println("This fly will cost company 1500$.");
		else
			System.out.println("This fly will cost company 1700$.");
		
	}

}
