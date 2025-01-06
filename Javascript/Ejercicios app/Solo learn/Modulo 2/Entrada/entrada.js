// let userName = prompt("Please enter your name");
// document.getElementById("userName").textContent = userName;

// ------------------------------------

function changeStyle() {
    let body = document.getElementById("body");
    let backgraound = document.getElementById("background").value;
    let color = document.getElementById("color").value;

    body.style.background = backgraound;
    body.style.color = color;

}