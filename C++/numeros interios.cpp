#include <stdlib.h>
#include<stdio.h>  
 int main()
{
   int n1,n2,sm,ml,dv,sb;
   char op;
   printf (" Digite dois numeros:\n");
   scanf ("%d %d",&n1,&n2);
   printf ("Digite opcao:\n");
   scanf (" %c",&op);
   switch (op)
   {
   case '+':
        printf("%d + %d= %d\n",n1,n2,n1+n2);
        break;
   case '-':
         printf("%d - %d= %d\n",n1,n2,n1-n2);
        break;
   case '*': 
        printf("%d * %d= %d\n",n1,n2,n1*n2);
        break;    
   case '/':       
       printf("%d / %d= %d\n",n1,n2,n1/n2);
       break;
       default:
       printf ("Opcao invalida\n");
}
system ("pause");
}
