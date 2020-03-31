package main.structural.facade;

import org.junit.Test;

public class Main {
	@Test
	public void test() {
		MicrowaveFacade microwave = new MicrowaveFacade(Mode.FAST);
        microwave.on();
	}
}
