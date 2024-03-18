"use strict";
class User {
    constructor(name, lastName) {
        this.credito = 0;
        this.numeroChiamate = 0;
        this.name = name;
        this.lastName = lastName;
    }
    ricarica(ammontare) {
        this.credito += ammontare;
    }
    chiamata(minutiDurata) {
        this.credito -= (minutiDurata * 0.20);
        this.numeroChiamate += 1;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
    get chiamata404() {
        return this.credito;
    }
    get getNumeroChiamate() {
        return this.numeroChiamate;
    }
}
const me = new User("Fred", "Pecoraro");
me.ricarica(10);
console.log(me.chiamata404);
console.log(me.getNumeroChiamate);
me.azzeraChiamate();
