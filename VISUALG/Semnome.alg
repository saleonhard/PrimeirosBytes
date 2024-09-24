algoritmo "semnome"
// Função :
// Autor :
// Data : 22/07/2014
// Seção de Declarações
var
n,c,i:inteiro
inicio
escreva("Digite um nº: ")
leia(n)
c:=0;
para i:=2 ate n-1 faca
   se( n mod i = 0) entao
      c:=c+1;
   fimse
fimpara
se (c=0)entao
   escreva("É um número primo.")
senao
   escreva("Não é um número primo.")
fimse
fimalgoritmo
