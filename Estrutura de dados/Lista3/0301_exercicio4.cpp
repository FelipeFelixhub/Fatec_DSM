/**
4�) Criar um programa que receba um grau e o converta para radianos atrav�s de uma fun��o.
F�rmula: radiano = grau * pi / 180
*/

#include <cstdlib>
#include <iostream>

using namespace std;
float convertToRad(int grau);

int main()
{
	int grau; 
	
	cout << "Digite o grau: ";
	cin>> grau;
	
	cout << "Valor em radianos = " << convertToRad(grau) << endl;

	system("PAUSE");
	return 0;
}

float convertToRad(int grau)
{        
    return ((float)(grau * 3.1415)/180);        
}


