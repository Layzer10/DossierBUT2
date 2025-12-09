<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);

// Connexion à la base
$pdo = new PDO('mysql:host=localhost;dbname=produits;charset=utf8', 'root', '');

// Traitement du formulaire
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $ref = $_POST['ref'];
    $prix = (float)$_POST['prix'];
    $quantite = $_POST['quantite'];

    if (ctype_digit($quantite)) {
        $stmt = $pdo->prepare("UPDATE article SET prixu = ?, quantite = ? WHERE ref = ?");
        $stmt->execute([$prix, $quantite, $ref]);

        // ✅ Redirection vers la page principale
        header("Location: liste_articles.php");
        exit;
    }
}

// Affichage du formulaire
if (isset($_GET['ref'])) {
    $ref = $_GET['ref'];
    $stmt = $pdo->prepare("SELECT * FROM article WHERE ref = ?");
    $stmt->execute([$ref]);
    $article = $stmt->fetch();

    if ($article):
        ?>

        <!DOCTYPE html>
        <html lang="fr">
        <head>
            <meta charset="UTF-8">
            <title>Modifier l'article</title>
            <link rel="stylesheet" href="STYLE/StyleListeProduit.css">
        </head>
        <body>

        <h2>Modifier l'article</h2>

        <form method="post">
            <p><strong>Référence :</strong> <?= htmlspecialchars($article['ref']) ?></p>
            <input type="hidden" name="ref" value="<?= htmlspecialchars($article['ref']) ?>">

            <label>Prix unitaire :</label>
            <input type="text" name="prix" value="<?= htmlspecialchars($article['prixu']) ?>" required><br>

            <label>Quantité :</label>
            <input type="number" name="quantite" value="<?= (int)$article['quantite'] ?>" required><br>

            <button type="submit">Valider</button>
        </form>

        </body>
        </html>

    <?php
    else:
        echo "<p>Article introuvable.</p>";
    endif;
} else {
    echo "<p>Aucune référence fournie.</p>";
}
?>