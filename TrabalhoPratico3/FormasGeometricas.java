package TrabalhoPratico3;

public class FormasGeometricas
{
    
}

/*
Objetivo: Praticar conceitos de OO (Heran�a, Classes Abstratas, Interfaces e Polimorfismo ) 

Problema: Um programa para calcular o per�metro e a �rea de uma forma

Atividade
1) Crie uma interface para representar qualquer forma geom�trica, 
definindo m�todos para 'c�lculo doper�metro' e 'c�lculo da �rea' da forma
2) Crie uma classe abstrata para representar quadril�teros. 
Seu construtor deve receber os tamanhos dos 4 lados. Al�m disso, 
j� implemente nesta classe o m�todo de 'c�lculo do per�metro'
3) Crie Classes para representar ret�ngulos e quadrados. 
A classe Ret�ngulo deve receber o tamanho da base e da altura no construtor da classe. 
J� a classe Quadrado deve receber apenas o tamanho do lado;
4) Crie uma classe para representar um c�rculo. 
Nela, voc� deve aplicar sobrecarga e criar 2 construtores: 
um que n�o recebe nada (e atribui 1 ao raio) e outro que recebe o tamanho do raio.
 

Na classe principal (com o main), voc� deve instanciar um quadrado, um ret�ngulo e um c�rculo, 
e deve  imprimir: (a) os dados (lados ou raio); (b) os per�metros; e (c) as �reas de todas as formas

PS: Note que todas as classes que s�o de formas geom�tricas devem implementar a interface criada no item 
1). Al�m disso, as classes criadas que s�o de quadril�teros tem que estender a classe criada no item 2)
*/