//tag::include[]
package com.phdua.manager.test.chapter04;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class Car {

	@NotNull(message = "The manufacturer name must not be null")
	private String manufacturer;

	//constructor, getters and setters ...
}
//end::include[]
