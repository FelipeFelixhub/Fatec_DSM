/**
6) Criar um programa que receba um n�mero que corresponda a um m�s do 1� trimestre e escreva o m�s correspondente; 
 	caso o usu�rio digite o n�mero fora do intervalo dever� aparecer inv�lido, mas utilizando uma fun��o do tipo void.
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


