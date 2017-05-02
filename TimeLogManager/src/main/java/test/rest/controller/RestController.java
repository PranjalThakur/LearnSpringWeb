package test.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Component
@Path("/test")
public class RestController {

	@GET
	@Path("/helloWorld")
	public Response savePayment() {

		String result = "Hello World!";

		return Response.status(200).entity(result).build();

	}

}
