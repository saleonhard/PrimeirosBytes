    #include <stdlib.h>
    #include<stdio.h> 
    main()
 {               
     float pc,pv,mpc,mpv;
     int c=0;
     for(c=0;c<11;c++)
      {        
      printf("Digite o preco de custo =\n\n");
      scanf("%f",&pc);
      mpc+=pc;
      printf("Digite o preco de venda=\n\n");
      scanf("%f",&pv);
      mpv+=pv;
      if(pc==pv)
      printf("Houve Empate.\n");
      else
      if(pv<pc)
      printf("Houve Prejuizo.\n");
      else
      printf("Houve Lucro.\n");
      }
      printf("Media de preco de custo =%.2f\n",mpc/10);
      printf("Media de preco de venda= %.2f\n",mpv/10);  
  system("pause");
}
