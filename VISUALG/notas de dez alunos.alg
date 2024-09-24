algoritmo "semnome"
// Função :
// Autor :
// Data : 15/07/2014
// Seção de Declarações
var
n1,n2,n3,n4,md: real
al: inteiro
inicio
escreval ("Média ")
al:=0
para al de 1 ate 10 passo 1 faca
   escreva ("Digite as suas quatro notas",al,":")
   leia(n1,n2,n3,n4)
   md:= (n1+n2+n3+n4)/4
   se (md<7)entao
      escreval ("Reprovado.")
   senao
      escreval ("Aprovado.")
   fimse
fimpara
fimalgoritmo
