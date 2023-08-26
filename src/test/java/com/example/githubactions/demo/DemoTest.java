package com.example.githubactions.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DemoTest {

  boolean isTrue = true;

  @Test
  void succeed() {
    assertThat(isTrue).isTrue();
  }

  @Test
  void fail() {
    assertThat(isTrue).isFalse();
  }
}
