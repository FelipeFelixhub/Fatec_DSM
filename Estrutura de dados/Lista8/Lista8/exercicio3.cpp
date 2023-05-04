/*
3.a) Considere o seguinte codigo:

int exe3(int x, int y)
{
if (x > y)
return(-1);
else
{
if (x=y)
 return(1);
else
 return(x*exe3(x+1, y));

 }
}

O que eh retornado nas seguintes chamadas:

a) cout << exe3(10,4)
b) cout << exe3(4,3)
c) cout  << exe3(4,7)
d) cout << exe3(0,0)
*/

#include <iostream>
using namespace std;

int exe3(int x, int y)
{
    if (x > y)
        return (-1);
    else
    {
        if (x = y)
            return (1);
        else
            return (x * exe3(x + 1, y));
            
    }
}

    int main () {

    cout << exe3(10,4) << endl;
    cout << exe3(4,3) << endl;
    cout << exe3(4,7) << endl;
    cout << exe3(0,0) << endl;
    }


A) -3

B) = exe2 (2,6) 

+ 3= (-3) +3= 0

C) = exe2 (12, 6) + 3;

= exe2 (6,9) +6) +3

=((-3)+6) +3= 6