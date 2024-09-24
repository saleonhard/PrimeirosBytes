#include <stdio.h>
#include <stdlib.h>

int main()
  {
  int i;
  
  // O for aqui não fica interessante, pois pode dar margem a falhas, como por exemplo, 
  //	enviar o valor de i superior ao que se poderia aceitar dentro das duas funcoes, pois
  //	nelas tem o tamanho definido para 2 nos vetores que usam as structs
  // Outro fator é que está condicionado a realizar a mesma quantidade de cadastros para os dois 
  //	itens, ou seja, se alterar a condição "i<1" será para os dois cadastros ao mesmo tempo
  
   for(i=0;i<1;i++)
        {  
          cadAni(i);
          cadDon(i);
        }
    system("PAUSE");	 
  
}
