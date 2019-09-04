package com.prashanth.os.spring.multimodule.library;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Test")
public class LibraryTest {

  @Autowired
  private LibraryService libraryService;

  @Test
  public void contextLoads() {
    assertThat(libraryService.message()).isNotNull();
  }

  @SpringBootApplication
  static class TestConfiguration {
  }
}
