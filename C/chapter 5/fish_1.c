struct fish{
	const char *name;
	const char *species;
	int teeth;
	int age;
};
void catalog(struct fish f){
	printf("%s is a %s with %i teeth. He's %i\n",f.name, f.species, f.teeth, f.age);
}
void label(struct fish f){
	printf("Name:%s\nSpecies:%s\nTeeth:%i\nAge:%i\n",f.name, f.species, f.teeth, f.age);
}
int main(){
	struct fish snappy = {"Snappy", "Piranha", 69, 4};
	catalog(snappy);
	label(snappy);
	return 0;
}
