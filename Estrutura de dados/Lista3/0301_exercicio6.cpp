/**
6) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e escreva o mês correspondente; 
 	caso o usuário digite o número fora do intervalo deverá aparecer inválido, mas utilizando uma função do tipo void.
*/

#include <cstdlib>
#include <iostream>

using namespace std;
void convertNumToMes(int mes);

int main()
{
	int mes;  
	
	cout << "Digite o mes: ";
	cin>> mes;
	
	convertNumToMes(mes);

	system("PAUSE");
	return 0;
}

void convertNumToMes(int mes)
{        
    string strMes = "";
    
    switch (mes)
    {
    	case 1: 
    	{
    		strMes = "Janeiro";
    		break;
		}
		
		case 2: 
    	{
    		strMes = "Fevereiro";
    		break;
		}
    	
    	case 3: 
    	{
    		strMes = "Marco";
    		break;
		}
		
		default:
		{
			cout << "Mes invalido" << endl;		
		}   	
    	
	}
    
    if(strMes != "")
    {
    	cout << "O mes equivalente eh = " << strMes << endl;	
	}  
}


