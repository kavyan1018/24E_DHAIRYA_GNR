// types of variables in c programming in File/intro.c:

// fopen(); // file open
// fclose(); // file close
// fprintf(); // file print
// fscanf(); // file scan
// fputc(); // file put character
// fgetc(); // file get character

// What is a file?
// A file is a collection of data stored in a disk with a specific name and a directory path. It is used to store data permanently in a non-volatile memory (e.g. hard disk).

// Types of files in C programming
// There are two types of files in C programming:

// Text files : by default text files 
// Binary files it will convert code to binary code

// File operations in C
// There are four basic operations that can be performed on files in C programming:
// Opening a file
// Closing a file
// Reading from a file
// Writing to a file


// Opening a file
// To open a file, you need to use the fopen() function, which is defined in stdio.h header file.

// Example :

// #include <stdio.h>
// #include <conio.h>

// int main()
// {
//     FILE *ptr;
//     ptr = fopen("sample.txt", "w");
//     fclose(ptr);
//     printf("File is created\n");

//     return 0;
// }


// Closing a file
// To close a file, you need to use the fclose() function, which is defined in stdio.h header file.

// Example :

// #include <stdio.h>
// #include <conio.h>

// int main()
// {
//     FILE *ptr;
//     ptr = fopen("sample2.txt", "w");
//     fclose(ptr);
//     printf("File is created\n");

//     return 0;
// }


// Reading from a file
// To read from a file, you need to use the fscanf() function, which is defined in stdio.h header file.

// Example :

// #include <stdio.h>

// int main()
// {
//     FILE *ptr;
//     ptr = fopen("sample2.txt", "r");

//     if (ptr == NULL) {
//         printf("Error! Could not open file.\n");
//         return 1;
//     }

//     char c = fgetc(ptr);

//     printf("The character I read was %s\n", c);

//     fclose(ptr);

//     return 0;
// }


// Writing to a file
// To write to a file, you need to use the fprintf() function, which is defined in stdio.h header file.

// Example :

// #include <stdio.h>

// int main()
// {
//     FILE *ptr;
//     ptr = fopen("sample2.txt", "w");

//     if (ptr == NULL)
//     {
//         printf("Error! Could not open file.\n");
//         return 1;
//     }

//     fprintf(ptr, "Hii Naitra From tomorrow we will start our CSS\n");

//     fclose(ptr);

//     return 0;
// }
