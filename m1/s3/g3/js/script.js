const text = document.querySelector('#text');
const add = document.querySelector('#add');
const check = document.querySelector('#delete');
const div = document.createElement('div')

add.addEventListener('click', function(e){
    e.preventDefault();
    document.body.appendChild(document.createElement('div'))
})

check.addEventListener('click', function(e){
    e.preventDefault();
})

