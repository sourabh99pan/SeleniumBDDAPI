package restassuredTests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class Test1_Get_Request {

			
		@Test
		public void getUserDetails()
		{
			given()
			.when()
				.get("https://gorest.co.in/public/v2/users/2357")
			.then()
				.statusCode(200)
				.assertThat().body("gender", equalTo("male"))
				.header("Content-Type", "application/json; charset=utf-8");
		}

	

}
