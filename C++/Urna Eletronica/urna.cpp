#include<stdio.h>
#include<stdlib.h>

int main()
{
int cont,opcao,voto,candidato;
char nome[20];

printf ("\nDIGITE O NOME DO ELEITOR: ");
scanf ("%s",nome);
system("cls");
system("color 71");
printf ("\nSEJA BEM VINDO CARO ELEITOR\"%c\"\n",nome);
printf ("-------------------------------------------------------------------------------\n");
printf ("Voce deve escolher entre as opcoes abaixo, apenas uma e digitar enter\n");
printf ("\t\tELEICOES PARA PRESIDENTE. \n");
printf ("\t\tELEICOES PARA DEPUTADO - ESTADO DA BA.\n");
printf ("\t\tELEICOES PARA GOVERNADOR - ESTADO DA BA.\n");
printf ("\t\tINFORMACOES SOBRE OS CANDIDATOS.\n");
printf ("\t\tSAIR.\n"); 
printf ("\t\t-------------------------------------------------------------------------------\n");
printf ("Boa sorte, escolha um bom candidato\n\n");
printf ("Pressione \"ENTER\" para continuar...");
getchar();system ("cls");

printf ("*---------------------------------------------*\n");
printf ("|              MENU DE OPCOES                 |\n");
printf ("*---------------------------------------------*\n");
printf ("|  1 - ELEICAO PARA PRESIDENTE.               |\n");
printf ("|  2 - ELEICAO PARA DEPUTADO - BA             |\n");
printf ("|  3 - ELEICAO PARA GOVERNADOR - BA           |\n");
printf ("|  4 - INFORMACOES SOBRE  OS CANDIDATOS.      |\n");
printf ("|  5 - SAIR.                                  |\n");
printf ("*---------------------------------------------*\n");
printf ("DESEJA IR PARA QUAL OPCAO? \n");
scanf ("%d",&opcao);
system("cls");
switch (opcao)
{
case 1 :
{
system("cls");
printf("*================================================================================================================*\n");
printf("|                                                                                                                |\n");
printf("|  XXXXXXXX  XXXXXXXX    XXXXXXXXX   XXXXXXXXX  XXX  XXXXXXXX   XXXXXXXXX  XXXX     XXX  XXXXXXXXX  XXXXXXXXXX   |\n");
printf("|  XXX   XXX XXX   XXX   XXX         XXX        XXX  XXX   XXX  XXX        XXXXXX   XXX  XXXXXXXXX  XXX          |\n");
printf("|  XXX   XXX XXX   XXX   XXXXXXXXX   XXXXXXXXX  XXX  XXX   XXX  XXXXXXXXX  XXX XXX  XXX     XXX     XXXXXXXXXX   |\n");
printf("|  XXXXXXXXX XXXXXXXX    XXXXXXXXX   XXXXXXXXX  XXX  XXX   XXX  XXXXXXXXX  XXX  XXX XXX     XXX     XXXXXXXXXX   |\n");
printf("|  XXXXXXXX  XXXXXXXXX   XXX               XXX  XXX  XXX   XXX  XXX        XXX   XXXXXX     XXX     XXX          |\n");
printf("|  XXX       XXX    XXX  XXXXXXXXX   XXXXXXXXX  XXX  XXX   XXX  XXXXXXXXX  XXX    XXXXX     XXX     XXXXXXXXXX   |\n");
printf("|  XXX       XXX    XXX  XXXXXXXXX   XXXXXXXXX  XXX  XXXXXXXX   XXXXXXXXX  XXX     XXXX     XXX     XXXXXXXXXX   |\n");
printf("|                                                                                                                |\n"); 
printf("*================================================================================================================*\n\n");
printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf ("*--------------------------------*\n");
printf ("|ESCOLHA O PRESIDENTE|\n");
printf ("*--------------------------------*\n\n");
printf ("1- para DILMA\n");
printf ("2- para LUCIANA GENRO\n");
printf ("3- para MARINA SILVA\n");
printf ("4- para AECIO NEVES\n");
printf ("5- para PASTOR EVERALDO\n");
printf ("6- para EDUARDO JORGE\n");
printf ("7- para ZE MARIA\n");
printf ("8- para LEVI FIDELIS\n");
printf ("9- para BRANCO\n");
printf ("10- para NULO\n");
printf ("ESCOLHA O NUMERO EQUIVALENTE AO QUE DESEJA E DE ENTER\n");
scanf  ("%f",&candidato);
system ("cls");
switch (candidato)
       {
       case 1:printf("%f voto computado com sucesso para DILMA\n",voto);break;
       case 2:printf("%f voto computado com sucesso para LUCIANA GENRO\n",voto);break;
       case 3:printf("%f voto computado com sucesso para MARINA SILVA\n",voto);break;
       case 4:printf("%f voto computado com sucesso para AECIO NEVES\n",voto);break;
       case 5:printf("%f voto computado com sucesso para PASTOR EVERALDO\n",voto);break;
       case 6:printf("%f voto computado com sucesso para EDUARDO JORGE\n",voto);break;
       case 7:printf("%f voto computado com sucesso para ZE MARIA\n",voto);break;
       case 8:printf("%f voto computado com sucesso para LEVI FIDELIS\n",voto);break;
       case 9:printf("%f voto EM BRANCO\n",voto);break;
       case 10:printf("%f voto NULO\n",voto);break;
       default:printf("valor invalido digite um valor de 1 a 10 para votar\n");
       }       
printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");
printf ("Votacao encerrada. Deseja ir para outra opcao de votacao(s/n)? ");

/*PESSOAL EU ESTOU COM PROBLEMAS AQUI PRA FINALIZAR. TIPO O ELEITOR TERIA QUE ESCOLHER UMA OPÇÃO PRA VOLTAR AO MENU INICIAL. TENTEM AÍ
E AO FINAL DE TUDO EU QUERIA MOSTRAR TODOS OS VOTOS DE TODOS OS CANDIDATOS.*/

case 2 :
{
system("cls");
printf("*======================================================================================================================*\n");
printf("|                                                                                                                      |\n");
printf("|   XXXXXXX    XXXXXXX    XXX   XXX   XXXXXXXXX   XXXXXXXX   XXX    XXX  XXXXXXXXX  XXXXXXXX    XXXXXXX   XXXXXXXX     |\n");
printf("|  XXX   XXX  XXX   XXX   XXX   xxx   XXX         XXX   XXX  XXXX   XXX  XXX   XXX  XXXXXXXXX  XXX   XXX  XXX   XXX    |\n");
printf("|  XXX        XXX   XXX   XXX   XXX   XXXXXXXXX   XXX   XXX  XXXXX  XXX  XXX   XXX  XXX   XXX  XXX   XXX  XXX   XXX    |\n");
printf("|  XXX   XXX  XXX   XXX   XXX   XXX   XXXXXXXXX   XXXXXXXX   XXXXXX XXX  XXXXXXXXX  XXX   XXX  XXX   XXX  XXXXXXXX     |\n");
printf("|  XXX    XX  XXX   XXX    XXX XXX    XXX         XXXXXXXXX  XXX XXXXXX  XXXXXXXXX  XXX   XXX  XXX   XXX  XXXXXXXXX    |\n");
printf("|  XXXXXXXXX   XXXXXXX     XXXXXX     XXXXXXXXX   XXX   XXX  XXX   XXXX  XXX   XXX  XXXXXXXXX   XXXXXXX   XXX   XXX    |\n");
printf("|   XXXXXXX     XXXXX       XXXX      XXXXXXXXX   XXX   XXX  XXX    XXX  XXX   XXX  XXXXXXXX     XXXXX    XXX   XXX    |\n");
printf("|                                                                                                                      |\n"); 
printf("*======================================================================================================================*\n\n");
printf ("Pressione \"enter\" para continuar...");
getchar();system ("cls");

printf ("*--------------------------------*\n");
printf ("|ESCOLHA O GOVERNADOR|\n");
printf ("*--------------------------------*\n\n");
printf ("1- para RUI COSTA\n");
printf ("2- para PAULO SOLTO\n");
printf ("3- para \n");
printf ("4- para AECIO NEVES\n");
printf ("5- para PASTOR EVERALDO\n");
printf ("6- para EDUARDO JORGE\n");
printf ("7- para ZE MARIA\n");
printf ("8- para LEVI FIDELIS\n");
printf ("9- para BRANCO\n");
printf ("10- para NULO\n");
system("pause");
}
}
}
}
