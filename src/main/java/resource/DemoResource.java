package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import up1.demo.value.Message;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

	@GET
	public Message sendMessage(@QueryParam("name") String name) {
		return new Message( "Hello " + name );
	}
	
}
