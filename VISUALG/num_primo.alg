algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 28/07/2014
// Se��o de Declara��es
var
n,c,x:inteiro
inicio
escreva(" Digite um n�mero: ")
leia(n)
x:=0
para c de n-1 ate 2 passo -1 faca
   se( n mod c=0)entao
      x:=x+1
   fimse
fimpara
se(x=0)entao
   escreva("O n�mero",n," � primo.")
senao
   escreva("O n�mero",n," n�o � primo.")
fimse
fimalgoritmo
