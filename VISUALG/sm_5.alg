algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 30/07/2014
// Se��o de Declara��es
var
vet:vetor[1..5] de inteiro
veti:vetor[1..5]
sm,c:inteiro
inicio
para  c de 1 ate 5 faca
   escreva(" Digite o",c,"� n�mero :")
   leia(vet[c])
fimpara
para  c de 1 ate 5 faca
   sm:=sm+vet[c]
fimpara
escreval(sm)
para  c de 1 ate 5 faca
   veti[c]:=vet[5-c]
fimpara
para  c de 1 ate 5 faca
   escreva(veti)
fimpara
fimpara
fimalgoritmo
