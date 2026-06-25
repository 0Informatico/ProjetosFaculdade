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


void le(int **a){
	int i,j;
	for(i=0;i<Lin;i++){
		printf("\n");
		for(j=0;j<Col;j++){
			printf("%d\t",a[i][j]);}
		}
}

int magl(int **a){
	int r=0;
	int i,j;
	for (i=0;i<Col;i++){
		for (j=0;j<Lin;j++){
			r=r+a[i][j];
		}
		if(r!=15){
			return 1;
		}else{
			r=0;
		}
	}
	return r;
}
int magc(int **a){
	int r=0;
	int i,j;
	for (i=0;i<Lin;i++){
		for (j=0;j<Col;j++){
			r=r+a[j][i];
		}
		if(r!=15){
			return 1;
		}else{
			r=0;
		}
	}
	return r;
}
int mag(int **a){
	if(magc(a)+magl(a) == 0 && a[0][0]+a[1][1]+a[2][2]==15 && a[0][2]+a[1][1]+a[2][0]==15){
		return 0;
	}else{
		return 1;
	}
}

int main(){
	int **mat1;
	
	mat1=aloca();
	
	set(mat1);
	if(mag(mat1)==0){
		printf("\nE quadrado magico");
	}else{
		printf("\nNao e quadrado magico");
	}
	

	
	return 0;
}

