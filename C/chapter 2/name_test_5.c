#include <stdio.h>
int main()
{
	char first_name[20];
	char last_name[20];
	puts("Enter first and last name: ");
	scanf("%19s %19s",first_name,last_name);
	printf("First: %s Last:%s\n",first_name, last_name); /*ci posso mettere anche %19s su tutti e due i campi*/
	return 0;
}
