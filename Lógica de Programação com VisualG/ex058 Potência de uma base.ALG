Algoritmo "Potência exercicio F"
// Disciplina   : [Lógica de Programação e JavaScript]
// Professor   : Jailson 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Natã Pedro da Silva
// Data atual  : 02/09/2021
Var
// Seção de Declarações das variáveis 
divisor,dividendo, cont:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Digite o valor do dividendo: ")
Leia(dividendo)
Escreval("Digite o valor do divisor: ")
Leia(divisor)

se divisor>dividendo entao
Escreval("Não é possível efetuar a divisão")
senao
Repita
 dividendo<-dividendo-divisor
 cont<-cont=1
ate divisor>dividendo
 escreval(cont)
fimse
Fimalgoritmo