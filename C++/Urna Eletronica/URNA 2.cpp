#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{
int opcao,votop,votog,votod, vd,vlg,vms,van,vpe,bp,np,vrc,vps,vlm,vrm,vmm,bg,ng,candidatop,candidatog,candidatod;
char resp,P,eleitor[50];

printf ("Qual o nome do eleitor?\n");
gets (eleitor);
system("color 71");
printf ("\nSEJA BEM VINDO CARO ELEITOR\ %c\n",eleitor);
system ("cls");
printf ("-------------------------------------------------------------------------------\n");
printf ("Voce deve escolher entre as opcoes abaixo, apenas uma e digitar enter\n");
printf ("\t\tELEICOES PARA PRESIDENTE - GOVERNADOR E DEPUTADO DO ESTADO DA BA.\n");
printf ("\t\tINFORMACOES SOBRE OS CANDIDATOS.\n");
printf ("\t\tSAIR.\n"); 
printf ("\t\t-------------------------------------------------------------------------------\n");
printf ("Boa sorte, escolha um bom candidato\n\n");
printf ("Pressione \"ENTER\" para continuar...");
getchar();system ("cls");
menu:
printf ("*---------------------------------------------------------*\n");
printf ("|                    MENU DE OPCOES                       |\n");
printf ("*---------------------------------------------------------*\n");
printf ("|  1 - ELEICAO PRESIDENTE - GOV. DEP. ESTADO DA BA        |\n");
printf ("|  2 - INFORMACOES SOBRE  OS CANDIDATOS A PRESIDENCIA.    |\n");
printf ("|  3 - SAIR.                                              |\n");
printf ("*---------------------------------------------------------*\n");
printf ("DESEJA IR PARA QUAL OPCAO? \n");
scanf ("%d",&opcao);
system("cls");

switch (opcao)
{
case 1 :
{
system("cls");

printf("*===================================================================================*\n");
printf("|                                                             /X\ /XX/              |\n");
printf("|                                                            /XX/\XX/               |\n");
printf("|  ***   ***   XXXXXXX    XXXXXXXXX   XXXXXXXXX   XXXXXXXX  XXXXXXXXX   XXXXXXX     |\n");
printf("|  ***   ***  XXXXXXXXX   XXXXXXXXX   XXXXXXXXX  XXXXXXXXX  XXXXXXXXX  XXXXXXXXX    |\n");
printf("|  ***   ***  XXX   XXX      XXX      XXX   XXX  XXX        XXX   XXX  XXX   XXX    |\n");
printf("|  ***   ***  XXX   XXX      XXX      XXXXXXXXX  XXX        XXXXXXXXX  XXX   XXX    |\n");
printf("|   **   **   XXX   XXX      XXX      XXXXXXXXX  XXX        XXXXXXXXX  XXX   XXX    |\n");
printf("|    ** **    XXXXXXXX       XXX      XXX   XXX  XXXXXXXXX  XXX   XXX   XXXXXXX     |\n");
printf("|     ***      XXXXXX        XXX      XXX   XXX   XXXXXXXX  XXX   XXX    XXXXX      |\n");
printf("|      *                                            XX                              |\n"); 
printf("*===================================================================================*\n\n");

printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf ("*--------------------------------*\n");
printf ("|ESCOLHA O PRESIDENTE            |\n");
printf ("*--------------------------------*\n\n");
printf ("1- para DILMA\n");
printf ("2- para LUCIANA GENRO\n");
printf ("3- para MARINA SILVA\n");
printf ("4- para AECIO NEVES\n");
printf ("5- para PASTOR EVERALDO\n");
printf ("6- para BRANCO\n");
printf ("7- para NULO\n");
printf ("ESCOLHA O NUMERO EQUIVALENTE AO QUE DESEJA E DE ENTER\n");
scanf  ("%d",&candidatop);
system ("cls");
switch (candidatop)
       {
       case 1:printf(" voto computado com sucesso para DILMA\n");vd++;break;
       case 2:printf(" voto computado com sucesso para LUCIANA GENRO\n");vlg++;break;
       case 3:printf(" voto computado com sucesso para MARINA SILVA\n");vms++;break;
       case 4:printf(" voto computado com sucesso para AECIO NEVES\n");van++;break;
       case 5:printf(" voto computado com sucesso para PASTOR EVERALDO\n");vpe++;break;
       case 6:printf(" voto EM BRANCO\n",votop);bp++;break;
       case 7:printf(" voto NULO\n",votop);np++;break;
       default:printf("valor invalido digite um valor de 1 a 7 para votar\n");
       }       

printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf ("*--------------------------------*\n");
printf ("|ESCOLHA O GOVERNADOR            |\n");
printf ("*--------------------------------*\n\n");
printf ("1- para RUI COSTA\n");
printf ("2- para PAULO SOLTO\n");
printf ("3- para LIDICE DA MATA\n");
printf ("4- para RENATA MALLET\n");
printf ("5- para MARCOS MENDES\n");
printf ("6- para BRANCO\n");
printf ("7- para NULO\n");
printf ("ESCOLHA O NUMERO EQUIVALENTE AO QUE DESEJA E DE ENTER\n");
scanf  ("%d",&candidatog);
system ("cls");
switch (candidatog)
       {
       case 1:printf(" voto computado com sucesso para RUI COSTA\n");vrc++;break;
       case 2:printf(" voto computado com sucesso para PAULO SOLTO\n");vps++;break;
       case 3:printf(" voto computado com sucesso para LIDICE DA MATA\n");vlm++;break;
       case 4:printf(" voto computado com sucesso para RENATA MALLET\n");vrm++;break;
       case 5:printf(" voto computado com sucesso para MARCOS MENDES\n");vmm++;break;
       case 6:printf(" voto EM BRANCO\n");bg++;break;
       case 7:printf(" voto NULO\n");ng++;break;
       default:printf("valor invalido digite um valor de 1 a 7 para votar\n");
       }       
printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf ("*--------------------------------*\n");
printf ("|ESCOLHA O DEPUTADO ESTADUAL     |\n");
printf ("*--------------------------------*\n\n");
printf ("1- para \n");
printf ("2- para \n");
printf ("3- para \n");
printf ("4- para \n");
printf ("5- para \n");
printf ("6- para \n");
printf ("7- para \n");
printf ("ESCOLHA O NUMERO EQUIVALENTE AO QUE DESEJA E DE ENTER\n");
scanf  ("%d",&candidatog);
system ("cls");
switch (candidatog)
       {
       case 1:printf("%f voto computado com sucesso para \n",votog);break;
       case 2:printf("%f voto computado com sucesso para \n",votog);break;
       case 3:printf("%f voto computado com sucesso para \n",votog);break;
       case 4:printf("%f voto computado com sucesso para \n",votog);break;
       case 5:printf("%f voto computado com sucesso para \n",votog);break;
       case 6:printf("%f voto EM BRANCO\n",votog);break;
       case 7:printf("%f voto NULO\n",votog);break;
       default:printf("valor invalido digite um valor de 1 a 7 para votar\n");
       }       
printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");
printf ("VOTACAO ENCERRADA - DIGITE (P) PARA VOLTAR AO MENU DE OPCOES\n");
P==getchar();system ("cls");
goto menu;
case 2:
{
     system ("cls");
     
printf(" ****===========================================****");
printf(" |   INFORMACAO SOBRE OS CANDIDATOS A PRESIDENCIA  |");
printf(" ****===========================================****");

printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf (" CANDIDATA DILMA ROUSEFF\n");
printf ("");
printf ("");
printf ("");
printf ("");
printf ("");
printf (" CANDIDATA LUCIANA GENRO");
printf ("");
printf ("");
printf ("");
printf ("");
printf ("");
printf (" CANDIDATA MARINA SILVA");
printf ("");
printf ("");
printf ("");
printf ("");
printf ("");
printf (" CANDIDATO AECIO NEVES");
printf ("");
printf ("");
printf ("");
printf ("");
printf ("");
printf (" CANDIDATO PASTOR EVERALDO");
printf ("");
printf ("");
printf ("");
printf ("");
printf ("");

printf (" Pressione (P) para voltar ao menu principal");
P==getchar();system("cls");
case 3:
     exit(0);
default:
   puts("Opcao Invalida");          
     
}
}
}
if(dilma>luciana&&dilma>marina&&dilma>)










system("pause");
}

          






