algoritmo "semnome"
// Função :
// Autor : LSA
// Data : 28/07/2014
// Seção de Declarações
var
n,ma,me,c:inteiro
inicio
para c de 1 ate 20 passo 1 faca
   escreva("Digite o",c,"º número: ")
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
escreval("O maior número é: ",ma)
escreval("O menor número é: ",me)
fimalgoritmo

