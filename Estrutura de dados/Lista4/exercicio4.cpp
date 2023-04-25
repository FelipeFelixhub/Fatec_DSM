/*
4.ª)  Codifique  um  programa  em  C++  quetransforme  um  número  decimal  em  um  número hexadecimal.  
Dica:  Se  o  resto  for  10, 11, 12, 13, 14  ou  15,  imprima,  respectivamente, A,B,C,D,E ou F.
*/

#include <iostream>
#include <pilha.h>
#include <string>

using namespace std;

char HexVector[6] = {'A', 'B', 'C', 'D', 'E', 'F'};
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
		if(num > 16)
		{				
			Push(&pilha, (num % 16));
			num /= 16;			
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
		int numRead = Pop(&pilha);
		string valueToPrint = "inicio"; 
				
		if(numRead >= 10)
		{
			numRead -= 10;				
			cout << HexVector[numRead];	
		} 
		else
		{			
			cout << numRead;	
		}				
	}
}
