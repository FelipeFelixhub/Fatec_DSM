/**
8ª) Criar um programa que verifique se um número é primo ou não, através de uma função. Número primo é
divisível somente por 1 e por ele mesmo.
*/

#include <cstdlib>
#include <iostream>

using namespace std;
bool ehPrimo(int numero);

int main()
{
	int numero;  
	string result = "";
	
	
	cout << "Digite o numero: ";
	cin>> numero;
	
	result = (ehPrimo(numero) == true ) ? "eh primo" : "nao eh primo";	
	cout << "O numero " << numero << " : " << result << endl;

	system("PAUSE");
	return 0;
}

bool ehPrimo(int numero)
{
	for(int i = 2; i <= numero; i++)
	{
		if((numero % i) == 0)
		{
			if(numero == i)
			{
				return true;				
			}
			else
			{
				return false;
			}		
		}		
	}
}


