function updateDateTime() {
    let now = new Date();
    document.getElementById("datetime").innerHTML =
        now.toLocaleString();
}

setInterval(updateDateTime, 1000);
updateDateTime();