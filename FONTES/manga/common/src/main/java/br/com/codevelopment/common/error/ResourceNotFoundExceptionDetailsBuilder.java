package br.com.codevelopment.common.error;

public class ResourceNotFoundExceptionDetailsBuilder {
	
	private String title;
	private int status;
	private String detail;
	private long timeStamp;
	private String message;
	
	public String getTitle() {
		return title;
	}
	public int getStatus() {
		return status;
	}
	public String getDetail() {
		return detail;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	
	public static class Builder {
		
		private String title;
		private int status;
		private String detail;
		private long timeStamp;
		private String message;
		
		public Builder() {
			/*
			 * Construtor vazio do builder
			 */
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder status(int status) {
			this.status = status;
			return this;
		}
		
		public Builder detail(String detail) {
			this.detail = detail;
			return this;
		}
		
		public Builder timestamp(long timestamp) {
			this.timeStamp = timestamp;
			return this;
		}
		
		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public ResourceNotFoundExceptionDetailsBuilder build() {
			return new ResourceNotFoundExceptionDetailsBuilder(this);
		}
		
	}
	
	private ResourceNotFoundExceptionDetailsBuilder(Builder builder) {
		title = builder.title;
		status = builder.status;
		detail = builder.detail;
		timeStamp = builder.timeStamp;
		message = builder.message;
	}

}
