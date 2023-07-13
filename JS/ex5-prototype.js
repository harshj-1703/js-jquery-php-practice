// Define a constructor function
function Person(name) {
    this.name = name;
  }
  
  // Create an instance of the Person object
  const person = new Person('John');
  
  // Access the prototype of the Person object
  const personPrototype = Person.prototype;
  
  console.log(personPrototype);
  