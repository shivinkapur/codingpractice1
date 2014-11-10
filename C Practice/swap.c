#include<stdio.h>

 void swap(int *i,int *j) {
  int temp;
  temp = *i;
  *i = *j;
  *j = temp;
  // return;
}

int main() {
  int a=20,b=10;
  swap(&a,&b);
  printf ("a = %d and b = %d ", a, b);
}
