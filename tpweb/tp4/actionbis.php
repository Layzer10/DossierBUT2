<?php
$login=$_POST["login"];
$mdp=$_POST["mdp"];

if($login=="admin" && $mdp=="admin"){
    session_start();
    $_SESSION["login"]=$login;
    header("location: admin.php");
}
else{
    header("location: login.php?error");
}

$filename="U:/tpweb/data.csv";
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