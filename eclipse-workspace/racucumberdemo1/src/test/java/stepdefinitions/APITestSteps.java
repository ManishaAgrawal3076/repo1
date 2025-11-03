package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;


public class APITestSteps {
	
	Response response;	
	
	@Given("the API endpoint1 is {string}")
	public void setUp(String url) {
	     baseURI=url;
	    
	}

	@When("a GET request is sent to the endpoint")
	public void getData() {
	  response= get();
	  System.out.println(response.asPrettyString());
	   
	}

	@Then("the response1 status code should be {int}")
	public void validateStatusCode(Integer statuscode) {
			response.then().statusCode(statuscode);
		    
	}


}
