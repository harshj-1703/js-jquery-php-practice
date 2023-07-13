function isLong(city) {
    return city.length > 8;
}

const cities = ["London", "Liverpool", "Totnes", "Edinburgh"];
const longer = cities.filter(isLong);
console.log(longer);