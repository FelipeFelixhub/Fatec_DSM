#include <iostream>
#include <stdlib.h>
#include "fila.h"
#include <pilha.h>

using namespace std;

int main()
{
	system("CLS");
	int elem, op, x, i, y;
	int contador = 0;
	
	queue q;
	queue q2;
		
	Pilha pilha;

	inicFila(&q); /*inicializa a fila*/
	IniPilha(&pilha);
	
	op = 0;
	/*Loop principal: para sair escolher op??o 4*/
	while (op != 8)
	{
		op = 0;
		/*Desenhando o menu principal*/

		system("CLS");
		cout << "Fila Circular  \n\n\n";
		cout << "\n (1) - Insere um elemento na Fila";
		cout << "\n (2) - Remove um elemento da Fila";
		cout << "\n (3) - Imprime a Fila";
		cout << "\n (4) - Para inverter a fila";
		cout << "\n (5) - Para retornar o numero de elementos na fila circular";
		cout << "\n (6) - Para exibir o primeiro elemeto da fila";
		cout << "\n (7) - Para exibir o ultimo elemento da fila";
		cout << "\n (8) - Para SAIR";	
		cout << "\n Digite sua opcao";
		cin >> op;

		/*recebendo a op??o ate que seja fornecida uma valida*/
		while (op < 1 || op > 8)
		{
			cin >> op;
		}
		/*Escolha*/
		switch (op)

		{
			case 1:
				if (filaCheia(&q) == 1)
				{
					cout << "A fila esta cheia!!";
					system("PAUSE");
				}
				else
				{
					system("CLS");

					cout << "Entre com um valor : ";
					cin >> elem;
					insFila(&q, elem);
				}
				break;
			case 2:
				if (filaVazia(&q) == 1)
				{
					cout << "A fila esta vazia!!";
					system("PAUSE");
				}
				else
				{
					x = remFila(&q);
					cout <<"Valor removido" << x;
					system("PAUSE");
				}
				break;

			case 3:
				if (filaVazia(&q) == 1)
				{
					cout << "A fila esta vazia!!";
					system("PAUSE");
				}

				else
				{
					y = guardainicio(&q);
					while (!filaVazia(&q))
					{
						x = remFila(&q);
						cout << x << " ";
					}
				}
				retornainicio(&q, y);
				system("PAUSE");
				
			case 4:
				
				while(filaVazia(&q) == false)
				{
					Push(&pilha, remFila(&q));
				} 
				
				while(pilhavazia(&pilha) == false)
				{
					insFila(&q, Pop(&pilha));				
				}
								
				break;
				
								
			case 5:				
				while(filaVazia(&q) == false)
				{
					insFila(&q2, remFila(&q));
					contador++;					
				} 
				
				while(filaVazia(&q2) == false)
				{
					insFila(&q, remFila(&q2));				
				} 
				
				cout << " Contador " << contador;
				system("PAUSE");
								
				break; 
				
								
			case 6:
				
				break;
				
								
			case 7:
				
				break;				
		
			case 8:
			break;
		}
	}
}


void inverte_fila(queue *q)
{
	Pilha pilha;	
	
	while(filaVazia(&q) == false)
	{
		Push(&pilha, remFila(&q));
	} 
	
	while(pilhavazia(&pilha) == false)
	{
		insFila(&q, Pop(&pilha));				
	}	
}






