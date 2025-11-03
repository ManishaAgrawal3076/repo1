Feature:  API Testint Using RestAssured

	Scenarios:
		
		Scenario:	 Verify GET request returns 200 status
   	 Given the API endpoint1 is "https://jsonplaceholder.typicode.com/posts/1"
   	 When a GET request is sent to the endpoint
   	 Then the response1 status code should be 200
    
    Scenario:   Create User
         Given the API endpoint2 is "https://jsonplaceholder.typicode.com/posts"
         And   the requsetbody is  "reqbody"
         When  a POST request is sent to the endpoint
         Then the response2 status code should be 201
         And  the response body contains field "id"
    


	   

