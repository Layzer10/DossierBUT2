<?php
session_start();
ini_set('display_errors', 1);
error_reporting(E_ALL);

// Connexion à la base de données
$pdo = new PDO('mysql:host=localhost;dbname=mysql;charset=utf8', 'root', '');
$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

$errors = [];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    $username = isset($_POST['username']) ? trim($_POST['username']) : '';
    $password = isset($_POST['password']) ? $_POST['password'] : '';

    if ($username === '' || $password === '') {
        $errors[] = 'Veuillez remplir tous les champs.';
    } else {

        $safeUsername = $pdo->quote($username);
        $sql = "SELECT username, password FROM users WHERE username = $safeUsername LIMIT 1";
        $result = $pdo->query($sql);
        $user = $result->fetch(PDO::FETCH_ASSOC);

        if ($user && $user['password'] === md5($password)) {
            session_regenerate_id(true);
            $_SESSION['username'] = $user['username'];

            if ($user['username'] === 'admin') {
                $_SESSION['role'] = 'admin';
                header('Location: header.php');
            } else {
                $_SESSION['role'] = 'client';
                header('Location: headerClient.php');
            }
            exit;
        } else {
            $errors[] = 'Identifiants invalides.';
        }
    }
}
?>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <title>Connexion</title>
    <style>
        body{font-family:Arial;background:#f5f7fb;display:flex;align-items:center;justify-content:center;height:100vh;margin:0}
        .card{background:#fff;padding:24px;border-radius:8px;box-shadow:0 6px 18px rgba(33,33,33,0.08);width:320px}
        .errors{color:#b00020;margin-bottom:12px}
    </style>
</head>
<body>
<div class="card">
    <h2>Connexion</h2>

    <?php if (!empty($errors)): ?>
        <div class="errors">
            <?php foreach ($errors as $e) echo htmlspecialchars($e).'<br>'; ?>
        </div>
    <?php endif; ?>

    <form method="post" autocomplete="off">
        <label>Nom d'utilisateur</label>
        <input type="text" name="username"
               value="<?= isset($username) ? htmlspecialchars($username) : '' ?>" required>

        <label>Mot de passe</label>
        <input type="password" name="password" required>

        <button type="submit">Se connecter</button>
    </form>
</div>
</body>
</html>
