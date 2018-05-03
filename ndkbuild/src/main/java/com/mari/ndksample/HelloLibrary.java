package com.mari.ndksample;

public class HelloLibrary {

  //使用 native 关键字指示以原生代码形式实现的方法
  public native String sayHello();

  static {
    //这里对应 Android.mk 里的 LOCAL_MODULE := NDKSample
    System.loadLibrary("NDKSample");
  }
}
