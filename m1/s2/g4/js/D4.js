/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/
function area(a,b) {
    return a * b;
}
console.log(area(11,12));

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/
function crazySum(a,b) {
    if (a === b) {
        return ((a + b)* 3);
    } else {
        return a + b;
    }
}
console.log(crazySum(5,5));

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/*function crazyDiff(a,b) {
    if (a / b > 19) {
        return ((a / b)* 3);
    } else {
        return a / b
    }
}
console.log(crazyDiff(200,2));*/

function crazyDiff(a,b) {
    if (b > 19) {
        return ((a / b)* 3);
    } else {
        return a / b
    }
}
console.log(crazyDiff(19,20));

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/
function boundary(a) {
    if (a === 400) {
        return (true)
    } else if (a > 20 & a < 100) {
        return (true)
    } else {
        return (false)
    }
}
console.log(boundary (300));

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/
function epify(a,b) {
    if (b == 'EPICODE') {
        return (a)
    } else {
        return (a + b)
    }
}
console.log(epify('EPICODE ','EPICODE'));

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/
function check3and7(a) {
    if (a % 3 === 0||a % 7 === 0) {
        return (a)
    } else {
        return (false)
    }
}
console.log(check3and7(14));

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/
let reverseString = (a) => {
    return (a.split('').reverse().join(''))
}
console.log(reverseString('EPICODE'));

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/
let upperFirst = (a) => {
    return (a.split(' '))
}
console.log(upperFirst('ciao mi chiamo federico'));

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/
let cutString = (a) => {
    return (a.slice(1, -1))
}
console.log(upperFirst('federico'));

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
