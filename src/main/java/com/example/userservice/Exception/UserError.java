package com.example.userservice.Exception;

import java.time.LocalDateTime;

public class UserError {

	    private String message;
	    private LocalDateTime timestamp;
	    private int status;

	    public UserError(String message, LocalDateTime timestamp, int status) {
	        this.message = message;
	        this.timestamp = timestamp;
	        this.status = status;
	        
	    }

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}
}
