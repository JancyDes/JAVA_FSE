let box = document.getElementById("box");

box.addEventListener("mouseenter", function () {
    box.style.backgroundColor = "red";
});

box.addEventListener("mouseleave", function () {
    box.style.backgroundColor = "blue";
});