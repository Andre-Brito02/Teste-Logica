#include <stdio.h>
#include <string.h>

int main(){
    char palavra[50];

    scanf("%s", palavra);

    for(int i = 0; i < strlen(palavra); i++){
        printf("%c", palavra[strlen(palavra) - 1 - i]);
    }
    
    printf("\n");

    return 0;
}