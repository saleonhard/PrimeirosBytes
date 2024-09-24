    #include<stdio.h>
    #include<stdlib.h>
    #include<conio.h>
    main()
    {
      int i,j,op,op2,jd=0,pj;
      char j1,j2;
      float co;
      char v[3][3];
      char nome1[30];
      char nome2[30];
      const float p1=1.1; const float p2=1.2; const float p3=1.3; const float p4=2.1; const float p5=2.2; const float p6=2.3; const float p7=3.1; const float p8=3.2; const float p9=3.3;
    
    
    for(i=0;i<3;i++)
    {for(j=0;j<3;j++)
      v[i][j]=' ';}
    printf("1\247(\246) jogador(a) digite seu nome:");
    gets(nome1);
    printf("2\247(\246) jogador(a) digite seu nome:");
    gets(nome2);
    system("cls");
    
    puts("COFIGURACOES");
    
    while(1)
    {
    printf("X ou O?\n1-%s(x) e %s(o)\n2-%s(o) e %s(x)\n3-Velha escolhe\n",nome1,nome2,nome1,nome2);
    
    scanf("%d",&op);
    switch(op){
    
    case 1:
     {j1='x'; j2='o';break;}
    case 2:
    {j1='o'; j2='x';break;}
    case 3:
      if((rand()%2)==0)
       {j1='x'; j2='o';}
    else
    {j1='o'; j2='x';
    break;
    default:
    {
    printf("Opcao Invalida\n Pressione \" ENTER\" para tentar novamente");
    getchar();
    continue;}
    }break;}
    
    system("cls");
    puts("COFIGURACOES");
    while(1){
    printf("Quem vai jogar primeiro?\n1-%s(%c)\n2-%s(%c)\n3-Velha escolhe\n",nome1,j1,nome2,j2);
    scanf("%d",&op2);
    switch(op2){
    case 1:
    {pj=1;break;}
    case 2:
    {pj=2;break;}
    case 3:
    {if((rand()%2)==1)
      {pj=1;break;}
    else
    {pj=2;break;}}
    default:
    {
    printf("Opcao Invalida\n Pressione \" ENTER\" para tentar novamente");
    getchar();
    continue;}}
    break;
    }
    
    
     while(1){
    
    
     if(v[0][0]==j1&&v[0][1]==j1&&v[0][2]==j1){
    v[0][0]=(j1=='x')?'X':'O';
    v[0][1]=(j1=='x')?'X':'O';
    v[0][2]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[1][0]==j1&&v[1][1]==j1&&v[1][2]==j1)
    {
    v[1][0]=(j1=='x')?'X':'O';
    v[1][1]=(j1=='x')?'X':'O';
    v[1][2]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[2][0]==j1&&v[2][1]==j1&&v[2][2]==j1)
    {
    v[2][0]=(j1=='x')?'X':'O';
    v[2][1]=(j1=='x')?'X':'O';
    v[2][2]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[0][0]==j1&&v[1][0]==j1&&v[2][0]==j1)
    {
    v[0][0]=(j1=='x')?'X':'O';
    v[1][0]=(j1=='x')?'X':'O';
    v[2][0]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[0][1]==j1&&v[1][1]==j1&&v[2][1]==j1)
    {
    v[0][1]=(j1=='x')?'X':'O';
    v[1][1]=(j1=='x')?'X':'O';
    v[2][1]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[0][2]==j1&&v[1][2]==j1&&v[2][2]==j1)
    {
    v[0][2]=(j1=='x')?'X':'O';
    v[1][2]=(j1=='x')?'X':'O';
    v[2][2]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
    if
     (v[0][0]==j1&&v[1][1]==j1&&v[2][2]==j1)
    {
    v[0][0]=(j1=='x')?'X':'O';
    v[1][1]=(j1=='x')?'X':'O';
    v[2][2]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    else
   if
    (v[0][2]==j1&&v[1][1]==j1&&v[2][0]==j1)
     {
    v[0][2]=(j1=='x')?'X':'O';
    v[1][1]=(j1=='x')?'X':'O';
    v[2][0]=(j1=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome1,j1); break;}
    
    
    
    
    if((v[0][0]==j2&&v[0][1]==j2&&v[0][2]==j2))
    {
    v[0][0]=(j2=='x')?'X':'O';
    v[0][1]=(j2=='x')?'X':'O';
    v[0][2]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[1][0]==j2&&v[1][1]==j2&&v[1][2]==j2)
    {
    v[1][0]=(j2=='x')?'X':'O';
    v[1][1]=(j2=='x')?'X':'O';
    v[1][2]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[2][0]==j2&&v[2][1]==j2&&v[2][2]==j2)
    {
    v[2][0]=(j2=='x')?'X':'O';
    v[2][1]=(j2=='x')?'X':'O';
    v[2][2]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[0][0]==j2&&v[1][0]==j2&&v[2][0]==j2)
    {
    v[0][0]=(j2=='x')?'X':'O';
    v[1][0]=(j2=='x')?'X':'O';
    v[2][0]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[0][1]==j2&&v[1][1]==j2&&v[2][1]==j2)
    {
    v[0][1]=(j2=='x')?'X':'O';
    v[1][1]=(j2=='x')?'X':'O';
    v[2][1]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[0][2]==j2&&v[1][2]==j2&&v[2][2]==j2)
    {
    v[0][2]=(j2=='x')?'X':'O';
    v[1][2]=(j2=='x')?'X':'O';
    v[2][2]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    else
    if
    (v[0][0]==j2&&v[1][1]==j2&&v[2][2]==j2)
    {
    v[0][0]=(j2=='x')?'X':'O';
    v[1][1]=(j2=='x')?'X':'O';
    v[2][2]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++)
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');
    else
    (v[0][2]==j2&&v[1][1]==j2&&v[2][0]==j2)
    {
    v[0][2]=(j2=='x')?'X':'O';
    v[1][1]=(j2=='x')?'X':'O';
    v[2][0]=(j2=='x')?'X':'O';
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    printf("\a %s(%c) voce ganhou!!!\n",nome2,j2); break;}
    
    
    
    
    if(jd==9)
    {printf("\a Empate Tecnico\n"); break;}
    
    system("cls");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
    printf("%c %c",v[i][j],j==3-1?' ':'\xB3');
    if(i!=3-1)
    printf("\n________"); putchar('\n');}
    
    
    
    
    
    
    
     if(pj==1){
     while(1){
    printf("%s(%c), digite suas coordenadas:",nome1,j1);printf("( ");
    scanf("%f",&co);
    printf(" )");
    if((co==p1)||(co==p2)||(co==p3)||(co==p4)||
    (co==p5)||(co==p6)||
    (co==p7)||
    (co==p8)||(co==p9))
    {if((co==p1)&&v[0][0]==' ')
    {v[0][0]=j1;
    pj=2;jd++;break;}
    else
    if((co==p2)&&v[0][1]==' ')
    {v[0][1]=j1;
    pj=2;jd++;break;
    }else
    if((co==p3)&&v[0][2]==' ')
    {v[0][2]=j1;
    pj=2;jd++;break;}
    else
    if((co==p4)&&v[1][0]==' ')
    {v[1][0]=j1;
    pj=2;jd++;break;}
    else
    if((co==p5)&&v[1][1]==' ')
    {v[1][1]=j1;
    pj=2;jd++;break;}
    else
    if((co==p6)&&v[1][2]==' ')
    {v[1][2]=j1;
    pj=2;jd++;break;}
    else
    if((co==p7)&&v[2][0]==' ')
    {v[2][0]=j1;
    pj=2;jd++;break;}
    else
    if((co==p8)&&v[2][1]==' ')
    {v[2][1]=j1;
    pj=2;jd++;break;}
    else
    if((co==p9)&&v[2][2]==' ')
    {v[2][2]=j1;
    pj=2;jd++;break;}
    else{system("cls");
     printf("%s, voce digitou coodernadas que ja foram ultilizadas,tente novamente.\n",nome1);
    getchar();
    continue;}}
    else
    {system("cls");
    printf("%s, voce digitou coordenadas invalidas,tente novamente.\n",nome1);
    getchar();
    continue;}}
    }
    else
    while(1){
     {
    printf("%s(%c), digite suas coordenadas:",nome2,j2);
    printf("( ");
    scanf("%f",&co);
    printf(" )");
    if((co==p1)||(co==p2)||(co==p3)||(co==p4)||
    (co==p5)||(co==p6)||
    (co==p7)||
    (co==p8)||(co==p9))
    {if((co==p1)&&v[0][0]==' ')
    {v[0][0]=j2;
    pj=1;jd++;break;}
    else
    if((co==p2)&&v[0][1]==' ')
    {v[0][1]=j2;
    pj=1;jd++;break;
    }else
    if((co==p3)&&v[0][2]==' ')
    {v[0][2]=j2;
    pj=1;jd++;break;}
    else
    if((co==p4)&&v[1][0]==' ')
    {v[1][0]=j2;
    pj=1;jd++;break;}
    else
    if((co==p5)&&v[1][1]==' ')
    {v[1][1]=j2;
    pj=1;jd++;break;}
    else
    if((co==p6)&&v[1][2]==' ')
    {v[1][2]=j2;
    pj=1;jd++;break;}
    else
    if((co==p7)&&v[2][0]==' ')
    {v[2][0]=j2;
    pj=1;jd++;break;}
    else
    if((co==p8)&&v[2][1]==' ')
    {v[2][1]=j2;
    pj=1;jd++;break;}
    else
    if((co==p9)&&v[2][2]==' ')
    {v[2][2]=j2;
    pj=1;jd++;break;}
    else{system("cls");
     printf("%s, voce digitou coodernadas que ja foram ultilizadas,tente novamente.\n",nome1);
    getchar();
    continue;}}
    
    else
    {system("cls");
    printf("%s, voce digitou coordenadas invalidas,tente novamente.\n",nome1);
    getchar();
    continue;}}
    }
    system("pause");
    }
    }
    }
    }
    }
