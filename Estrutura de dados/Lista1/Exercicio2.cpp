/*
2) 	Fa�a  um  programa  que  leia  uma  temperatura  em  graus  Cent�grados  e  
	apresente-a convertida em graus Fahrenheit.  
	A f�rmula de convers�o �:  F = (9 * C + 160) / 5, onde F � a temperatura 
	em Fahrenheit e C em graus Cent�grados. 
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
