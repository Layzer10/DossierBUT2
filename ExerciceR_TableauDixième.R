# Générer 1000 réels aléatoires entre 0 et 1
x <- runif(1000, min=0, max=1)

# Découper en intervalles de 0 à 1 par pas de 0.1
breaks <- seq(0, 1, by=0.1)

# Utiliser cut pour classer chaque valeur dans un intervalle
classes <- cut(x, breaks=breaks, right=FALSE)  
# right=FALSE : intervals left-closed, right-open [a,b)

# Compter combien de valeurs dans chaque intervalle
table(classes)
 