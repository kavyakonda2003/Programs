#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    char s[1001],i;
  int f,j;
  scanf("%s",s);
  for(i=48;i<58;i++)
  {   f=0;
      for(j=0;j<strlen(s);j++)
      {
          if(s[j]==i)
          {
              f++;
          }
      }
      printf("%d ",f);
  }   
    return 0;
}
c
