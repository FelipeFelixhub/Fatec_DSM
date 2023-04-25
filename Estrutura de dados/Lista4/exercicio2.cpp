/*
2.ª)  Codifique  umprograma  em  C++  que  reverta  uma  série  de  números  até  que  999  seja digitado. 
Teste o seu programa com a série 1,3,5,7,9,2,4,6,8.  
*/

#include <iostream>
#include <pilha.h>

using namespace std;

Pilha pilha;

int main()
{	
	IniPilha(&pilha);
	
	int num = 0;			
	
	while(1)
	{
		cout << "digite um numero: \n";
		cin >> num;	
	
		if(num == 999)
		{
			break;
		}
		else
		{
			Push(&pilha, num);		
		}	
	}
	
	cout << "Numeros na pilha: \n";
	
	while(pilhavazia(&pilha) == false)
	{
		int read = Pop(&pilha);		
		cout << " " << read;	
	}	
}
