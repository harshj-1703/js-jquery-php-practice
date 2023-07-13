class Person {
    name;
  
    constructor(name) {
      this.name = name;
    }
  
    introduceSelf() {
      console.log(`Hi! I'm ${this.name}`);
    }
  }

const giles = new Person("Harsh");
giles.introduceSelf();
console.log("--------------------------------");

//----------------------------------------------------------------
//inheritence
class Professor extends Person {
    teaches;
  
    constructor(name, teaches) {
      super(name);
      this.teaches = teaches;
    }
  
    introduceSelf() {
      console.log(
        `My name is ${this.name}, and I will be your ${this.teaches} professor.`,
      );
    }
  
    grade(paper) {
      const grade = Math.floor(Math.random() * (5 - 1) + 1);
      console.log(grade+"% for paper "+paper);
    }
}

const walsh = new Professor("Harsh", "Maths");
console.log(walsh.name);
walsh.introduceSelf();
walsh.grade("ss"); // some random grade


//------------------------------------------------------
//Encapsulation
class Student extends Person {
  #year;

  constructor(name, year) {
    super(name);
    this.#year = year;
  }

  introduceSelf() {
    console.log(`Hi! I'm ${this.name}, and I'm in year ${this.#year}.`);
  }

  canStudyArchery() {
    return this.#year > 1;
  }
}

const summers = new Student("Harsh", 4);

summers.introduceSelf(); // Hi! I'm Summers, and I'm in year 2.
console.log(summers.canStudyArchery()); // true

// summers.#year; // SyntaxError -> Property '#year' is not accessible outside class 'Student' because it has a private identifier.ts(18013)


//------------------------------------------------------
//Private Methods

class Example {
  somePublicMethod() {
    this.#somePrivateMethod();
  }

  #somePrivateMethod() {
    console.log("You called me?");
  }
}

const myExample = new Example();

myExample.somePublicMethod(); // 'You called me?'

// myExample.#somePrivateMethod(); // SyntaxError //Property '#somePrivateMethod' is not accessible outside class 'Example' because it has a private identifier.ts(18013)
