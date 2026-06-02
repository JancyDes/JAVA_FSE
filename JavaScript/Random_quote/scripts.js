let quotes = [
    "Success is not final.",
    "Practice makes perfect.",
    "Never stop learning.",
    "Dream big and work hard.",
    "Believe in yourself."
];

function showQuote() {
    let index = Math.floor(Math.random() * quotes.length);
    document.getElementById("quote").innerHTML = quotes[index];
}