package com.prashanth.os.spring.multimodule.application;

import com.prashanth.os.spring.multimodule.library.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.prashanth.os.spring.multimodule")
@RestController
public class MultimoduleApplication {

  private final LibraryService libraryService;

  public MultimoduleApplication(LibraryService libraryService) {
    this.libraryService = libraryService;
  }

  @GetMapping("/")
  public String home() {
    return libraryService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(MultimoduleApplication.class, args);
  }
}
