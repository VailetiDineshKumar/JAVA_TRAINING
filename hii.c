#include <stdio.h>

int main() {
    char *str = "Hello world";
    int i;

    printf("Result after XOR with 0:\n");

    for (i = 0; str[i] != '\0'; i++) {
        char result = str[i] ^ 0;
        printf("%c", result);
    }

    return 0;
}