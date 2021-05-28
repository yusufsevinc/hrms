package javaCamp.hrms.core.utilies.results;

public class SuccesDataResult<T> extends DataResult<T>{

	public SuccesDataResult(T data,  String messsage) {
		super(data, true, messsage);
		
	}
	
	public SuccesDataResult( String messsage) {
		super(null, true, messsage);
		
	}
	
	public SuccesDataResult(T data) {
		super(data, true);
		
	}
	
	public SuccesDataResult() {
		super(null,true);
		
	}
	
	

}
