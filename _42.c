#include<stdio.h>
#include<stdlib.h>

#define _42(parameters) 42

int main(int argc, char* argv[]) {
    printf("%d\n", _42("123"));
    return 0;
}

