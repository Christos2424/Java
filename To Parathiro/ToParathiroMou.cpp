#include <windows.h>
#include <iostream>
using namespace std;
void Stealth()
{
 HWND Stealth;
 AllocConsole();
 Stealth = FindWindowA("ConsoleWindowClass", NULL);
 ShowWindow(Stealth,0);
}

int main()
{
  Stealth();
  system("java -jar ToParathiroMou.jar");
  return 0;
}
