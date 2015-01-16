/*Progetto Arduino Programmazione I con laboratorio. Paolo Piersanti Laurea Magistrale Matematica*/

int valore_letto;
void setup()
{
/*This is called when the program starts. It
basically sets up the board. Put any initialization
code here.*/
	Serial.begin(9600);
	pinMode(3, OUTPUT);
	pinMode(0, INPUT);
	puts("Welcome");
}
void loop()
{
/*This is where your main code goes. This function
loops over and over, and allows you to respond to
input from your sensors. It only stops running when
the board is switched off*/
	valore_letto=analogRead(0);
	if ((valore_letto<500)||(valore_letto==500)){
		digitalWrite(3, HIGH); /*Accende il led*/
		Serial.println("Feed Me!");
	}else{
		digitalWrite(3,LOW); /*Spegne il led*/
		Serial.println("Thank You Seymour!");
	}
	delay(5000); /*Il programma dorme 5 secondi*/
}
