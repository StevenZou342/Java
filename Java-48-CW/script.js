let data, info; // global variables

async function init(){  
  let link = "https://vigilant-palm-tree-4jv74rpg4vjx2jxj-8400.app.github.dev";// Insert your Dev URL from Activity 47. The activity (DB server) must be running in a separate tab.
  let route= "/employees";

  info = await fetch(link+route);
  data = await info.json();

  let employees = data;

  for(let i=0; i < employees.length; i++){
    let employee = employees[i];    
    console.log("First Name: " + employee.FirstName);
    console.log("Last Name: " + employee.LastName);
    console.log("Birthdate: " + employee.BirthDate);
    console.log("*********************");
  }
}