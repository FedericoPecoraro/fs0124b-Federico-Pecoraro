interface Smartphone {
    credito: number
    numeroChiamate: number
}

class User implements Smartphone {
    name: string
    lastName: string
    credito: number = 0
    numeroChiamate: number = 0

    constructor(name: string, lastName: string) {
        this.name = name
        this.lastName = lastName
    }
    ricarica(ammontare: number): void {
        this.credito += ammontare
    }
    chiamata(minutiDurata: number): void {
        this.credito -= (minutiDurata * 0.20)
        this.numeroChiamate+= 1
    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }
    get chiamata404() {
        return this.credito
    }
    get getNumeroChiamate() {
        return this.numeroChiamate
    }    
}

const me = new User("Fred", "Pecoraro")
me.ricarica(10)
console.log(me.chiamata404)
console.log(me.getNumeroChiamate)
me.azzeraChiamate()