/*
7.�) Fa�a um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. 
 A s�rie � formada pela seq��ncia: 1,1,2,3,5,8,13,21,34,....,etc.
*/


#include <iostream>

using namespace std;

int main () {
   int i, n, t1 = 0, t2 = 1, proxTermo;

   cout << "A s�rie de Fibonacci at� o d�cimo quinto termo �: ";

   for (i = 1; i <= 15; i++) {
   	
   	
      cout << t1 << ", ";
      proxTermo = t1 + t2;
      t1 = t2;
      t2 = proxTermo;
   }
   return 0;
}


