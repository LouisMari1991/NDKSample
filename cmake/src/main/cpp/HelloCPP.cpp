#include <jni.h>
#include <string>

extern "C"

JNIEXPORT jstring JNICALL
Java_com_mari_cmake_HelloLibrary_sayHello(JNIEnv *env, jobject) {
    //从 C++ 传字符串到 Java
    std::string hello = "Hello from C++ by cmake";
    return env->NewStringUTF(hello.c_str());
}
