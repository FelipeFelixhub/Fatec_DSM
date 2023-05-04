/* 
2 - Pode-se calcular o quociente da divisao, DIV, de x por y, dois numeros inteiros, usando-se a seguinte definiçao:
1 + DIV(x-y,y) se x>y
= 0 se x<y
1 se x=y

Entao, pede-se que seja criada uma funcao recursiva para descrever tal definicao. A funcao deve retornar -1 caso não seja possivel realizar o calculo. 
Alem disso, crie um algoritmo que leia os dois valores inteiros e utilize a funcao criada para calcular o quociente de x por y, e imprima o valor computado.

*/

#include <iostream>
#include <stdlib.h>

using namespace std;

int DIV(int x, int y){;
    if (y == 0) {
        return -1;

    }else if (x > y){
        return 1+DIV(x - y, y);

    }else if (x < y){
        return 0;

    }else if (x == y){
        return 1;
    }

}

int main() {
    int x, y;

    cout << "Informe o valor de x: " << endl;
    cin >> x;

    cout << "Informe o valor de y: " << endl;
    cin >> y;

    cout << DIV(x,y);
}
    
    


    
