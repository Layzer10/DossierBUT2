<?php
$pdo = new PDO('mysql:host=localhost;dbname=produits;charset=utf8', 'root', '');


$stmt = $pdo->query("SELECT nom, prixu, quantite, ref FROM article");
$articles = $stmt->fetchAll(PDO::FETCH_ASSOC);
?>
<link rel="stylesheet" href="STYLE/StyleListeProduit.css">
<table>
    <thead>
    <tr>
        <th>Nom</th>
        <th>Prix unitaire</th>
        <th>Quantité</th>
        <th>Référence</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <?php foreach ($articles as $article): ?>
        <tr>
            <td><?= htmlspecialchars($article['nom']) ?></td>
            <td><?= number_format($article['prixu'], 2) ?> €</td>
            <td><?= (int)$article['quantite'] ?></td>
            <td><?= htmlspecialchars($article['ref']) ?></td>
            <td><form action="modifier.php" method="get">
                    <input type="hidden" name="ref" value="<?= $article['ref'] ?>">
                    <button type="submit">Modifier</button>
                </form></td>
        </tr>
    <?php endforeach; ?>
    </tbody>
</table>

