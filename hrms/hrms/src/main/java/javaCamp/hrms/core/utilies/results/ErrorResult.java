package javaCamp.hrms.core.utilies.results;

public class ErrorResult extends Result{

	public ErrorResult() {
		super(false);
		
	}
	
	public ErrorResult(String messsage) {
		super(false, messsage);
		
	}

}
