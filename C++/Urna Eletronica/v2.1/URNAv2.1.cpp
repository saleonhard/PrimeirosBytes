#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

main() 
 { 
char nome[60];
int op,op2,opr,inf,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,n=0,b=0,votos=0;
const int ESC=27;

riniciar:
do
{printf("\n\n\n\n\n");
printf("   \t\n\t\t***    **  ********  ***      ***  ***********");
printf("   \t\n\t\t***    **  ********  ****     ***  ***      **");
printf("   \t\n\t\t***    **  **    **  *****    ***  ***      **");
printf("   \t\n\t\t***    **  **    **  *** *    ***  ***      **");
printf("   \t\n\t\t***    **  ********  ***  *   ***  ***********");
printf("   \t\n\t\t***    **  *******   ***   *  ***  ***********");
printf("   \t\n\t\t***    **  ** **     ***    * ***  ***      **");
printf("   \t\n\t\t***    **  **  **    ***     ****  ***      **");
printf("   \t\n\t\t*********  **   **   ***      ***  ***      **");
printf("   \t\n\t\t*********  **    **  ***       *   ***      **");

printf("\n\n\n\n\n\n\n\n\t\t\tPressione\"ENTER\" para continuar...");
getchar();
system("cls");
puts("\n\tDigite seu nome\n");
gets(nome);
menu:
printf("\n\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
printf("\n\xBA                            \xBA");
printf("\n\xBA       MENU INICIAL         \xBA");
printf("\n\xBA                            \xBA");
printf("\n\xCC\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xB9");
printf("\n\xBA                            \xBA");
printf("\n\xBA                            \xBA");
printf("\n\xBA                            \xBA");
printf("\n\xBA 1-VOTAR                    \xBA");
printf("\n\xBA 2-INFORMACOES              \xBA");
printf("\n\xBA 3-SAIR                     \xBA"); 
printf("\n\xBA                            \xBA");
printf("\n\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
puts("\n");



scanf("%d",&op);
system("cls");
switch(op)
 
 { case 1:
  
{ votar:
printf("         \n\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
printf("         \n\xBA                                                    \xBA");
printf("         \n\xBA                    CANDIDATOS                      \xBA");
printf("         \n\xCC\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xB9");                 
printf("         \n\xBA                                                    \xBA");
printf("         \n\xBA                                                    \xBA");
printf("         \n\xBA 45-Aecio Neves(PSDB)                               \xBA"); 
printf("         \n\xBA 13-Dilma(PT)                                       \xBA");
printf("         \n\xBA 43-Eduardo Jorge(PV)                               \xBA");
printf("         \n\xBA 27-Eymael(PSDC)                                    \xBA");
printf("         \n\xBA 28-Levy Fidelix(PRTB)                              \xBA");
printf("         \n\xBA 50-Luciana Genro(PSOL)                             \xBA");
printf("         \n\xBA 40-Marina Silva(PSB)                               \xBA") ;
printf("         \n\xBA 21-Mauro Iasi(PCB)                                 \xBA");
printf("         \n\xBA 20-Pastor Everaldo(PSC)                            \xBA");
printf("         \n\xBA 29-Rui Costa Pimenta(PCO)                          \xBA");
printf("         \n\xBA 16-Ze Maria(PSTU)                                  \xBA");
printf("         \n\xBA 0- Nulo                                            \xBA");
printf("         \n\xBA                                                    \xBA");
printf("         \n\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
puts("\n");

scanf("%d",&op2);

switch(op2)
{
  {
  
case 45:c1++;break; 
case 13:c2++;break;
case 43:c3++; break;
case 27:c4++;break;
case 28:c5++;break;
case 50:c6++;break;
case 40:c7++;break;
case 21:c8++;break;
case 20:c9++;break;
case 29:c10++;break;
case 16:c11++;break;
case 0:n++;break;
 
 }
  
 default:
 
 {  printf("OPS!!!, %s voc\210 digitou uma op\207\204o invalida\n",nome);

puts("Pressione \"ENTER\" para tente novamente");

getchar();
goto votar;
}

 }votos++;
printf("\n*********************     **********   *******                           *******");
printf("\n*********************     **********   *************                 ***********");
printf("\n*********************     **********   ******* *****               ***** *******");
printf("\n**********                **********   *******  *****             *****  *******");
printf("\n**********                **********   *******   *****           *****   *******");
printf("\n********************      **********   *******    *****         *****    *******");
printf("\n********************      **********   *******     *****       *****     *******");
printf("\n********************      **********   *******      *****    *****       *******");
printf("\n**********                **********   *******       ***** *****         *******");
printf("\n**********                **********   *******        *******            *******");
printf("\n**********                **********   *******         ******            *******");
printf("\n**********                **********   *******          ****             *******");
printf(" \7\7");

puts("\n");

                                                             
 break;

case 2:
  
{
 info:
 printf("        \n\xC9\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBB");
printf("         \n\xBA                                                        \xBA");
printf("         \n\xBA                    CANDIDATOS                          \xBA");                          
printf("         \n\xCC\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xB9");
printf("         \n\xBA                                                        \xBA");
printf("         \n\xBA 1 -Aecio Neves(PSDB)                                   \xBA");
printf("         \n\xBA 2 -Dilma(PT)                                           \xBA");
printf("         \n\xBA 3-Eduardo Jorge(PV)                                    \xBA");
printf("         \n\xBA 4-Eymael(PSDC)                                         \xBA");
printf("         \n\xBA 5-Levy Fidelix(PRTB)                                   \xBA");
printf("         \n\xBA 6-Luciana Genro(PSOL)                                  \xBA");
printf("         \n\xBA 7-Marina Silva(PSB)                                    \xBA"); 
printf("         \n\xBA 8-Mauro Iasi(PCB)                                      \xBA");
printf("         \n\xBA 9-Pastor Everaldo(PSC)                                 \xBA");
printf("         \n\xBA 10-Rui Costa Pimenta(PCO)                              \xBA");
printf("         \n\xBA 11-Ze Maria(PSTU)                                      \xBA");
printf("         \n\xBA                                                        \xBA");
printf("         \n\xBA                                                        \xBA");
printf("         \n\xC8\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xCD\xBC");
puts("\n"); 
scanf("%d",&inf); 

switch(inf)
{
 {
case 1:printf("VAZIO\n");goto menu;break;
case 2:printf("VAZIO\n");goto menu;break;
case 3:printf("VAZIO\n");goto menu; break;
case 4:printf("VAZIO\n");goto menu;break;
case 5:printf("VAZIO\n");goto menu;break;
case 6:printf("VAZIO\n");goto menu;break;
case 7:printf("VAZIO\n");goto menu;break;
case 8:printf("VAZIO\n");goto menu;break;
case 9:printf("VAZIO\n");goto menu;break;
case 10:printf("VAZIO\n");goto menu;break;
case 11: printf("VAZIO\n");goto menu;break;
 }
default:
  { printf("OPS!!!, %s voc\210 digitou uma op\207\204o invalida\n",nome);
puts("Pressione \"ENTER\" para tente novamente");
getchar();
goto info;}
   }
case 3:
     
 exit(0);break;
default:
        {
 printf("OPS!!!, %s voc\210 digitou uma op\207\204o invalida\n",nome);
puts("Pressione \"ENTER\" para tente novamente");
getchar();
 goto menu;}
 
 }
 
} 
}
} while(getche()!=ESC); {
 if(c1>c2&&c1>c3&&c1>c4&&c1>c5&&c1>c6&&c1>c7&&c1>c8&&c1>c9&&c1>c10&&c1>c11)
printf("\nAecio Neves foi eleito com %.2f%% dos votos.\n",(c1*(float)100)/votos);
else
if(c2>c1&&c2>c3&&c2>c4&&c2>c5&&c2>c6&&c2>c7&&c2>c8&&c2>c9&&c2>c10&&c2>c11)
printf(" Dilma   foi eleita com %.2f%% dos votos.\n",((float)c2*(float)100)/(float)votos);
else
if(c3>c1&&c3>c2&&c3>c4&&c3>c5&&c3>c6&&c3>c7&&c3>c8&&c3>c9&&c3>c10&&c3>c11)
printf("Eduardo Jorge foi eleito com %.2f%% dos votos.\n",((float)c3*(float)100)/(float)votos);
else
if(c4>c1&&c4>c2&&c4>c3&&c4>c5&&c4>c6&&c4>c7&&c4>c8&&c4>c9&&c4>c10&&c4>c11)
printf("Eymael foi eleito com %.2f%% dos votos.\n",((float)c4*(float)100)/(float)votos);
else
if(c5>c1&&c5>c2&&c5>c3&&c5>c4&&c5>c6&&c5>c7&&c5>c8&&c5>c9&&c5>c10&&c5>c11)
printf("Levy Fidelix foi eleito com %.2f%% dos votos.\n",((float)c5*(float)100)/(float)votos);
else
if(c6>c1&&c6>c2&&c6>c3&&c6>c4&&c6>c5&&c6>c7&&c6>c8&&c6>c9&&c6>c10&&c6>c11)
printf("Luciana foi eleita com %.2f%% dos votos.\n",((float)c6*(float)100)/(float)votos);
else
if(c7>c1&&c1>c2&&c1>c3&&c1>c4&&c1>c5&&c1>c6&&c1>c8&&c1>c9&&c1>c10&&c1>c11)
printf("Marina Silva foi eleita com %.2f%% dos votos.\n",((float)c7*(float)100)/(float)votos);
else
if(c8>c1&&c8>c2&&c8>c3&&c8>c4&&c8>c5&&c8>c6&&c8>c7&&c8>c9&&c8>c10&&c8>c11)
printf("Mauro Iasi foi eleito com %.2f%% dos votos.\n",((float)c8*(float)100)/(float)votos);
else
if(c9>c1&&c9>c2&&c9>c3&&c9>c4&&c9>c5&&c9>c6&&c9>c7&&c9>c8&&c9>c10&&c9>c11)
printf("Pastor Everaldo foi eleito com %.2f%% dos votos.\n",((float)c9*(float)100)/(float)votos);
else
if(c10>c1&&c10>c2&&c10>c3&&c10>c4&&c10>c5&&c10>c6&&c10>c7&&c10>c8&&c10>c9&&c10>c11)
printf("Rui Costa Pimenta foi eleito com %.2f%% dos votos.\n",((float)c10*(float)100)/(float)votos);
else
if(c11>c1&&c11>c2&&c11>c3&&c11>c4&&c11>c5&&c11>c6&&c11>c7&&c11>c8&&c11>c9&&c1>c10)
printf("Ze Maria foi eleito com %.2f%% dos votos.\n",((float)c11*(float)100)/(float)votos);
}
system("pause");
vreinciar:
printf("REINICIAR VOTACAO\n1-REINICIAR\n2-SAIR\n");
scanf("%d",&opr);
switch(opr)
{case 1:
      goto riniciar;break;
 case 2: 
      exit(0);break;
    default:
            { printf("OPS!!!, %s voc\210 digitou uma op\207\204o invalida\n",nome);
puts("Pressione \"ENTER\" para tente novamente");
getchar();
goto vreinciar;
            }       

}
}

