algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 15/07/2014
// Se��o de Declara��es
var
cont: inteiro
tpanual,tp: real
inicio
escreval ("Calculo da temperatura m�dia anual ")
tpanual:=0
para cont de 1 ate 12 passo 1 faca
   escreva ("Digite a temperatura m�dia do m�s",cont,":")
   leia (tp)
   se (tp>35)entao
      escreval (" Temperatura alta.")
   senao
      se(tp<5)entao
         escreval ("Temperatura baixa.")
      fimse
   fimse
   tpanual:=tp+tp
fimpara
tp:=tp/12
escreva ("A temperatura m�dia anual foi: ",tpanual)
fimalgoritmo
