//tag::include[]
package com.phdua.manager.test.chapter02.containerelement.map;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

//tag::include[]
public class Car {

	public enum FuelConsumption {
		CITY,
		HIGHWAY
	}

	private Map<@NotNull FuelConsumption, @MaxAllowedFuelConsumption Integer> fuelConsumption = new HashMap<>();

	public void setFuelConsumption(FuelConsumption consumption, int value) {
		fuelConsumption.put( consumption, value );
	}

	//...

}
//end::include[]
