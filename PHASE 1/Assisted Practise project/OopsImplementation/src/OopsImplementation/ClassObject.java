package OopsImplementation;

 class Lamp{
	  boolean isOn;
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);
	  }
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
	}
	class ClassObject {
	  public static void main(String[] args) {
		  //object created
	    Lamp led = new Lamp();
	    Lamp halogen = new Lamp();
	    led.turnOn();
	    halogen.turnOff();
	  }
	}