package com.example;
import org.springframework.boot.SpringApplication;
import
  org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

public class App {
public String home() {
  return " succesfully running";
}
  public static void main(String[] args) {
  SpringApplication.run(App.class, args);
}
}
