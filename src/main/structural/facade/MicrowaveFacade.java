package main.structural.facade;

public class MicrowaveFacade {
	
	Cooler cooler;
	Magnetron magnetron;
	TimeChecker timeChecker;
	Turntable turntable;
	Switch[] switches;
	Mode mode;
	String food;
	boolean isActive = false;
	
	public MicrowaveFacade(Cooler cooler, Magnetron magnetron, TimeChecker timeChecker, Turntable turntable, Mode mode) {
		super();
		this.cooler = cooler;
		this.magnetron = magnetron;
		this.timeChecker = timeChecker;
		this.turntable = turntable;
		this.mode = mode;
		switches = new Switch[]{cooler,magnetron,timeChecker,turntable};
	}
	
    public MicrowaveFacade(Mode mode) {
        super();
        cooler = new Cooler();
        magnetron = new Magnetron();
        timeChecker = new TimeChecker(mode.getValue(), this);
        turntable = new Turntable();
        this.mode = mode;
        switches = new Switch[]{cooler, magnetron, turntable, timeChecker};
        
    }
	
    public void on() {
        
        
        for(int i=0; i<switches.length; ++i) {
            switches[i].on();
        }
        isActive = true;
        
    }
    
    public void off() {
        
        for(int i=0; i<switches.length; ++i) {
            switches[i].off();
        }
        
        isActive = false;
        
    }
    
    public void getMode() {
        System.out.println("현재 모드는... " + mode.getName());
 
    }
 
    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
