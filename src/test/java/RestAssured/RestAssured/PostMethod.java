package RestAssured.RestAssured;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class PostMethod {
	
	@Test
	public void post() throws ClientProtocolException, IOException{
		RestAssured rest = new RestAssured();
		RequestSpecification httpRequest = RestAssured.given();
		//CloseableHttpClient httpclient = HttpClients.createDefault();
		//HttpPost post = new HttpPost("https://reqres.in/api/users");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("content-type", "application/json");
		//post.addHeader("content-type", "application/json");
		UsersPojo users = new UsersPojo();
		users.getJob();
		users.getName();
		ObjectMapper mapper = new ObjectMapper();
		String payload = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
		System.out.println("payload is" +payload);
		//post.setEntity(new StringEntity(payload));
		Response response = null;
		httpRequest.headers(map);
		httpRequest.body(payload);
		response = httpRequest.post("https://reqres.in/api/users");
		System.out.println("response is " + response.getStatusCode() );
		System.out.println("body is " + response.prettyPrint() );
	
		
	
			
			 
		
	}
	

}
