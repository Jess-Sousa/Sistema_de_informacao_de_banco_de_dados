package TrabalhoPratico3;

public interface FormasGeometricas {
     double calculoPerimetro();
     double calculoArea();
    }
    
/*
Objetivo: Praticar conceitos de OO (Heran�a, Classes Abstratas, Interfaces e Polimorfismo ) 

Problema: Um programa para calcular o per�metro e a �rea de uma forma

Atividade
1) Crie uma interface para representar qualquer forma geom�trica, 
definindo m�todos para 'c�lculo doper�metro' e 'c�lculo da �rea' da forma



Na classe principal (com o main), voc� deve instanciar um quadrado, um ret�ngulo e um c�rculo, 
e deve  imprimir: (a) os dados (lados ou raio); (b) os per�metros; e (c) as �reas de todas as formas

PS: Note que todas as classes que s�o de formas geom�tricas devem implementar a interface criada no item 
1). Al�m disso, as classes criadas que s�o de quadril�teros tem que estender a classe criada no item 2)
*/