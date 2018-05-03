package com.mari.cmake;

public class HelloLibrary {

  //使用 native 关键字指示以原生代码形式实现的方法
  public native String sayHello();

  static {
    //加载动态库，这里对应 CMakeLists.txt 里的 add_library NDKSample
    System.loadLibrary("NDKSample");
  }
}
