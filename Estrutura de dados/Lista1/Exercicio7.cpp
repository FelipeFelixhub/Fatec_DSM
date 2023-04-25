/*
7.ª) Faça um programa que apresente a série de Fibonacci até o décimo quinto termo. 
 A série é formada pela seqüência: 1,1,2,3,5,8,13,21,34,....,etc.
*/


#include <iostream>

using namespace std;

int main () {
   int i, n, t1 = 0, t2 = 1, proxTermo;

   cout << "A série de Fibonacci até o décimo quinto termo é: ";

   for (i = 1; i <= 15; i++) {
   	
   	
      cout << t1 << ", ";
      proxTermo = t1 + t2;
      t1 = t2;
      t2 = proxTermo;
   }
   return 0;
}


