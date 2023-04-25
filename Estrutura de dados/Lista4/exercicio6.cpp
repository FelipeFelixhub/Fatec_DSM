/*
	6.�) Uma string � considerada pal�ndroma se ela pode ser lida da esquerda para a direita ou da direita para  a esquerda com o mesmo significado. 
	 Neste caso, n�o podemos considerar acentua��es, letras mai�sculas ou min�sculas, os espa�os e os caracteres especiais.  
	 A seguir est�o alguns exemplos:
	 Radar
	 Subi no Onibus
	 Go dog
	 Fa�a um programa em C++ para verificar se uma express�o � ou n�o pal�ndroma.
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
