package com.segundo_proyecto.core.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segundo_proyecto.core.models.Post;

@Controller
@RequestMapping( "/home" )
public class BasicController {

  public List<Post> getPosts() {
    ArrayList<Post> posts = new ArrayList<>();
    posts.add(new Post(1,"Esta es la descripción de un post de prueba","http://localhost:8080/img/manzana.jpg","Primer Post",new Date()));
    posts.add(new Post(1,"Esta es la descripción de un post de prueba","http://localhost:8080/img/manzana.jpg","Segundo Post",new Date()));
    posts.add(new Post(1,"Esta es la descripción de un post de prueba","http://localhost:8080/img/manzana.jpg","Tercero Post",new Date()));
    posts.add(new Post(1,"Esta es la descripción de un post de prueba","http://localhost:8080/img/manzana.jpg","Cuarto Post",new Date()));
    return posts;
  }

  @GetMapping( path = { "/post", "/" } )
  public String saludar(Model model){
    model.addAttribute("posts", this.getPosts());
    return "index";
  }

  
  
}
