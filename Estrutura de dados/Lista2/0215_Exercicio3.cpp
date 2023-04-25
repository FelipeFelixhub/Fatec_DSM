/*
3.ª)  Efetuar  o  cálculo  da  quantidade  de  litros  de  combustível  gastos  em  uma  viagem,
 utilizando-se  um  automóvel  que  faz  “x”    km/l. Para  obter  o  cálculo,  o  usuário  deverá 
fornecer o tempo gasto na viagem e a velocidade média durante a mesma. 
Desta forma será possível   obter a   distância   percorrida   com   a   fórmula:
 DISTÂNCIA=   TEMPO   * VELOCIDADE.
 Tendo  o  valor  da  distância,
 basta  calcular  a quantidade    de    litros    de    combustível    utilizada
 na    viagem    com    a    fórmula:  LITROS_USADOS=DISTÂNCIA / “x” (através de função). 
 O programa deverá apresentar os  valores  da  velocidade  média,  tempo  gasto  na  viagem,  
 a  distância  percorrida  e  a quantidade de litros utilizada na viagem.

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
