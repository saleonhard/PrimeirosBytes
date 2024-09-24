        #include <stdlib.h>
        #include<stdio.h>
         main() 
         {
           char l;
           int r;
        do
         { 
          printf("\t\t\tMENU\n\t1-continuar\n \t2_sair\n");
            scanf("%d",&r);
           }
        while((r!=1)&&(r!=2));
        
           switch(r)
            {         
          case 1:
              {   
              printf ("Digite uma letra :\n "); 
              scanf  (" %c",&l);
              if(l=='A'||l=='a')
              printf("Foi introduzida a letra %c\n Sua sucessora \202 %c.\n",l,(char)(l+1));
              else
              if(l=='z'||l=='Z')
              printf("Foi introduzida a letra %c\nSua antecessora \202 %c.",l,(char)(l-1));
              else
              printf ("Foi introduzida a letra %c\n Sua antecessora \202 %c.\n Sua sucessora \202 %c.\n", l,(char)(l-1),(char)(l+1)); 
              break;
             }
          default:
             {
          exit(0);         
             }
           } 
          system ("pause");
        }  
