package com.segundo_proyecto.core.models;

import java.util.Date;

public class Post {
  
  private int id;
  private String descripcion;
  private String uriImg;
  private String titulo;
  private Date fecha;

  public Post() {
  }

  public Post(int id, String descripcion, String uriImg, String titulo, Date fecha) {
    this.id = id;
    this.descripcion = descripcion;
    this.uriImg = uriImg;
    this.titulo = titulo;
    this.fecha = fecha;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public String getUriImg() {
    return uriImg;
  }
  public void setUriImg(String uriImg) {
    this.uriImg = uriImg;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public Date getFecha() {
    return fecha;
  }
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
}
