/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
  Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* Esistono 5 tipologie di datatype e sono le seguenti:
stringa: contiene un testo e deve essere all'interno di virgolette '' o "" ;
numero: contiene un numero e NON deve essere all'interno di virgolette ;
booleano: definisce se il valore è vero(true) o falso(false)
array: è una lista di dati, all'interno della parentesi graffa, separati da virgole. es= [1,2,3,4,5]
oggetti: contiene all'interno delle parentesi quadre una combinazione chiave/valore. es= {nome: 'valore'}
*/

/* ESERCIZIO 2
  Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

const myName = 'Federico'

/* ESERCIZIO 3
  Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let a = 12
let b = 20
console.log(a+b);

/* ESERCIZIO 4
  Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x = 12

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* myName = 'Pecoraro' */


/* ESERCIZIO 6
  Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

console.log(x - 4);

/* ESERCIZIO 7
  Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
  Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
  EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1 = 'john'
let name2 = 'John'
console.log(name1 !== name2);
//OPPURE
console.log(name1 == name2);

/* EXTRA */
if (name1.toLowerCase() === name2.toLowerCase()) {
    console.log("true");
} else {
    console.log("false");
}