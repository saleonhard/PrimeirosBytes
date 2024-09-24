 algoritmo "ComprouPagou2"
// Função :
// Autor :
// Data : 02/06/2014
// Seção de Declarações 
var
p,tx,v,t:real
inicio
 escreva("Informe a porcentagem para a taxa de serviço: ")
 leia(p)
 escreva("Informe o valor da conta: ")
 leia(v)
 tx:=0.01*p*v
 t:=v+tx
 escreval("Volor da conta: ",v)
 escreval("Taxa de serviço: ",tx)
 escreval("Total a pagar: ",t)
 
fimalgoritmo
