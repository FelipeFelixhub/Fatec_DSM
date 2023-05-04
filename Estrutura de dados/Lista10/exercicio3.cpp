/*
3) Implemente uma funcao recursiva soma(n) que calcula o somatorio dos n primeiros 
numeros inteiros.*/


#include <stdio.h>
#include <iostream>

using namespace std;

int soma (int n){
	if(n == 0){
		return 0;
	}else{
		return n + soma(n-1);
	}
}


int main() {
	int n;
	
	cout << "Informe  quantos numeros deseja somar: " << endl;
	cin >> n;
	
	cout << soma(n);
}