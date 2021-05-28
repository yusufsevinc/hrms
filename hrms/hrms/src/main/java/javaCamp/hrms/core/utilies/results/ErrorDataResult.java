package javaCamp.hrms.core.utilies.results;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data,  String messsage) {
		super(data, false, messsage);
		
	}
	
	public ErrorDataResult( String messsage) {
		super(null, false, messsage);
		
	}
	
	public ErrorDataResult(T data) {
		super(data, false);
		
	}
	
	public ErrorDataResult() {
		super(null,false);
		
	}
	
	

}
