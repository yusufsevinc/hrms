package javaCamp.hrms.core.utilies.results;

public class Result {
	private boolean  success;
	private String messsage;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	

	public Result(boolean success, String messsage) {
		
		this(success);
		this.messsage = messsage;
	}



	public boolean isSuccess() {
		return success;
	}

	public String getMesssage() {
		return messsage;
	}
	
	

}
