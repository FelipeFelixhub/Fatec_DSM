/*
2.�)  Dado  um  n�mero  real  X  e  um  n�mero  natural  K,  calcular  
a  pot�ncia  X  elevado  a  K atrav�s de produtos sucessivos.
xk    =  x.x.x.x.  ......  x
*/

#include <iostream>
using namespace std;

int main() {
	int x, k = 0, resultado = 0;
	
	cout << "Informe a base: \n";
	cin >> x;
	cout <<"Informe o expoente: \n";
	cin >> k;
	
	if(k ==0) {
		resultado = 1;
	} else
	{
	
	
	
	for(int i = 0; i < k; i++) {
		
		if( resultado == 0 ) {
			resultado = x;	
		} 
		else {
			resultado *= x;
		}
	}	
		
}
	
	cout << "O resultado da potenciacao eh: " << resultado;
	
		
return 0;
}
