package com.idspring.commandpattern.controller;

import com.idspring.commandpattern.service.ServiceExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandraarigunawan
 * @since 02/10/20
 */
@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ServiceExecutor serviceExecutor;

  
}
