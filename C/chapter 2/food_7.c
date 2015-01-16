#include <stdio.h>
int main(){
	char food[5];
	puts("Enter your favourite type of food: ");
	fgets(food,sizeof(food),stdin);
	printf("Favourite food: %s\n",food);
	return 0;
}
