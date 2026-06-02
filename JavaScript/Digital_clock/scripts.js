function showTime()
{
    let now = new Date();
    document.getElementById("clock").innerHTML=now.toLocaleTimeString();

}
setInterval(showTime,1000);
showTime();