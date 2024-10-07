package api.endpoints;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public  class UserEndPoints2 {
	
	public static ResourceBundle getURL(){
			ResourceBundle routes =  ResourceBundle.getBundle("routes");
			return routes;
		}
	
	 public static Response createUser(User payload) {
		
		String post_url = getURL().getString("post_url");
		
		Response respose = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.post_url);
		
		return respose;
	}
public static Response readUser(String  userName) {
	
	String get_url = getURL().getString("get_url");

		
		Response respose = given()
				.pathParam("username", userName)
		
		.when()
		.get(Routes.get_url);
		return respose;
	}
   public static Response updateUser(String  userName, User payload) {
	   
		String update_url = getURL().getString("update_url");

	
	Response respose = given()
			.pathParam("username", userName)
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
	
	.when()
	.get(Routes.update_url);
	
	return respose;
}
  public static Response deleteUser(String  userName) {
	  
		String delete_url = getURL().getString("delete_url");

	
	Response respose = given()
			.pathParam("username", userName)
	
	.when()
	.get(Routes.delete_url);
	
	return respose;
}
}																							
