fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "GET",
    headers: {
        "Content-Type": "application/json",
        Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
    },
    })
.then(response => response.json())
.then(dati => {
    console.log(dati);

    for (let product of dati) {

        let card = document.createElement('div')
        card.classList.add('col')

        let div = document.createElement('div')
        div.classList.add('card')
        let img = document.createElement('img')
        img.classList.add('card-img-top')
        let body = document.createElement('div')
        body.classList.add('card-body')
        let title = document.createElement('h5')
        title.classList.add('card-title')
        let name = document.createElement('p')
        name.classList.add('card-text')
        let brand = document.createElement('p')
        brand.classList.add('card-text')
        let price = document.createElement('p')
        price.classList.add('card-text')
        let description = document.createElement('p')
        description.classList.add('card-text')
        let detailsBtn = document.createElement('a')
        detailsBtn.classList.add('btn', 'btn-primary')
        let editBtn = document.createElement('a')
        editBtn.classList.add('btn', 'btn-warning', 'ms-2')

        name.innerText = product.name
        brand.innerText = product.brand
        price.innerText = product.price
        img.src = product.imageUrl
        description.innerText = product.description
        detailsBtn.innerText = 'Mostra Dettagli'
        detailsBtn.href = `details.html?id=${product._id}`
        editBtn.innerText = 'Modifica'
        editBtn.href = `edit.html?id=${product._id}`

        body.append(name, brand, price, description, detailsBtn, editBtn)
        div.append(img, body)
        card.append(div)

        document.querySelector('.row').append(card)
    }
})