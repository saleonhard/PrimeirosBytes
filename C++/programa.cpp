#include <stdlib.h>
#include<stdio.h>
int main(){
   float a, b, c;
   float aTri, aCir, aTra, aQua, aRet, sCub;
   float pi;
   pi = 3.141516;
   // AREA DE UM TRIANGULO
   printf ("Digite o primeiro valor: ");
   scanf  ("%f", &a);
   printf ("Digite o segundo valor: ");
   scanf ("%f", &b);
   printf ("Digite o terceiro valor: ");
   scanf ("%f", &c);
   
   aTri = (a*b)/2;
   aCir = pi*(c*c);
   aTra = (a+b)*c/2;
   aQua = (b*b);
   aRet = (a*b);
   sCub = (c*c)*6;
   
   printf ("%.2f: Area do triangulo \n", aTri);  
   printf ("%.2f: Area do circulo \n", aCir); 
   printf ("%.2f: Area do trapezio \n", aTra);
   printf ("%.2f: Area do quadrado \n", aQua); 
   printf ("%.2f: Area do retangulo \n", aRet);
   printf ("%.2f: Superficie do cubo \n",  sCub);
   system ("pause");
   }
