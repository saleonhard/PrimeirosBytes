#include<stdio.h>
#include<stdlib.h>
#include<string.h>
char *r[13]= {"M","CM","D","CD","C","XC","L","XL","X","XI","V","IV","I"};
int i[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
int num,c; 
char *res[8]={" "," ", " "," "," "," "," "," "};
printf("Escriba un numero positivo:\n"); 
scanf("%d",&num);
for(c=0;c<13;c++)
{
while (i[c]<= num)
strcat(res,r[c]);
num=num-i[c]; 
}
printf("El numero en Romano es: %s ",res);
system("pause");
}
