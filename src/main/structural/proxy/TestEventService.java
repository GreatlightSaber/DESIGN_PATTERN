package main.structural.proxy;

public class TestEventService implements EventService{

	@Override
	public void createEvnet() {
		System.out.println("Create Event");
	}

	@Override
	public void publishEvent() {
		System.out.println("Publish Event");
	}
	
}
