#include <iostream>
#include <stdlib.h>

using namespace std;

int exe1(int x)
{
    if (x < 5)
        return (3 * x);
    else
        return (2 * exe1(x - 5) + 7);
}

int main(int argc, char const *argv[])
{

   /* O que eh retornado nas seguintes chamadas: 
        a) cout << exe1(4) ?  
        b) cout << exe1(10)?   
        c) cout << exe1(12) ? 
   */

    cout << exe1(4) << endl;
    cout << exe1(10) << endl;
    cout << exe1(12) << endl;

    return 0;
}
