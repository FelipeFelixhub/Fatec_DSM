/*
    1.ª) Implementar um programa recursivo em C++ que imprima qual o "n" termo da serie
    de Fibonacci. (1,1,2,3,5,8.....)
    Por exemplo: Qual o 6º termo da serie? O programa devera informar 8.

    fibonacci(x) = {1 1 fibonacci(x-1) + fibonacci(x-2)
    x = 1
    x = 2
    x > 2
*/

#include <iostream>
#include <stdlib.h>

using namespace std;

int fibonacci(int n)
{

    if (n == 1)
    {
        return (1);
    }
    if (n == 2)
    {
        return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main(){

    int number = 0;

    cout << "******** FIBONACCI *****" << endl;
    cout << endl;
    cout << "Informe o termo a ser encontrado na sequencia de fibonacci" <<endl;
    cin >> number;

    cout << fibonacci(number) <<endl; 

    return 0;

}
