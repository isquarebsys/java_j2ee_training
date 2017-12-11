package jersey;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {
	@Expose
	@SerializedName("firstName")
	private String firstName;
	@Expose
	@SerializedName("lastName")
	private String lastName;
	@Expose
	@SerializedName("date")
	private Date date;
	@Expose
	@SerializedName("text")
	private String text;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}