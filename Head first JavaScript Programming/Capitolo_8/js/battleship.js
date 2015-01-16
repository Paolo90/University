function init(){
	var button=document.getElementById("firebutton");
	button.onclick=handleFireButton;
	var key=document.getElementById("guessInput");
	key.onkeypress = handleKeyButton; // aziona la funzione quando UN QUALSIASI TASTO viene premuto
	//button.setAttribute("onclick", "handleFireButton"); con questo non funziona
	Model.generateShipLocations(); //appena carico la pagina le barche vengono posizionate
}
window.onload=init;
console.log("function loaded");
function handleKeyButton(e){ //e rappresenta il tasto premuto
	var fireButton = document.getElementById("firebutton");
	if (e.keyCode === 13){
		fireButton.click(); //è come se cliccassi il pulsante => aziono handleFireButton()
		return false; //serve per impedire che il form non compia azioni strane come sottomettere sè stesso
	}
}
function handleFireButton(){
	var input=document.getElementById("guessInput");
	Controller.processGuess(input.value);
	input.value="";
}
var View={
	displayMessage:function(msg){
		document.getElementById("messageArea").innerHTML=msg;
	},
	displayHit:function(location){
		document.getElementById(location).setAttribute("class", "hit");
	},
	displayMiss:function(location){
		document.getElementById(location).setAttribute("class", "miss");
	}	
};
var Model={
	boardsize:7,
	shipLength:3,
	numShips:3,
	shipsSunk:0,
	ships:[
	{locations: [0, 0, 0], hits: ["", "", ""]},
	{locations: [0, 0, 0], hits: ["", "", ""]},
	{locations: [0, 0, 0], hits: ["", "", ""]}
	], /*E' più comodo lavorare con un array che con tre diverse variabili--oggetto che descrivono le navi*/
	fire:function(guess){
		for (var i = 0; i < this.numShips; i++) {
			var index = this.ships[i].locations.indexOf(guess); /*Se esiste, restituise il primo (e unico) indice in cui compare guess, altrimenti restituisce -1*/
			if (index >= 0){
				this.ships[i].hits[index] = "hit";
				View.displayMessage("HIT");
				View.displayHit(guess);
				if(this.isSunk(this.ships[i])){
					this.shipsSunk++;
					View.displayMessage("You sank my ship!");
				}
				return true;
			}
		}
		View.displayMessage("MISS");
		View.displayMiss(guess);
		return false;
	},
	isSunk:function(ship){
		var i=0;
		var isSunk=true;
		while(i<ship.hits.length && isSunk===true){
			if(ship.hits[i]!=="hit"){
				isSunk=false;
			}
			i++;
		}
		return isSunk;
	},
	generateShipLocations:function(){
		var randomLocation;
		for(var i=0;i<this.numShips;i++){
			randomLocation=this.generateShip(); //restituisce un array
			while(this.collision(randomLocation)){ // finché c'è sovrapposizione, cambia la posizione
				randomLocation=this.generateShip();
			}//qui potevo usare anche un do--while
			this.ships[i].locations=randomLocation;
		}
	},
	generateShip:function(){
		var direction=Math.floor(Math.random()*2);
		var row, col;
		var newShipLocations=[]; //array che contiene la posizione della barca
		if(direction===1){
			//orientamento orizzontale
			row=Math.floor(Math.random()*this.boardsize);
			col=Math.floor(Math.random()*(this.boardsize-this.shipLength));
		}else{
			//orientamento verticale
			col=Math.floor(Math.random()*this.boardsize);
			row=Math.floor(Math.random()*(this.boardsize-this.shipLength));
		}
		for(var i=0;i<this.shipLength;i++){
			//qui vengono generate le posizioni tenendo conto dell'orientamento
			if(direction===1){
				newShipLocations.push(row + "" + (col + i));//il metodo push aggiunge valori a una strutturadati
				/*Potevo scrivere newShipLocations[i]=row+""+(col+i);*/
			}else{
				newShipLocations.push((row+i) + "" + col);
			}
		}
		return newShipLocations;
	},
	
	collision:function(locations){
		for(var i=0;i<this.ships.length;i++){ //così controllo solo quelli effettivamente inseriti
			//fisso l'entrata del vettore ships
			var ship = this.ships[i];
			for (var j = 0; j < locations.length; j++) {
				//fisso l'entrata del vettore locations
				if (ship.locations.indexOf(locations[j]) >= 0){
					return true; //there is a collision
				}
			}
		}
		//A questo punto ho controllato tutte le navi e non ho trovato sovrapposizioni
		return false; //there is no collision
	}
};
var Controller={
	guesses:0,
	processGuess:function(guess){
		var location=this.parseGuess(guess);
		console.log(location);
		if(location!==null){
			console.log("location ok");
			var hit=Model.fire(location); //the method returns a boolean
			console.log(hit);
			this.guesses++;
			console.log(this.guesses);
			if(hit){
				if(Model.shipsSunk===Model.numShips){
					View.displayMessage("You sank all my battleships in "+this.guesses+" guesses.");
					document.getElementById("guessInput").disabled="disabled";
					document.getElementById("guessInput").placeholder="Game Over.";
					alert("Game Over. Refresh the page to play again");
				}
			}
		}
	},
	parseGuess:function(guess){
		var alphabet=["A", "B", "C", "D", "E", "F", "G"];
		if(guess === null || guess.length !== 2){
			alert("Correct usage Example: A0");
		}else{
			var firstChar=guess.charAt(0);
			var row=alphabet.indexOf(firstChar); /*Se la lettera non è nel vettore restituisce -1*/
			if(row!==-1 && (isNaN(row)==false)){
				var secondChar=guess.charAt(1);
				if(isNaN(secondChar)==false){
					if(secondChar < Model.boardsize && secondChar>=0){ //qui uso boardsize per svincolarmi dalle dimensioni
						return row+""+secondChar;
					}else{
						alert("Index out of borders");
					}
				}else{
					console.log("Wrong Immission 2");
				}
			}else{
				console.log("Wrong Immission 1");
			}
		}
		return null; // se arriviamo qui, almeno un controllo è fallito
	}
};
/*Controller.processGuess("A0");
Controller.processGuess("A6");
Controller.processGuess("B6");
Controller.processGuess("C6");
Controller.processGuess("C4");
Controller.processGuess("D4");
Controller.processGuess("E4");
Controller.processGuess("B0");
Controller.processGuess("B1");
Controller.processGuess("B2");*/
