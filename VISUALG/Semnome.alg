algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 22/07/2014
// Se��o de Declara��es
var
n,c,i:inteiro
inicio
escreva("Digite um n�: ")
leia(n)
c:=0;
para i:=2 ate n-1 faca
   se( n mod i = 0) entao
      c:=c+1;
   fimse
fimpara
se (c=0)entao
   escreva("� um n�mero primo.")
senao
   escreva("N�o � um n�mero primo.")
fimse
fimalgoritmo
