package com.careerpath;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SeedData {
  @Bean CommandLineRunner seed(CareerRepository repo) {
    return args -> {
      if (repo.count() == 0) {
        repo.save(new Career("Frontend Developer","Software","JavaScript, React, HTML/CSS","Build responsive user interfaces."));
        repo.save(new Career("Backend Developer","Software","Java, SQL, APIs","Build services, business logic, and APIs."));
        repo.save(new Career("Data Analyst","Data & AI","SQL, Python, Statistics","Analyze data and communicate insights."));
        repo.save(new Career("Cloud Engineer","Cloud","AWS, Networking, Linux","Build and operate cloud infrastructure."));
      }
    };
  }
}