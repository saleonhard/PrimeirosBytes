algoritmo "semnome"
// Fun��o :
// Autor : LSA
// Data : 28/07/2014
// Se��o de Declara��es
var
n,ma,me,c:inteiro
inicio
para c de 1 ate 20 passo 1 faca
   escreva("Digite o",c,"� n�mero: ")
   leia(n)
   se( c=1)entao
      ma:=n
      me:=n
   fimse
   se(ma<n)entao
      ma:=n
   fimse
   se(me>n)entao
      me:=n
   fimse
fimpara
escreval("O maior n�mero �: ",ma)
escreval("O menor n�mero �: ",me)
fimalgoritmo

