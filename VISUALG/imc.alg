algoritmo "IMC"

var
al,p,imc: real
inicio
 escreva("Informe seu peso: ")
 leia(p)
 escreval("Informe sua altura: ")
 leia(al)
 imc:=p/(al*al)
 escreval("Seu IMC �: ",imc)
  se(imc<18.5)entao
   escreva ("Voc� est� abaixo do peso." )
  senao
    se(imc>=18.5)e(imc<=25)entao
      escreva("Parab�ns,voc� est� com o peso ideal." )
  senao
     se(imc>=25)e(imc<=30)entao
       escreva("Voc� est� acima do peso.")
  senao
       escreva("Voc� est� obeso,procure um m�dico. ")
        fimse
      fimse
     fimse

fimalgoritmo
