var currecyOne = 100;
var currecyTwo = 0;
var exchangeRate = 1.2;

function convertCurrency(amount, rate) {
    return amount * rate;
}

currecyTwo = convertCurrency(currecyOne, exchangeRate);

console.log(currecyTwo);



