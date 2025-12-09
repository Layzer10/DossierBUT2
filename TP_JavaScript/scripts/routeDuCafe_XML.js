window.onload = init;

function init() {
    let request = new XMLHttpRequest();
    request.open("GET", "XML/Route_du_Cafe.xml");
    request.send();
    request.onreadystatechange = function () {
        traitementReponse(request);
    }
}
function traitementReponse(request){
    //console.log(request.readyState+" "+request.status);
    if(request.readyState==4 && request.status==200){
        //console.log(request.responseXML)
        let classesVoiliers= request.responseXML.getElementsByTagName("classe")
        for (let i = 0; i < classesVoiliers.length; i++) {
            let image=document.createElement("img")
            image.src="logos_TJV/"+ classesVoiliers[i].getAttribute("nom")+".jpg"
            image.id=i
            image.alt=classesVoiliers[i].getAttribute("nom")
            image.onmouseover = function (){
                over(classesVoiliers[i]);
            };
            image.height=80
            image.width=80
            document.getElementById("logos").appendChild(image)
        }
    }

}

function over(classeVoilier){
    let result = document.getElementById("nomDeClasse");
    while (result.firstChild) {
        result.removeChild(result.firstChild);
    }

    let h2=document.createElement("h2")
    h2.appendChild(document.createTextNode(classeVoilier.getAttribute("nom")))
    result.appendChild(h2)

    let voiliers= classeVoilier.getElementsByTagName("voilier")
    for (let i = 0; i < voiliers.length; i++) {
        let h3=document.createElement("h3")
        h3.appendChild(document.createTextNode(voiliers[i].getElementsByTagName("nom")[0].textContent))
        result.appendChild(h3)
    }
}