#include<stdlib.h>
#include<stdio.h>
main(){
int i,v[5];
for(i=0;i<5;i++){
scanf("%d",&v[i]);
}
for(i=0;i<5;i++){
if(v[i]>0)
printf("Positivo:%d\n",v[i]);
else
printf("Ind. Negativo:%d\n",i);
}
}
