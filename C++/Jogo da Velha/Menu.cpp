#include<stdio.h>
#include<stdlib.h>
main()
{
      int op;
while(1)
   {
        printf("MENU\n1-Jogar\2-Instru\200oes\n3-Sair\n");
        scanf("%d",&op);
        switch(op)
           {
            case 1:
                 {
                 while(1)
                      {
                     printf("JOGAR\n1-CPU\n2- 2 jogadores\n3-Voltar\n");
                     scanf("%d",&op);
                     switch(op)
                          {
                      case 1:{break;}
                               break;
                      case 2:{break;}
                               break;
                      case 3:{break;}
                            continue;
                      default:
                             {
                         printf("Opcao invalida\nPressione \"ENTER\" para tentar novamente");
                            getchar();
                            continue;
                             }
                          }
                       }
                    }     
            case 2:
                { 
                puts("Instrucoes");
                puts("Pressione \"ENTER\" para voltar ao menu inicial");
                getchar();
                continue;
                }
            case 3:
                 {
                   exit(0); 
                   break;
                 }
            default:
                 {
                    printf("Opcao invalida\nPressione \"ENTER\" para tentar novamente");
                    getchar();
                    continue; 
                 }
           }
         
    
}
system("pause");
}



