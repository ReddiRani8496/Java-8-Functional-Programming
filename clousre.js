function addition() {
  let x = 20;

  function add() {
    let y = 10;
    console.log(x + y);
  }
  return add;
}

let result = addition();

result();

// when we are returning a add function from the addition function,

// let x = 20;

//   function add() {
//     let y = 10;
//     console.log(x + y);
//   }
//   return add;

// it will return the variables present inside the addition function and the add function will be returned.
// thus binding the variables present inside the addition function and the add function is called closure.
// it will bind the variables because those vairables might be used inside the add function.
