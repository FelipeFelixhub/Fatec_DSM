/*
8)  Faça um programa que leia 15 valores e informe o valor da diferença entre a média e
	o maior valor. 
*/

#include <iostream>
using namespace std;

#define qtdMedia 5

int main()
{
	int vector[qtdMedia], maior=0, media=0, soma=0;
	
	//Faz a leitura e aloca no vetor
	for(int i=0; i < qtdMedia; i++)
	{
		cout << "digite um numero: \n";
		cin >> vector[i];
		
		if(vector[i] > maior)
		{
			maior = vector[i];			
		}
	}
	
	//Calcula a média
	for(int i=0; i < qtdMedia; i++)
	{
		soma += vector[i];
	}	
	
	media = soma / qtdMedia;
		
	//Informa o resultado	
	cout << "O maior valor foi: " << maior << "\n";	
	cout << "O valor da media foi: " << media << "\n";
	cout << "O valor do desvio foi: " << (media - maior) << "\n";
		
	return 0;	
}
