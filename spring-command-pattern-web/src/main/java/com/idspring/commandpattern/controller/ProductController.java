package com.idspring.commandpattern.controller;

import com.idspring.commandpattern.entity.Product;
import com.idspring.commandpattern.model.controller.Response;
import com.idspring.commandpattern.service.ServiceExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author chandraarigunawan
 * @since 02/10/20
 */
@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ServiceExecutor serviceExecutor;

  @RequestMapping(value = "/{productId}", method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Response<Product>> detail(@PathVariable("productId") String productId) {
    throw new NotImplementedException();
  }
}
