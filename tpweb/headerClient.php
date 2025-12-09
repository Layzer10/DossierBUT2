<?php
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
$username = isset($_SESSION['username']) ? $_SESSION['username'] : 'Client';
?>
<style>
    header {
        background: #0275d8;
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
        <h1>Bienvenue <?= htmlspecialchars($username) ?></h1>
    </div>
    <nav>
        <a href="client/accueil.php">Accueil Client</a>
        <a href="client/commande.php">Commandes</a>
        <a href="logout.php">Déconnexion</a>
    </nav>
</header>
