let images = [
    "https://picsum.photos/id/1015/500/300",
    "https://picsum.photos/id/1016/500/300",
    "https://picsum.photos/id/1018/500/300",
    "https://picsum.photos/id/1020/500/300",
    "https://picsum.photos/id/1024/500/300"
];

let index = 0;

document.getElementById("slider").src = images[index];

setInterval(function () {
    index++;

    if (index >= images.length) {
        index = 0;
    }

    document.getElementById("slider").src = images[index];
}, 3000);