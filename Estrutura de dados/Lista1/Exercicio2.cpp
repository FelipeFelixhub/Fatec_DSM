/*
2) 	Faça  um  programa  que  leia  uma  temperatura  em  graus  Centígrados  e  
	apresente-a convertida em graus Fahrenheit.  
	A fórmula de conversão é:  F = (9 * C + 160) / 5, onde F é a temperatura 
	em Fahrenheit e C em graus Centígrados. 
*/

#include <iostream>
using namespace std;

int main()
{
	int num = 0, maior = 0;
	
	for(int i=0; i < 5; i++)
	{
		cout << "Digite um numero \n";
		cin>>num;
		
		if(num > maior)
		{
			maior = num;
		}			
	}
	
	cout << "O maior numero foi: " << maior;	
	return 0;	
}
