package springdemo.northwind.core.utilities.results;

import lombok.Data;

@Data
public class Result {//super type
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success=success;
		
	}

	public Result(boolean success,String message) {
		this.success=success;
		this.message=message;
		
	}
	

}
