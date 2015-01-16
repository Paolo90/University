typedef union {
	float lemon;
	int lime_pieces;
} lemon_lime;
typedef struct {
	float tequila;
	float cointreau;
	lemon_lime citrus;
} margarita;
int main(){
	int drink_recipe;
	int condition=1;
	margarita m= {2.0, 1.0,{2}};
	margarita n= {2.0, 1.0, {0.5}};  /* Aggiorno il primo campo dello union. Non c'è bisogno di specificare .lime.pieces anche se è ok*/
	margarita q = {2.0, 1.0, {.lime_pieces=1}};
	while (condition){
		puts("Enter the number of a recipe: ");
		scanf("%i",&drink_recipe);
		switch(drink_recipe){
		case(1):
			printf("%2.1f measures of tequila\n%2.1f measures of cointreau\n%2.1f measures of juice\n", m.tequila, m.cointreau, m.citrus.lemon);
			break;
		case(2):
			printf("%2.1f measures of tequila\n%2.1f measures of cointreau\n%2.1f measures of juice\n", n.tequila, n.cointreau, n.citrus.lemon);
			break;
		case(3):
			printf("%2.1f measures of tequila\n%2.1f measures of cointreau\n%i pieces of lime\n", q.tequila, q.cointreau, q.citrus.lime_pieces);
			break;
		default:
			printf("Error\n");
			condition=0;
			break;
		}
	}
	return 0;
}
