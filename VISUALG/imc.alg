algoritmo "IMC"

var
al,p,imc: real
inicio
 escreva("Informe seu peso: ")
 leia(p)
 escreval("Informe sua altura: ")
 leia(al)
 imc:=p/(al*al)
 escreval("Seu IMC é: ",imc)
  se(imc<18.5)entao
   escreva ("Você está abaixo do peso." )
  senao
    se(imc>=18.5)e(imc<=25)entao
      escreva("Parabéns,você está com o peso ideal." )
  senao
     se(imc>=25)e(imc<=30)entao
       escreva("Você está acima do peso.")
  senao
       escreva("Você está obeso,procure um médico. ")
        fimse
      fimse
     fimse

fimalgoritmo
