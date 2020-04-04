/**
 * Created by shiraz on 4/4/2020.
 */
function isPrime(number) {
    if (number <= 1) return false;
    if (number <= 3) return true;
    if (number % 2 === 0 || number % 3 === 0) return false;

    for (let i = 5; i * i <= number; i = i + 6) {
        if (number % i === 0 || number % (i + 2) === 0) return false;
    }

    return true;
}

function getPrime(number) {
    let primes = [];
    let outPrimes = [];

    for (let i = 0; i <= number; i++) {
        if (isPrime(i)) {
            primes.unshift(i);
        }
    }

    primes.forEach(x => {
        for (let i = 0; i <= x; i++) {
            if (isPrime(i)) {
                outPrimes.push(i)
            }
        }

    });
    outPrimes.sort(function (a, b) {
        return b - a
    });
    console.log(outPrimes)
}

getPrime(7);