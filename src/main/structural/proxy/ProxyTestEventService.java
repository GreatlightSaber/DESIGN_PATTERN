package main.structural.proxy;

public class ProxyTestEventService implements EventService{
	
	@Autowired
	TestEventService testEvnetService;

	@Override
	public void createEvnet() {
		long begin = System.currentTimeMillis();
		testEvnetService.createEvnet();
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishEvent() {
		long begin = System.currentTimeMillis();
		testEvnetService.publishEvent();
		System.out.println(System.currentTimeMillis() - begin);
	}
	
}
