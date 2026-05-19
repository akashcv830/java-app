package com.example;
import org.springframework.boot.SpringApplication;
import
  org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.nind.annotation.*;

public class App {
public static void main(String[] args) {
  SpringApplication.run(App.class, args);
}
public String home() {
  return " succesfully running";
}
}
