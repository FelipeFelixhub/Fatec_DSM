/*
6) Faça um programa que apresente o total da soma obtido dos cem primeiros números
inteiros. (1+2+3+4+......+100) 
*/

#include <iostream>
using namespace std;

int main()
{
	int soma = 0;
	
	for(int i=1; i <= 100; i++)
	{
		soma += i;
	}
	
	cout << "O valor da soma foi: " << soma;	
	return 0;	
}
