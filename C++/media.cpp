#include<stdlib.h>
#include<stdio.h>
int main()
  {
   int c;   
  float sm,n,md;
  for(c=1;c<5;c++)
  {
  printf("Informe a %d nota:\n",c);
  scanf("%f",&n);
  sm+=n;
    } 
    md=sm/4;
    printf("Sua media eh= %.2f\n",md);
    if(md>=9.0)
    printf("Aluno Nivelado\n ");
    else
    if(md<=6.9)
    printf("Aluno Distanciado\n");
    else
    if(md=7.0&&8.9)
    printf("Aluno Aproximado\n");
    system("pause");
}
