let hours = 0;
let minutes = 0;
let seconds = 0;

let timer = null;

// Disable Stop button initially
document.getElementById("stopBtn").disabled = true;

function updateDisplay() {

    document.getElementById("hours").innerHTML =
        String(hours).padStart(2, "0");

    document.getElementById("minutes").innerHTML =
        String(minutes).padStart(2, "0");

    document.getElementById("seconds").innerHTML =
        String(seconds).padStart(2, "0");
}

function startTimer() {

    document.getElementById("startBtn").disabled = true;
    document.getElementById("stopBtn").disabled = false;

    timer = setInterval(() => {

        seconds++;

        if (seconds === 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes === 60) {
            minutes = 0;
            hours++;
        }

        updateDisplay();

    }, 1000);
}

function stopTimer() {

    clearInterval(timer);
    timer = null;

    document.getElementById("startBtn").disabled = false;
    document.getElementById("stopBtn").disabled = true;
}

function resetTimer() {

    clearInterval(timer);
    timer = null;

    hours = 0;
    minutes = 0;
    seconds = 0;

    updateDisplay();

    document.getElementById("startBtn").disabled = false;
    document.getElementById("stopBtn").disabled = true;
}