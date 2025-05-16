#include <iostream>
#include "ShutDownLinux.h"
using namespace std;

JNIEXPORT void JNICALL Java_ShutDownLinux_shutdown (JNIEnv *env, jobject obj)
{
	system("shutdown -P now");
}

/**
 
g++ -fPIC -shared -I /usr/lib/jvm/openlogic-openjdk-8-hotspot-amd64/include 
-I /usr/lib/jvm/openlogic-openjdk-8-hotspot-amd64/include/linux 
-I /home/webster/jterm/
-o /home/webster/jterm/libShutDownLinux.so /home/webster/jterm/ShutDownLinux.cpp
 * 
 **/

