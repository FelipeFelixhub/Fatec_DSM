/* 2. - ) Defina um programa recursivo para, dado um numero n, imprimi-lo em base binaria. */

#include <stdlib.h>
#include <iostream>

using namespace std;

void toBinario(int numero) {
    if (numero /2 != 0) {
        toBinario(numero / 2);
    }
    cout << numero % 2;

}

int main() {
    int number = 0;

    cout << "******* Convertendo para Binario *********" << endl;
    cout << endl;
    cout << "Digite um numero em decimal:" << endl;
    cin >> number;
    cout << endl;
    cout << "O numero convertido em binario eh:" << endl;
    toBinario(number);
    cout << endl;

    return 0;
}

