#include <stdio.h>
#include <stdlib.h>

// Crie uma estrutura representando os alunos de um determinado curso. 
//A estrutura deve conter a matrícula do aluno, nome, nota da primeira prova, 
//nota da segunda prova e nota da terceira prova, ao final exibir a média geral.

struct aluno {
	char nome[20];
	int matricula;
	float nota1, nota2, nota3;
	float medaluno;
	
};
void fun_aluno(){
	FILE*arquivo;
	arquivo = fopen("ficha_de_aluno.txt", "a");
	int i;
	struct aluno a[2];
	float meg;
	for(i=0; i<2; i++){
	 	fflush(stdin);
	    
		printf("Informe o nome do aluno: ");
		gets (a[i].nome);
		printf("Informe o numero da matricula:  ");
		scanf("%d", &a[i].matricula);
		printf("Digite a primeira nota: ");
		scanf("%f", &a[i].nota1);
		printf("Digite a segunda nota: ");
		scanf("%f", &a[i].nota2);
		printf("Digite a terceira nota: ");
		scanf("%f", &a[i].nota3);
		printf("\n\n");
		a[i].medaluno=(a[i].nota1+a[i].nota2+a[i].nota3)/3;
		meg+=a[i].medaluno/2;
			if(arquivo == NULL){
				printf("Erro ao criar o arquivo \n");
				return;
			}
			fprintf(arquivo, "%s %d %2.f %2.f %2.f \n", a[i].nome, a[i].matricula, a[i].nota1, a[i].nota2, a[i].nota3);
			
	}
			fclose(arquivo);
	printf("Media Geral: %2.f \n",meg);
	
	}


