/**
3) Criar um programa que receba 2 valores e calcule o produto através de uma função que retorna valores.
*/

#include <cstdlib>
#include <iostream>

using namespace std;
int produto(int valor1, int valor2);

int main()
{
	int valor1, valor2;	
	
	cout << "Digite valor 1:";
	cin>> valor1;
	cout << "Digite valor 2:";
	cin>> valor2;	
	
	cout << "Produto = " << produto(valor1, valor2) << endl;

	system("PAUSE");
	return 0;
}

int produto(int valor1, int valor2)
{        
    return (valor1 * valor2);        
}


