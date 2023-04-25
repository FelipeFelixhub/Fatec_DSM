/**
7ª) Criar um programa que retorne o fatorial de um número, usando uma função que receba um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120
*/

#include <cstdlib>
#include <iostream>

using namespace std;
long fatorial(int numero);

int main()
{
	int numero;  
	
	cout << "Digite o numero: ";
	cin>> numero;
	
	cout << "O fatorial eh : " << fatorial(numero) << endl;

	system("PAUSE");
	return 0;
}

long fatorial(int numero)
{
	long resultado = 0;	
	
	if(numero == 0)
	{
		return 1;
	}
	
	while(numero > 1)
	{
		if(resultado == 0) 
		{
			resultado = numero;			
		}
		else
		{
			resultado *= numero;
		}
		
		numero--;	
	}
		
	
	return resultado;
}


