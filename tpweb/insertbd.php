<?php
$host = "localhost";
$user = "root";
$pass = "";
$db = "users";
$conn = mysqli_connect($host, $user, $pass);
if(!$conn){
    echo "error";
}
else{
    echo"<form action='' method='POST'>;
    <label for='login'>Login</label>'>;
    <input type='text' name='login' id='login'>;
    <label for='password'>Password</label>;
    <input type='password' name='password' id='password'>;
    <label for='bureau'>bureau</label>'>;
    <input type='text' name='bureau' id ='bureau'>;
    <input type='submit' name='submit'>;
    </form>";}

    if (isset($_POST['login'], $_POST['password'], $_POST['bureau'])) {
        $login = $_POST['login'];
        $password = $_POST['password'];
        $bureau = $_POST['bureau'];
        $base = mysqli_select_db($conn,$db);

        if(!$base){
            echo "error";
        }
        else{
            $sql= "insert into users(login,password,bureau) values(?,?,?)";
            $stmt= mysqli_prepare($conn,$sql);
            mysqli_stmt_bind_param($stmt, "sss", $login, $password, $bureau);
            if(mysqli_stmt_execute($stmt)){
                echo "success";

            }
            else{
                echo "error";
            }
        }

}