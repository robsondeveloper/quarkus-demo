package demo.orm;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/products")
public class ProductResource {

	@Inject
	ProductRepository repository;

	@GET
	public List<Product> all() {
		return repository.listAll();
	}

	@POST
	public void add(Product product) {
		repository.persist(product);
	}

}
