
<?php
$host = "localhost";
$user = "root";
$pass = "";
$db = "users";
$conn = mysqli_connect($host, $user, $pass, $db);
if(!$conn){
    echo "error";
}
else{
    echo "ok";
    $base=mysqli_select_db($conn,$db);
    if(!$base){
        echo "erreur";
    }
    else{

        echo "ok";
        $sql= "select * from users";
        $result = mysqli_query($conn,$sql);
        echo "<table>";
        echo "<tr>";
        echo "<th>login</th>";
        echo "<th>password</th>";
        echo "<th>bureau</th>";
        echo "</tr>";
        if(mysqli_num_rows($result)>0){
            while($row = mysqli_fetch_assoc($result)){
                echo "<tr>";
                echo "<td>".$row['login']."</td>";
                echo "<td>".$row['password']."</td>";
                echo "<td>".$row['bureau']."</td>";
        }
        }
        echo "</table>";
    }

}
mysqli_close($conn);
include "footer.php";