package RestAssured.RestAssured;

public class UsersPojo {
	
	private String name = "morpheus";
	private String job = "leader";
	
	/*public UsersPojo(String name, String job){
		this.name = name;
		this.job = job;
	}*/
	
    

	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getJob() {
		return job;
	}
	public final void setJob(String job) {
		this.job = job;
	}
	
}
