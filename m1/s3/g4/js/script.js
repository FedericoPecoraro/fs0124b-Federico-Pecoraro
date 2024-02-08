function generateNumbers() {
    const container = document.querySelector('.number-box');

    for (let index = 1; index <= 90; index++) {

    const numberBox = document.createElement('div');
    numberBox.classList.add('number');
    numberBox.innerText = index;
    container.append(numberBox);
    }
}
generateNumbers();

function callNumber() {
    const randomNumber = Math.floor(Math.random() * 90) + 1;
    const calling = document.querySelector('.number-box .number:nth-child(' + randomNumber + ')');
    calling.classList.add('called-number');
}

const button = document.querySelector('.btn');
button.addEventListener('click', callNumber);