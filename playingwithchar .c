#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char ch,s[100],sen[122];
    scanf("%c\n%s\n%[^\n]",&ch,&s,&sen);
    printf("%c\n%s\n%s",ch,s,sen);    
    return 0;
}
