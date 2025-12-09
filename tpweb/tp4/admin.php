<?php
session_start();
if($_SESSION['login']=="admin"){
    echo "Bonjour";
    echo "<br>";
    echo "<a href=../logout.php>Logout</a>";
}
else{
    header("location: login.php?error");
}