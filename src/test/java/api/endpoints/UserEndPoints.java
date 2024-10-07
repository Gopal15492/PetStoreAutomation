package api.endpoints;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public  class UserEndPoints {
	
	public static Response createUser(User payload) {
		
		Response respose = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.post_url);
		
		return respose;
	}
public static Response readUser(String  userName) {
		
		Response respose = given()
				.pathParam("username", userName)
		
		.when()
		.get(Routes.get_url);
		return respose;
	}
   public static Response updateUser(String  userName, User payload) {
	
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
	
	Response respose = given()
			.pathParam("username", userName)
	
	.when()
	.get(Routes.delete_url);
	
	return respose;
}
}																							
