package up1.demo.value;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
	private long id;
	private String message;

	public Message() {
	}

	@JsonProperty
	public long getId() {
		return this.id;
	}

	@JsonProperty
	public String getMessage() {
		return this.message;
	}
}
