#include <iostream>
#include "ShutDownWindows.h"
using namespace std;

JNIEXPORT void JNICALL Java_ShutDownWindows_shutdown (JNIEnv *env, jobject obj)
{
	system("c:\\windows\\system32\\shutdown /s");
}


