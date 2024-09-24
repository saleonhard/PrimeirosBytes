algoritmo "semnome"
// Função :
// Autor :
// Data : 28/07/2014
// Seção de Declarações
var
n,c,x:inteiro
inicio
escreva(" Digite um número: ")
leia(n)
x:=0
para c de n-1 ate 2 passo -1 faca
   se( n mod c=0)entao
      x:=x+1
   fimse
fimpara
se(x=0)entao
   escreva("O número",n," é primo.")
senao
   escreva("O número",n," não é primo.")
fimse
fimalgoritmo
