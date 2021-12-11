package com.lan.example;

import java.util.function.Function;

/**
 * @author yunhorn lyp
 * @date 2021/5/13下午11:52
 */
public class DemoApp {

  public static Function<Integer, Integer> add() {
    Function<Integer, Integer> addMethod = i -> i + 1;
    return addMethod;
  }

  public static void main(String[] args) {
    Function<Integer, Integer> addMethod = add();

    System.out.println(addMethod.apply(1));
  }
}
