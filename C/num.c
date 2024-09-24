    #include<stdio.h>
    #include<stdlib.h>
    #define NOME_ARQ "arqX.txt";
    
    void escreverArq(){
    
    FILE* arq;
    arq = fopen("NOME_ARQ","a");
    int i, num, v[99];
    
    if( arq== NULL){
    printf("ERRO AO CRIAR ARQUIVO!");
    return;
    }
    
    if(get_size("NOME_ARQ") == 0){
    for(i=0;i<100;i++)
    v[i]=0;
    }
    else{
    for(i=0;i<100;i++)
    while(fscanf(arq,"%d", &v[i])==EOF);
    }
    
    
    
    do{
    
    printf("Digite um numero: ");
    scanf("%d",&num);
    
    if(num>0||num>99)
     continue;
    
    for(i=0;i<100;i++){
    
    if(num==i){
    v[i]++;
    }
    
    }
    
    }while(num!=0);
    
    
    for(i=0;i<100;i++){
    fprintf(arq,"%d ",v[i]);
    }
    fclose(arq);
    }
    
    
    
    
   int main(){
           
    escreverArq();       
    system("pause");       
           }
