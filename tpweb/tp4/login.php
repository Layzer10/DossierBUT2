<?php
include("res/login.html");
if(isset($_GET["error"])){
    echo"<p>Vous n'êtes pas connecté</p>";
}