package RestAssured.RestAssured;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstRestAssuredTest {

	public static void main(String[] args) {
		RestAssured rest = new RestAssured();
		
		rest.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/Hyderabad");
		 System.out.println("Response Body is =>  " + response.asString());
		 System.out.println("Response Code is =>  " + response.getStatusCode());
		 
		 
		
		

	}

}
