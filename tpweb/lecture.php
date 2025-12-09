<!doctype html>
<html lang="fr"></html>
<head>
    <title>Reads</title>
    <meta charset="UTF-8">
    <link href="STYLE/Style.css" rel="stylesheet">
</head>
<?php include("header.html"); ?>
<?php

$filename="data.csv";
$fp = fopen($filename, "r");
echo "<table>";
while($record=fgetcsv($fp, 1024, ",")){
    echo "<tr>";
    foreach($record as $key=>$value){
        echo "<td>".$value."</td>";
    }
    echo "</tr>";
}
echo "</table>";
fclose($fp);
?>
<?php include("footer.html");?>
<form method="post">
    <label>Votre nom :</label>
    <input name="nom" id="nom" type="text" />

    <label>Votre prenom :</label>
    <input name="prenom" id="prenom" type="text" />

    <label>Votre mail :</label>
    <input name="mail" id="mail" type="text" />

    <label>Ajouter</label>
    <input name="Ajouter" id="Ajouter" type="submit" />

</form>

<?php
    if(isset($_POST["nom"], $_POST["prenom"], $_POST["mail"])){
        $nom = $_POST["nom"];
        $prenom = $_POST["prenom"];
        $mail = $_POST["mail"];
        if($nom == "" || $prenom == "" || $mail == ""){
            echo "<script>alert('Veuillez remplir tous les champs');</script>";
        }
        $fp = fopen($filename, "a");

        fputcsv($fp, array($nom, $prenom, $mail));
    }