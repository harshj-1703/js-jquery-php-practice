let array = [10, 52, 2, 65, 98, 24, 85];

let max = array[0];

for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
}

console.log(`${max} is the maximum number`);
