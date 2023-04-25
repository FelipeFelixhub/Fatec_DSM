/*
3.ª)  Codifique  um  programa  em  C++  que  transforme  um  número  decimal  em  um  número octal. 
*/

#include <iostream>
#include <pilha.h>

using namespace std;

Pilha pilha;

int main()
{	
	IniPilha(&pilha);
	
	int num = 0;			
	
	
	//Entrada
	cout << "digite um numero a ser convertido: \n";
	cin >> num;	
	
	//Converte
	while(1)
	{
		if(num > 8)
		{				
			Push(&pilha, (num % 8));
			num /= 8;			
		}
		else
		{
			Push(&pilha, num);
			break;
		}			
	}
		
	//Saida convertida
	cout << "Valor convertido: \n";
	
	while(pilhavazia(&pilha) == false)
	{
		cout << Pop(&pilha);	
	}
}
