algoritmo "IAC,v1.1"
// Fun��o :
// Autor :
// Data : 02/06/2014
// Se��o de Declara��es
var
c,iac,h:real
sex:caracter
inicio
escreval("**********IAC**********")
escreva("Informe a circunfer�ncia do seu quadril: ")
leia(c)
escreva("Informe sua altura: ")
leia(h)
escreval("Informe o seu sexo: ")
escreval("Digite 'M' para masculino.")
escreval("Digite 'F' para feminino.")
iac:=c/(h*raizq(h))-18
leia(sex)
escolha sex
caso "m"
   se(iac<8)entao
      escreval("N�o foi poss�vel calcular o seu IAC.")
   senao
      se (iac>=8)e(iac<=20)entao
         escreval("Seu IAC �",iac)
         escreval("Voc� est� com o peso normal.")
      senao
         se(iac>=20)e(iac<=25)entao
            escreval("Seu IAC �",iac)
            escreval("Voc� est� com sobrepeso.")
         senao
            se(iac>25)entao
               escreval("Seu IAC �",iac)
               escreval("Voc� est� obeso.")
            fimse
         fimse
      fimse
   fimse
caso "f"
   se (iac<21)entao
      escreval("N�o foi poss�vel calcular o seu IAC.")
      se(iac>=21)e(iac<=32)entao
         escreval("Seu IAC �",iac)
         escreva("Voc� est� com peso normal.")
      senao
         se(iac>=32)e(iac<=38)entao
            escreval("Seu IAC �",iac)
            escreval("Voc� est� com sobrepeso.")
         senao
            se(iac>38)entao
               escreval("Seu IAC �",iac)
               escreval("Voc� est� obesa.")
            fimse
         fimse
      fimse
   fimse
outrocaso
   escreva(" Op��o inv�lida.")
fimescolha
fimalgoritmo

