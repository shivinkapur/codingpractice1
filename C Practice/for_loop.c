#include<stdio.h>

int main( ) {
	int i;
	for ( i = 1 ; i <= 10 ; ) {
		printf ( "%d\n", i ) ;
		i=i+1; 
	}
	return 0;
}
// make abc
// ./abc

// Way number 2
// gcc abc.c -o main.out  
// ./main.out