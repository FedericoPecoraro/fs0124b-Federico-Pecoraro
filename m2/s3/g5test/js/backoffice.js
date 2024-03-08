const save = document.querySelector(".saveProduct");
save.addEventListener("click", function (e) {
    e.preventDefault();

    let name = document.querySelector("#name").value;
    let brand = document.querySelector("#brand").value;
    let price = document.querySelector("#price").value;
    let img = document.querySelector("#img").value;
    let description = document.querySelector("#description").value;

    const product = { name, brand, price, img, description };

    fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "POST",
    headers: {
        "Content-Type": "application/json",
        Authorization:
        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhY2UwZjJkN2IxMTAwMTkwZTZkYzciLCJpYXQiOjE3MDk4ODY5OTEsImV4cCI6MTcxMTA5NjU5MX0.7py7v7_lveoXbS0I3LhraMgKuFgulf-JECV8yxkI1g4",
    },
    body: JSON.stringify(product),
    })
    .then((res) => res.json())
    .then((dati) => {
        console.log(dati);

        location.href = "./products.html";
    });
});
