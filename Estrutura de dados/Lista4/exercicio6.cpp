/*
	6.ª) Uma string é considerada palíndroma se ela pode ser lida da esquerda para a direita ou da direita para  a esquerda com o mesmo significado. 
	 Neste caso, não podemos considerar acentuações, letras maiúsculas ou minúsculas, os espaços e os caracteres especiais.  
	 A seguir estão alguns exemplos:
	 Radar
	 Subi no Onibus
	 Go dog
	 Faça um programa em C++ para verificar se uma expressão é ou não palíndroma.
*/

#include <iostream>
#include <pilha.h>

using namespace std;

int main() {
	
	struct Pilha p1;
	IniPilha(&p1);
	
	char palavra[30];
	char x, y;
	int t,i;
	bool palindromo;
	
	cout <<"Digite uma palavra: ";
	cin >> palavra;
	t=strlen(palavra);
	
	for(i=0; i<t; i++) 
	{
		Push(&p1,palavra[i]);
	}
	while (!pilhavazia(&p1))
	{
		for(i=0; i<t; i++) 
		{
		x=Pop(&p1);
		if(palavra[i] == x){
			palindromo = true;
		}else{
			palindromo = false;
		}		
		}	
		
		if(palindromo){
			cout << "Eh um palindromo";
		}else{
			cout << "Nao eh um palindromo";
		}
		
		
		
	}
	
	
	
	return 0;
}
