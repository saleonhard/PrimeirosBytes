#include <stdio.h>
#include <stdlib.h>

struct animal
{
       char nAni[20];
       char nDono[20];
       char port[10];
       char tipo[10];
       
};

struct dono
{
   char nDon[20];
   char cpf[14];
   char tel[15];
   char cel[15];
}; 


void cadAni( int i)
   {
   FILE*arqAni;          
   struct animal a[2];
   // não estava granvando no arquivo, assim que retirei a linha do if funcionou
   arqAni=fopen("regAni.txt","a");
   
    if(arqAni==NULL )
      {
                           
         printf ("Erro ao criar Arquivo!!!");  
        return;                 
      }
      
           fflush(stdin);
           printf("Informe o nome  do animal: ");
           gets(a[i].nAni);
           printf("Informe o nome  do dono: ");
           gets(a[i].nDono); 
           printf("Informe o porte do aminal: ");
           gets(a[i].port);
           printf("Informe o tipo do aminal: ");
           gets(a[i].tipo);
           printf("\n____________________________\n\n");
           fprintf(arqAni,"%s %s %s %s\n",a[i].nAni,a[i].nDono,a[i].port,a[i].tipo);
           fclose(arqAni);
   }

 void cadDon( int i)
  {
  
  struct dono d[2];
       
          fflush(stdin);
           printf("Informe o nome  do dono: ");
           gets(d[i].nDon);
           printf("Informe o CPF  do dono: ");
           gets(d[i].cpf);
           printf("Informe o CELULAR  do dono: ");
           gets(d[i].cel);
           printf("Informe o TEL. RESIDENCIAL  do dono: "); 
           gets(d[i].tel);
           printf("\n____________________________\n\n");
         
  }       
