/*
3.�)  Efetuar  o  c�lculo  da  quantidade  de  litros  de  combust�vel  gastos  em  uma  viagem,
 utilizando-se  um  autom�vel  que  faz  �x�    km/l. Para  obter  o  c�lculo,  o  usu�rio  dever� 
fornecer o tempo gasto na viagem e a velocidade m�dia durante a mesma. 
Desta forma ser� poss�vel   obter a   dist�ncia   percorrida   com   a   f�rmula:
 DIST�NCIA=   TEMPO   * VELOCIDADE.
 Tendo  o  valor  da  dist�ncia,
 basta  calcular  a quantidade    de    litros    de    combust�vel    utilizada
 na    viagem    com    a    f�rmula:  LITROS_USADOS=DIST�NCIA / �x� (atrav�s de fun��o). 
 O programa dever� apresentar os  valores  da  velocidade  m�dia,  tempo  gasto  na  viagem,  
 a  dist�ncia  percorrida  e  a quantidade de litros utilizada na viagem.

*/

#include <iostream>
using namespace std;

int main () {
	int x = 10;
	int tempoGasto;
	int veloMed;
	
	cout << "informe o tempo gasto em horas e a velocidade: \n";
	cin >> tempoGasto;
	cin >> veloMed;
	
	int distancia = tempoGasto * veloMed;
	
		
	int litrosUsados = distancia / x;
	
	cout << "Velocidade media: " << veloMed <<" km/h\n"; 
	cout << "Tempo gasto: " << tempoGasto << " horas \n";
	cout << "Distancia percorrida: " << distancia << " km\n";
	cout << "Litros usados: " << litrosUsados << " L\n";
	
	
	
	return 0;
	
}
