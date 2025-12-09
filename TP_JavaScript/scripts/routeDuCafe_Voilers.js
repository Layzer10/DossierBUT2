window.onload = init;

function init() {
    let images = document.getElementsByTagName("img");

    const chaineJSON = '[{"nom": "Class40", "logo": "Class40.jpg"},'+
        '{"nom": "IMOCA", "logo": "IMOCA.jpg"},'+
        '{"nom": "Ocean Fifty", "logo": "OceanFifty.png"}, '+
        '{"nom": "Ultim", "logo": "Ultim.jpg"}]';

    let classesVoiliers= JSON.parse(chaineJSON)
    for (let i = 0; i < classesVoiliers.length; i++) {
        let image=document.createElement("img")
        image.src="logos_TJV/"+ classesVoiliers[i].logo
        image.id=i
        image.alt=classesVoiliers[i].nom
        image.onmouseover = over;
        image.height=80
        image.width=80
        document.getElementById("logos").appendChild(image)
    }

}

function over() {
    let result = document.getElementById("nomDeClasse");
    while (result.firstChild) {
        result.removeChild(result.firstChild);
    }
    const nom = this.alt;
    nomDeClasse.textContent = nom;
}




