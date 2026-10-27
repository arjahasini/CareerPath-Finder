package com.careerpath;
import jakarta.persistence.*;
@Entity
public class Career {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
  private String title;
  private String category;
  private String skills;
  private String description;
  protected Career() {}
  public Career(String title, String category, String skills, String description) {
    this.title=title; this.category=category; this.skills=skills; this.description=description;
  }
  public Long getId(){return id;} public String getTitle(){return title;}
  public String getCategory(){return category;} public String getSkills(){return skills;}
  public String getDescription(){return description;}
}