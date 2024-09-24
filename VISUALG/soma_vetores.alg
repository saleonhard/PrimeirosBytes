algoritmo "semnome"
// Função :
// Autor :
// Data : 29/07/2014
// Seção de Declarações 
var
veta:vetor[1..5] de inteiro
vetb:vetor[1..5] de inteiro
sm,c:inteiro
inicio
escreval("PRIMEIRO VETOR")
para c de 1 ate 5 faca
escreva("Digite o",c," º número:")
leia(veta[c])
fimpara
escreval("SEGUNDO VETOR")
para c de 1 ate 5 faca
escreva("Digite o",c," º número:")

 fimpara
 escreval(" SOMA DOS VETORES ")
para c de 1 ate 5 faca
sm:=veta[c]+vetb[c]
escreval("Vetor A[",c,"] + Vetor B[",c,"] =",sm)
fimpara

fimalgoritmo
