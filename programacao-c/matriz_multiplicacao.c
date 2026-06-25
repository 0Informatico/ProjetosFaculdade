#include <stdlib.h>
#define Col 3
#define Lin 3

int aloca(){
	int **a;
	int i;
	a= malloc(Lin * sizeof(int*));
	for(i = 0;i<Col;i++){
		a[i]=malloc(Lin * sizeof(int));
	}
	return a;
}

void set(int **a){
	int i,j,n;
	for(i=0;i<Lin;i++){
		for(j=0;j<Col;j++){
			printf("digite o espaco(%d,%d): ",i+1,j+1);
			scanf("%d", &n);
			a[i][j]=n;
		}
	}
}

void multi(int **a,int **b, int **c){
	int i,j,k,r=0;
	for (i=0;i<Lin;i++){
		for (j=0;j<Col;j++){
			for (k=0;k<Col;k++){
				r=r+(a[i][k])*(b[k][j]);
			}
			c[i][j]=r;
			r=0;
		}
	}
}

void le(int **a){
	int i,j;
	for(i=0;i<Lin;i++){
		printf("\n");
		for(j=0;j<Col;j++){
			printf("%d\t",a[i][j]);}
		}
}

int main(){
	int **mat1;
	int **mat2;
	int **resul;
	
	mat1=aloca();
	mat2=aloca();
	resul=aloca();
	
	printf("Da primeira matriz ");
	set(mat1);
	printf("\nDa segunda matriz ");
	set(mat2);
	
	multi(mat1,mat2,resul);
	
	printf("\nA matriz resultado: ");
	le(resul);
	
	return 0;
}

