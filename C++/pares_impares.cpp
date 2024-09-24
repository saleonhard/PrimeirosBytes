#include<stdio.h>
#include<stdlib.h>
main()
{int vp[4],vi[4],c,aux,cp=0,ci=0,c1;

for (c=0;c<10;c++){
    printf("\ndigite o %d numero:",c+1);
    scanf("%d",&aux);
     if(aux%2==0){
    vp[c]=aux;
    cp++;}
    
     else{
          vi[c]=aux;
          ci++;}
     if(cp==5)
     {
     puts("\nPares");
   for (c1=0;c1<5;c1++)
   {
   printf("%d",&vp[c]);}}
   if(ci==5)
   {
      puts("\nImpares");
   for (c1=0;c1<5;c1++)
   {
   printf("\n%d",&vi[c]);}} 
         } 
       puts("\nPares");
   for (c1=0;c<5;c++)
   {
   printf("\n%d",&vp[c]);
   }
   puts("\nImpares");
   for(c=0;c<5;c++)
   {
   printf("\n%d",&vi[c]);
   }
   system("pause");
} 
              
