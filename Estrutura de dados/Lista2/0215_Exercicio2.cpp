/*
2.ª)  Dado  um  número  real  X  e  um  número  natural  K,  calcular  
a  potência  X  elevado  a  K através de produtos sucessivos.
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
