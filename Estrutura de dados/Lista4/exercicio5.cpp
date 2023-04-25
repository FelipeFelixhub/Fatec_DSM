/*
	5.ª) Codifique um programa em C++ que leia uma palavra e a imprima de forma invertida.Por exemplo:  exercício, deverá ser impresso: oicícrexe.
*/

#include <iostream>
#include <pilha.h>


using namespace std;

int main() {
	struct Pilha p1;
	IniPilha(&p1);
	
	char palavra[15];
	char x;
	int t,i;
	cout <<"Digite uma palavra: ";
	cin >> palavra;
	t=strlen(palavra);
	for(i=0; i<t; i++) 
	{
		Push(&p1,palavra[i]);
	}
	while (!pilhavazia(&p1))
	{
		x=Pop(&p1);
		cout << x;	
	}
	
	
	return 0;
}
