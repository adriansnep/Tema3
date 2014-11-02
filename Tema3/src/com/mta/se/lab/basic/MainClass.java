package com.mta.se.lab.basic;

import com.mta.se.lab.basic.classes.CargoPlane;
import com.mta.se.lab.basic.classes.PassengerPlane;
import com.mta.se.lab.basic.classes.Plane;
import com.mta.se.lab.basic.exceptions.PlaneStateException;

/**
 * 
 * @author ADY
 * @since  2014-10-30
 */
public class MainClass {

	/**
     * The entry point to the project
     *
     * @param args  The arguments to the executable
     */
	public static void main(String[] args) {
		CargoPlane cargoPlane=new CargoPlane("Antonov",1000);
		PassengerPlane passengerPlane=new PassengerPlane("Boeing747");
		Plane littlePassengerPlane=new PassengerPlane("Airliner");

		try {
			System.out.println("The cargo plane has "+cargoPlane.daysUntilInspection(39)+" days until inspection");
		} catch (Exception e) {
			System.out.println("Exception thrown:"+e.getMessage());
			e.printStackTrace();
		}
		try {
			cargoPlane.flightCosts("Antonov");
		} catch (Exception e) {
			System.out.println("Exception thrown:"+e.getMessage());
			e.printStackTrace();
		}
		try {
			passengerPlane.plainState();
		} catch (PlaneStateException e) {
			System.out.println("Exception thrown:"+e.getMessage());
			e.printStackTrace();
		}
		
		try {
			System.out.println("Maintenance costs for a liitle passengers plane is "+littlePassengerPlane.maintenanceCosts("Airliner")+" $");
		} catch (Exception e) {
			System.out.println("Exception thrown:"+e.getMessage());
			e.printStackTrace();
		}
	}

}
