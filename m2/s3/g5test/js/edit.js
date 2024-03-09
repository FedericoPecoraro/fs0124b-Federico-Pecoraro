
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
    let name = document.querySelector('#name')
    let brand = document.querySelector('#brand')
    let price = document.querySelector('#price')
    let img = document.querySelector('#img')
    let description = document.querySelector('#description')

    name.value = dati.name
    brand.value = dati.brand
    price.value = dati.price
    img.value = dati.imageUrl
    description.value = dati.description
    })

let saveBtn = document.querySelector('.btn-success')
saveBtn.addEventListener('click', function (e) {
    e.preventDefault()

    let name = document.querySelector("#name").value;
    let brand = document.querySelector("#brand").value;
    let price = document.querySelector("#price").value;
    let imageUrl = document.querySelector("#img").value;
    let description = document.querySelector("#description").value;

    const product = { name, brand, price, imageUrl, description };

    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
        method: 'PUT',
    headers: {
        "Content-Type": "application/json",
        Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
    },
    body: JSON.stringify(product)
    })
.then(response => response.json())
.then(dati => {
    location.href = 'products.html'
    })
})





let deleteBtn = document.querySelector('.btn-danger')
deleteBtn.addEventListener('click', function (e) {
    e.preventDefault()
    fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`, {
        method: "DELETE",
        headers: {
            "Content-Type": "application/json",
            Authorization:
            "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
        },
        })
    .then(response => response.json())
    .then(dati => {
        console.log(dati);

        location.href = 'products.html'
    })
})