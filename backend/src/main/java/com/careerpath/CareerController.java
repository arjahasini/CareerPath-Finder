package com.careerpath;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/careers")
@CrossOrigin(origins = "http://localhost:5173")
public class CareerController {
  private final CareerRepository repository;
  public CareerController(CareerRepository repository) { this.repository = repository; }
  @GetMapping public List<Career> all() { return repository.findAll(); }
  @PostMapping public Career create(@RequestBody Career career) { return repository.save(career); }
}