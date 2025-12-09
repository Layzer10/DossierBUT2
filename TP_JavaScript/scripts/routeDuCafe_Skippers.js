window.onload = init;

function init() {
    let images = document.getElementsByTagName("img");

    for (let i = 0; i < images.length; i++) {
        images[i].onmouseover = over;
        images[i].onmouseout = out;
    }
}

function over() {
    let voiliers = ["INITIATIVES COEUR", "SOLIDAIRES EN PELOTONS", "TEAM SNEF-TEAMWORK", "ALLAGRANDE"];
    let nom = this.getAttribute("alt");

    let h2 = document.createElement("h2");
    h2.textContent = nom + " + " + voiliers[this.getAttribute("id") - 1];

    let result = document.getElementById("result");
    result.appendChild(h2);
}

function out() {
    let result = document.getElementById("result");
    while (result.firstChild) {
        result.removeChild(result.firstChild);
    }
}


