package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@Path("/hello")
public class ExampleResource {

	private static final Logger LOG = Logger.getLogger(ExampleResource.class);

	@ConfigProperty(name = "USER") // Environment Variables
	private String user;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		LOG.info("Hello");
		LOG.info("usuario: " + user);
		return "Hello RESTEasy";
	}
}