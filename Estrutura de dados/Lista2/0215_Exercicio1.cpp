/*
1.�) Dados dois n�meros naturais A e B, calcular o MDC entre A e B atrav�s do processo e exemplo:   
	�Para A=80  e B=112:
	1.Dividir o n�mero maior pelo menor: 112 dividido por 80 -> quociente 1 e resto 32;
	2.N�o dando resto zero, dividir o divisor pelo resto da divis�o anterior:80 dividido por 32 -> quociente 2 e resto 16;
	3.Prosseguir com as divis�es at� obter resto zero.32 dividido por 16 ->quociente 2 e resto 0.Portanto, o MDC(80,112) = 16.
*/

#include <iostream>
using namespace std;

int main()
{
	int n1, n2, menor=0, maior=0, resto=0;
	
	cout << "digite um numero: \n";
	cin >> n1;
	cout << "digite outro numero: \n";
	cin >> n2;	
	
	maior = (n1 >= n2) ? n1 : n2;
	menor = (n2 >= n1) ? n1 : n2; 
	
	while((maior % menor) != 0)
	{	
		resto = maior % menor;
		
		maior = menor;
		menor = resto;		
	}

	cout << "O MDC(" << n1 << "," << n2 << ") = " << menor << " \n";
	return 0;	
}
