 algoritmo "ComprouPagou2"
// Fun��o :
// Autor :
// Data : 02/06/2014
// Se��o de Declara��es 
var
p,tx,v,t:real
inicio
 escreva("Informe a porcentagem para a taxa de servi�o: ")
 leia(p)
 escreva("Informe o valor da conta: ")
 leia(v)
 tx:=0.01*p*v
 t:=v+tx
 escreval("Volor da conta: ",v)
 escreval("Taxa de servi�o: ",tx)
 escreval("Total a pagar: ",t)
 
fimalgoritmo
