<?php
$fp = fopen("data/data.csv", 'a');
if(isset($_POST['Esteban'], $_POST['Cazor'])) {
    $nom = $_POST['Esteban'];
    $prenom = $_POST['Cazor'];
    fputcsv($fp, array($nom, $prenom));
    if(!($nom == ''  $prenom == '') {

    }
    fclose($fp);
}
header("location: lecture.php");
