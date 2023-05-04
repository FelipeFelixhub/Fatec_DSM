/*4 -)Elaborar um programa recursivo que dado um número natural K, calcular a potência X
elevado a K através de produtos sucessivos.
Obs.:
 xk  =  x * x k-1  Se k > 1
 xk   =  x   Se k=1
 xk   =  1   Se k=0
Independente do valor de k, para X=0 ou 1 o resultado eh imediato, isto eh, 0 e 1.*/

#include <stdlib.h>
#include <iostream>
#include <math.h>

using namespace std;

int calcPow(int x, int k)
{
    if (k == 1)
    {
        return x;
    }
    if (k == 0)
    {
        return 1;
    }
    // if (x == 0)
    // {
    //     return 0;
    // }
    // if (x == 1)
    // {
    //     return 1;
    // }
    return x * calcPow(x, k - 1);
}

int main()
{
    int n1, n2;
    cout << "================\n";
    cout << "POTENCIA POR K\n";
    cout << "================\n";

    cout << "Digite a base: ";
    cin >> n1;
    cout << "Digite o numero que sera exponenciado: ";
    cin >> n2;

    cout << calcPow(n1, n2) << endl;

    return 0;
}