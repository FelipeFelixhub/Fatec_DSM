/**
2) Criar um programa que receba 4 notas e calcule a média aritmética, através de uma função.
 */

#include <cstdlib>
#include <iostream>

using namespace std;
float calcMedia(int nota1, int nota2, int nota3, int nota4);

int main()
{
	int nota1, nota2, nota3, nota4;	
	
	cout << "Digite nota 1:";
	cin>> nota1;
	cout << "Digite nota 2:";
	cin>> nota2;	
	cout << "Digite nota 3:";
	cin>> nota3;
	cout << "Digite nota 4:";
	cin>> nota4;	
	
	cout << "Media = " << calcMedia(nota1, nota2, nota3, nota4) << endl;

	system("PAUSE");
	return 0;
}

float calcMedia(int nota1, int nota2, int nota3, int nota4)
{        
    return ((float)(nota1 + nota2 + nota3 + nota4) / 4);        
}


