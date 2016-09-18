package hello;

public class EndPoint {

      private String url;
	  private int scheduledMin;
	  private String typeOfOperation;  //GET Or POST
	  
	  public String getUrl() {
	    return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getScheduledMin() {
		return scheduledMin;
	}

	public void setScheduledMin(int scheduledMin) {
		this.scheduledMin = scheduledMin;
	}

	public String getTypeOfOperation() {
		return typeOfOperation;
	}
	
	public void setTypeOfOperation(String typeOfOperation) {
		this.typeOfOperation = typeOfOperation;
	}

}