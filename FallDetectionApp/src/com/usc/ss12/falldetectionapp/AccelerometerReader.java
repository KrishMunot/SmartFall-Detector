/*
 * Code for AccelerometerReader class based on:
 * http://www.anddev.org/accessing_the_accelerometer-t499.html
 */

package com.usc.ss12.falldetectionapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class AccelerometerReader {
	
	private boolean mAccelerometerAvailable = false;
    private boolean isEnabled = false;
    
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    public AccelerometerReader() throws UnsupportedOperationException { 
    	// Check if accelerometer exists
        for (Sensor aSensor : mSensorManager.getSensorList(Sensor.TYPE_ALL))
			if (aSensor.equals(Sensor.TYPE_ACCELEROMETER))
				mAccelerometerAvailable = true;
        if (!mAccelerometerAvailable)
        	throw new UnsupportedOperationException("Accelerometer is not available.");
    }

    public void setEnableAccelerometer(boolean doEnable) throws UnsupportedOperationException {
		if (!mAccelerometerAvailable)
			throw new UnsupportedOperationException("Accelerometer is not available.");
		
		/* If should be enabled and not already is */
		if (doEnable && !this.isEnabled) {
	        //mSensorManager.;
	        isEnabled = true;
		}
		
		/* If should be disabled and not already is */
		else if (!doEnable && this.isEnabled) {
	        //Sensor.disableSensor(Sensors.SENSOR_ACCELEROMETER);
	        isEnabled = false;
		}
    }
}
