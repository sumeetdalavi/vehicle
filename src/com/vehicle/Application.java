package com.vehicle;

import com.vehicle.implementation.Jairaj;
import com.vehicle.implementation.RollsRoyce;

public class Application {

	public static void main(String[] args) {
		Jairaj jj = new Jairaj();
		RollsRoyce rr = new RollsRoyce(jj);
		System.out.println(rr);
	}

}
