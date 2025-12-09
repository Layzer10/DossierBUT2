<?php
// Démarre session si pas déjà
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
$username = isset($_SESSION['username']) ? $_SESSION['username'] : 'Admin';
?>
<style>
    header {
        background: #d9534f;
        color: white;
        padding: 15px 30px;
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }
    nav a {
        color: white;
        margin-left: 20px;
        text-decoration: none;
        font-weight: bold;
    }
    nav a:hover {
        text-decoration: underline;
    }
</style>

<header>
    <div>
        <h1>Espace Admin - <?= htmlspecialchars($username) ?></h1>
    </div>
    <nav>
        <a href="admin.php">Accueil Admin</a>
        <a href="modifier.php">modifier</a>
        <a href="ajouter.php">Ajouter</a>
        <a href="logout.php">Déconnexion</a>
    </nav>
</header>
