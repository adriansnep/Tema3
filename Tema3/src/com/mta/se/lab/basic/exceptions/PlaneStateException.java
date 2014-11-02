package com.mta.se.lab.basic.exceptions;

/**
 * 
 * @author ADY
 * @since 2014-10-30
 * This is the exception thrown by the {@link com.mta.se.lab.basic.interfaces.IPlane} interface
 */
@SuppressWarnings("serial")
public class PlaneStateException extends Exception{

	public PlaneStateException(String message)
	{
		super(message);
	}
}
