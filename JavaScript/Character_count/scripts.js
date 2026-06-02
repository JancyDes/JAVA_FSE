let textarea = document.getElementById("text");

textarea.addEventListener("input", function () {
    document.getElementById("count").innerHTML =
        textarea.value.length;
});