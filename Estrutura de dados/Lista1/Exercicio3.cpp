/* 3.ª) Calcular  e apresentar o valor do volume de uma lata de óleo, 
utilizando a fórmula: VOLUME = 3.14159 * R2 * ALTURA. */

#include <iostream>
using namespace std;

int main () {
	
	int altura = 0, raio = 0;
	double volume = 0;
	
	cout << "Digite a altura \n";
	cin >> altura;
	
	cout << "Digite o raio \n";
	cin >> raio;
	
	volume = 3.14159 * raio*raio * altura;
	
	
	cout<< "O volume eh : " << volume ;
	
	
	
	return 0;	
	
}

