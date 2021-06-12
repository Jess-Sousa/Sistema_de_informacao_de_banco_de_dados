Problema: Um programa para calcular o perímetro e a área de uma forma

Atividade
1) Crie uma interface para representar qualquer forma geométrica, definindo métodos para 'cálculo do
perímetro' e 'cálculo da área' da forma
2) Crie uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos 4
lados. Além disso, já implemente nesta classe o método de 'cálculo do perímetro'
3) Crie Classes para representar retângulos e quadrados. A classe Retângulo deve receber o tamanho da base e da
altura no construtor da classe. Já a classe Quadrado deve receber apenas o tamanho do lado;
4) Crie uma classe para representar um círculo. Nela, você deve aplicar sobrecarga e criar 2 construtores: um que não recebe nada (e atribui 1 ao raio) e outro que recebe o tamanho do raio.
 

Na classe principal (com o main), você deve instanciar um quadrado, um retângulo e um círculo, e deve  imprimir: (a) os dados (lados ou raio); (b) os perímetros; e (c) as áreas de todas as formas

PS: Note que todas as classes que são de formas geométricas devem implementar a interface criada no item 1). Além disso, as classes criadas que são de quadriláteros tem que estender a classe criada no item 2)