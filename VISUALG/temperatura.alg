algoritmo "semnome"
// Função :
// Autor :
// Data : 15/07/2014
// Seção de Declarações
var
cont: inteiro
tpanual,tp: real
inicio
escreval ("Calculo da temperatura média anual ")
tpanual:=0
para cont de 1 ate 12 passo 1 faca
   escreva ("Digite a temperatura média do mês",cont,":")
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
escreva ("A temperatura média anual foi: ",tpanual)
fimalgoritmo
