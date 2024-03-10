const indirizzo = new URLSearchParams(location.search)
const id = indirizzo.get('id')

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
    headers: {
        Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
    },
    })
.then(response => response.json())
.then(dati => {
    console.log(dati);
    let img = document.querySelector('.img')
    let name = document.querySelector('.h5')
    let brand = document.querySelector('.brand')
    let price = document.querySelector('.price')
    let description = document.querySelector('.description')

    img.src = dati.imageUrl
    name.innerText = dati.name
    brand.innerText = dati.brand
    price.innerText = dati.price
    description.innerText = dati.description

    })