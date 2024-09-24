algoritmo "semnome"
// Função :
// Autor :
// Data : 30/07/2014
// Seção de Declarações
var
vet:vetor[1..5] de inteiro
sm,c:inteiro
inicio
para  c de 1 ate 5 faca
   escreva(" Digite o",c,"º número :")
   leia(vet[c])
fimpara
se(c=1)entao
sm:=vet[c]
fimse
sm:= 0+vet[c]
escreva(sm)
para c de 1 ate 5 passo -1 faca
   escreval(vet[c])
fimpara
fimalgoritmo
