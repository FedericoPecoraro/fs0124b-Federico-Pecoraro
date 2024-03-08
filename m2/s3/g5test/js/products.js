fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "GET",
    headers: {
        "Content-Type": "application/json",
        Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
    },
    body: JSON.stringify(product),
    })
.then(response => response.json())
.then(dati => {

    for (let product of dati) {

        let div = document.createElement('div')
        div.classList.add('card')
        let img = document.createElement('img')
        img.classList.add('card-img-top')
        let body = document.createElement('div')
        body.classList.add('card-body')
        let title = document.createElement('h5')
        title.classList.add('card-title')
        let name = document.createElement('p')
        price.classList.add('card-text')
        let brand = document.createElement('p')
        price.classList.add('card-text')
        let price = document.createElement('p')
        price.classList.add('card-text')
        let description = document.createElement('p')
        price.classList.add('card-text')
        let detailsBtn = document.createElement('a')
        button.classList.add('btn', 'btn-primary')
        let editBtn = document.createElement('a')
        button.classList.add('btn', 'btn-warning')
        let deleteBtn = document.createElement('a')
        button.classList.add('btn', 'btn-danger')

        
        name.innerText = product.name
        brand.innerText = product.brand
        price.innerText = product.price
        img.src = product.img
        description.innerText = product.description
        detailsBtn.innerText = 'Mostra Dettagli'
        editBtn.innerText = 'Modifica'
        deleteBtn.innerText = 'Elimina'

        deleteBtn.addEventListener("click", function () {
            document.querySelector('.row').removeChild(div)
        })

        body.append(name, brand, price, description, detailsBtn, editBtn, deleteBtn)
        div.append(img, body)

        document.querySelector('.row').append(div)
    }
})