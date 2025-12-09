<?php
$dom = new DOMDocument();
$dom->load($_GET['xml']);
if($dom -> validate()){
    echo "Ce document est valide !";
}
?>