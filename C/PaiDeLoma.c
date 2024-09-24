#include <stdio.h>
#include <stdlib.h>


void escrever()
   {
   FILE*arq;          
  int i, num, v[99];
   arq=fopen("SeiLa.txt","a");
   
    if(arq==NULL )
      {
                           
         printf ("ERRO AO CRIAR ARQUIVO!!!");  
        return;                 
      }
      
   do{
    
    printf("Digite um numero: ");
    scanf("%d",&num);
    
    if(num>0||num>99)
     continue;
    
    for(i=0;i<100;i++){
    
    if(num==i){
    v[i]++;
    }
    
    }
    
    }while(num!=0);   
      
      
}     
