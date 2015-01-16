int NUM_ADS = 7;
char *ADS[] = {
	"William: SBM GSOH likes sports, TV, dining",
	"Matt: SWM NS likes art, movies, theater",
	"Luis: SLM ND likes books, theater, art",
	"Mike: DWM DS likes trucks, sports and bieber",
	"Peter: SAM likes chess, working out and art",
	"Josh: SJM likes sports, movies and theater",
	"Jed: DBM likes theater, books and dining"
};
void find(char *string1, char *string2){
	int i;
	puts("Search results:");
	puts("------------------------------------");
	for(i=0;i<NUM_ADS;i++){
		if((strstr(ADS[i],string1))&&(!strstr(ADS[i],string2))){
			printf("%s\n", ADS[i]);
		}
	}
	puts("------------------------------------");
}
int main(){
	char *string1="dining";
	char *string2="sports";
	find(string1, string2);
	return 0;
}
