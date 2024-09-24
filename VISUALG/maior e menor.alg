algoritmo "semnome"
// Função :
// Autor :
// Data : 22/07/2014
// Seção de Declarações
var
numero : vetor [1..20] de inteiro
i, menor, maior : inteiro
inicio
para i de 1 ate 20 faca
   escreva ("Escreva o ",i," º número: ")
   leia (numero[i])
fimpara
se(i=1)entao
   maior:= numero[1]
   menor := numero[1]
fimse
para i de 2 ate 20 faca
   se (maior <numero [i]) entao
      maior := numero[i]
   fimse
   se (menor >numero[i]) entao
      menor := numero[i]
   fimse
fimpara
escreval ("maior",maior)
escreval ("menor",menor)

fimalgoritmo
