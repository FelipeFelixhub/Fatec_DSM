/*
	2.ª) Criar um programa em C++ que apresente as operações básicas da estrutura de
dados Pilha
*/

#include <iostream>
#include <pilha.h>

using namespace std;

int main() 
{
	Pilha pilha;
	IniPilha(&pilha);
	
	bool endProgram = false;	
	
	while(1)
	{				
		cout << "Menu: \r\n";
		cout << "1 - Inserir um numero inteiro na Pilha \r\n";
		cout << "2 - Remover um elemento da Pilha \r\n";
		cout << "3 - Mostrar o elemento do topo da Pilha \r\n";
		cout << "4 - Mostrar os elementos da Pilha \r\n";
		cout << "5 - Sair \r\n";
		
		cout << "\r\n";
		cout << "Digite a opcao: ";
		
		int opcao; 
		cin >> opcao;		
		
		switch (opcao)
		{
			case 1:
				{			
					if(pilhacheia(&pilha) == false)
					{
						int num = 0;			
						
						cout << "Digite o numero a ser inserido na pilha: ";
						cin >> num;
						
						Push(&pilha, num);	
						cout << "Inserido com sucesso \n\n";		
					}
					else
					{
						cout << "Falha ao inserir - pilha cheia \n\n";
					}
												
					break;	
				}
			
			
			case 2:
				{
					if(pilhavazia(&pilha) == false)
					{
						Pop(&pilha);
						cout << "Removido com sucesso \n\n";	
					}	
					else	
					{
						cout << "Falha ao remover - Pilha vazia \n\n";
					}			
			
					break;				
				}
			
			case 3:
				{
					if(pilhavazia(&pilha) == false)
					{
						int retNumber = Pop(&pilha);
					
						cout << "Numero na pilha ";
						cout << retNumber << "\n\n";
					}
					else
					{					
						cout << "Falha - pilha vazia \n\n";						
					}	

					break;		
				}
			
			case 4:
				{	
					if(pilhavazia(&pilha) == false)
					{
						cout << "Numeros na pilha ";
						
						while(pilhavazia(&pilha) == false)
						{
							cout << Pop(&pilha) << " ";									
						}					
					}
					else 
					{						
						cout << "Falha - pilha vazia \n\n";						
					}
					
					cout << "\n\n";
					
					break;		
				}	
			
			case 5:
				{
					endProgram = true;										
					break;		
				}
			
			default:
				{
					cout << "Opcao invalida \n\n";					
				}			
		}	
	
		if(endProgram == true)
		{
			break;	
		}
		
		system("pause");		
	}
		
	return 0;
}
