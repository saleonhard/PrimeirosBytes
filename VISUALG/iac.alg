algoritmo "IAC,v1.1"
// Função :
// Autor :
// Data : 02/06/2014
// Seção de Declarações
var
c,iac,h:real
sex:caracter
inicio
escreval("**********IAC**********")
escreva("Informe a circunferência do seu quadril: ")
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
      escreval("Não foi possível calcular o seu IAC.")
   senao
      se (iac>=8)e(iac<=20)entao
         escreval("Seu IAC é",iac)
         escreval("Você está com o peso normal.")
      senao
         se(iac>=20)e(iac<=25)entao
            escreval("Seu IAC é",iac)
            escreval("Você está com sobrepeso.")
         senao
            se(iac>25)entao
               escreval("Seu IAC é",iac)
               escreval("Você está obeso.")
            fimse
         fimse
      fimse
   fimse
caso "f"
   se (iac<21)entao
      escreval("Não foi possível calcular o seu IAC.")
      se(iac>=21)e(iac<=32)entao
         escreval("Seu IAC é",iac)
         escreva("Você está com peso normal.")
      senao
         se(iac>=32)e(iac<=38)entao
            escreval("Seu IAC é",iac)
            escreval("Você está com sobrepeso.")
         senao
            se(iac>38)entao
               escreval("Seu IAC é",iac)
               escreval("Você está obesa.")
            fimse
         fimse
      fimse
   fimse
outrocaso
   escreva(" Opção inválida.")
fimescolha
fimalgoritmo

