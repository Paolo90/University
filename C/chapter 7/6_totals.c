enum drink {
MUDSLIDE, FUZZY_NAVEL, MONKEY_GLAND, ZOMBIE
};
double price(enum drink d){
	switch(d) {
	case MUDSLIDE:
		puts("6.79");
	case FUZZY_NAVEL:
		puts("5.31");
	case MONKEY_GLAND:
		puts("4.82");
	case ZOMBIE:
		puts("5.89");
	}
}
int main(){
	price(ZOMBIE);
	return 0;
}
