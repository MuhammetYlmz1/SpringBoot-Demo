package springdemo.northwind.core.utilities.results;

public class ErrorDataResuls<T> extends DataResult<T> {

	public ErrorDataResuls(T data,String message) {
		super(data, false, message);
	}
	
	public ErrorDataResuls(T data) {
		super(data,false);
	}
	
	public ErrorDataResuls(String message) {
		super(null,true,message);
	}
	public ErrorDataResuls() {
		super(null,true);
	}

}
