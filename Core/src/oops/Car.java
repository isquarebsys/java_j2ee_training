package oops;

public class Car {
	private String colour;
	private String name;
	private String brakeType;
	
	public Car(String name,String brakeType,String colour) {
		this.name=name;
		this.brakeType=brakeType;
		this.colour=colour;
	}
	public String getBrakeType() {
		return brakeType;
	}

	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour=colour;
	}
}
