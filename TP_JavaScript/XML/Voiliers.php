<?php

$dom = new DOMDocument();
$dom -> encoding = 'utf-8';
$dom -> formatOutput = true;
$racine = $dom -> createElement("voiliers");
$racine -> setAttribute("transat", "Café 2025");
$dom -> appendChild($racine);

$fichier_csv = fopen("../Données/voiliers.csv", "r");
$delimiter = ",";
fgetcsv($fichier_csv, 1500, $delimiter);

$i = 1;
while ($champs = fgetcsv($fichier_csv, 1500, $delimiter)) {
    $voiliers= $dom->createElement("voilier")
    $voilers->setAttribute("annee")
    $voiliers->setAttribute("classe",$champs[2])
    $nom_voilier=$dom->createElement("nom_voilier")
    $nom_voilier->textContent= $champs[1]
    $voiliers.appendChild($skipper1)
    $origine1=$dom->createElement("origine")
    $origine1->textContent=$champs[7]
    $skipper1=$dom->createElement("skipper")
    $skipper1.setAttribute("age",$champs[6])
    $skipper1.appendChild($origine1)
}
fclose($fichier_csv);
$dom -> save("voiliers.xml") or die ("Erreur dans la création de voiliers.xml");


