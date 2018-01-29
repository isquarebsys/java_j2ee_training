package beans;

import java.io.Serializable;

public class Greeting implements Serializable{
	private String greetingText;
	public String getGreetingText() {
		return greetingText;
	}
	public void setGreetingText(String greetingText) {
		this.greetingText = greetingText;
	}
	public String greet() {
		return "Welcome";
	}
}
