package com.mvc.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controlador rest: uma clase que receberá requisições
@RestController
// mapear os endpoints
@RequestMapping("/clientes")
public class ClienteController {

  // metódo que vai retornar string
  // mapeamento com getmapping
  @GetMapping
  public String hello() {
    return "Olá, mundo";
  }

}
