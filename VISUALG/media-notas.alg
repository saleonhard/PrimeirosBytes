algoritmo "Conceito

var
n1,n2,n3,media: real
inicio
   escreva("Digite as notas: ")
   leia(n1,n2,n3)
   media:=(n1+n2+n3)/3
    se(media<5)entao
      escreva("Aluno distanciado")
   senao
      se(media<=7.9)entao
       escreva("Aluno aproximado" )
   senao
      escreva("Aluno nivelado")
   fimse
      fimse
fimalgoritmo
