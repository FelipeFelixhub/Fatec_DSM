/*
	1.ª) Armazenar “n” números inteiros em uma pilha, até que “999” seja digitado.
	Retornar o número de elementos da pilha que possuem valor ímpar e o número de elementos da pilha que possuem valor par.

*/

#include <iostream>
#include <stack>
#include <pilha.h>


using namespace std;

int main() {
   	stack <int> elementos;
    int num, impares = 0, pares = 0;

  
    do {
        cout << "Digite um numero inteiro (999 para encerrar!): ";
        cin >> num;
        if (num != 999) {
            elementos.push(num);
        }
    } while (num != 999);

    
    while (!elementos.empty()) {
        if (elementos.top() % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        elementos.pop();
    }

  
    cout << "Quantidade de numeros impares: " << impares << endl;
    cout << "Quantidade de numeros pares: " << pares << endl;

    return 0;
}
