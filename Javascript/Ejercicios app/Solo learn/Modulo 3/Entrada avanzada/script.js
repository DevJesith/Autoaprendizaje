// let x = confirm("Proceed to payment?");
// console.log(x);

// let decision = confirm();

// alert(decision)

// ----------------------

// function checkTicked() {
//     let box = document.getElementById("c1");
//     console.log(box.checked)
// }

// -----------------------------------------------------

function processFormData() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("pass").value;
    let isSubscribed = document.getElementById("subscribe").checked;

    // Insert data into the table with predefined function
    insertData(email, password, isSubscribed);

    // Clear the form fields
    document.getElementById("email").value = "";
    document.getElementById("pass").value = "";
}

function insertData(email, password, isSubscribed) {
    // Access the table
    let table = document.getElementById("dataTable");

    // Insert a new row at the end of the table
    let newRow = table.insertRow();

    // Insert new cells for the new row
    let cell1 = newRow.insertCell(0);
    let cell2 = newRow.insertCell(1);
    let cell3 = newRow.insertCell(2);

    // Set the values of the new cells
    cell1.innerHTML = email;
    cell2.innerHTML = password;
    cell3.innerHTML = isSubscribed ? 'Yes' : 'No';
}

// Add event listener for form submission
document.getElementById("myForm").addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission
    processFormData();
});
