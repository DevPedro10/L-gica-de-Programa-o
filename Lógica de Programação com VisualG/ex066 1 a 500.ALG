Algoritmo "02  Manzano"
// Disciplina   : [Lógica de Programação e JavaScript]
// Professor   : Jailson 
// Descrição   : Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
// Autor(a)    : Natã Pedro da Silva
// Data atual  : 06/09/2021
Var
// Seção de Declarações das variáveis
soma, numero:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
numero<-1
para numero de 1 ate 500 passo 1 faça
se (numero mod 2=0) entao
soma<-numero + soma
fimse
fimpara
escreval("o somatorio dos valores pares é:",soma)

Fimalgoritmo