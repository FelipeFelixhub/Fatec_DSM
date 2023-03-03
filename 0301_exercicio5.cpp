/**
5ª) Criar um programa que mostre qual o maior valor entre dois 
números, utilizando uma função do tipo void (que não retorna valores).
*/

#include <cstdlib>
#include <iostream>

using namespace std;
void defineMaiorMenor(int valor1, int valor2);

int main()
{
	int valor1, valor2; 
	
	cout << "Digite um numero: ";
	cin>> valor1;
	cout << "Digite outro numero: ";
	cin>> valor2;
	
	defineMaiorMenor(valor1, valor2);

	system("PAUSE");
	return 0;
}

void defineMaiorMenor(int valor1, int valor2)
{        
    int maior = (valor1 > valor2) ? valor1 : valor2;
	int menor = (valor1 < valor2) ? valor1 : valor2;

	cout << "Maior = " << maior << endl;
	cout << "Menor = " << menor << endl;  
}


