#ecart inter quartile
set.seed(123)
donnees <- replicate(20, runif(100))
iqr_par_serie <- apply(donnees, 2, IQR)
print(iqr_par_serie)

#moyenne
set.seed(123)
donnees <- replicate(20, runif(100))
moyennes <- apply(donnees, 2, mean)
print(moyennes)

#ecart-type
ecarts_type <- apply(donnees, 2, sd)

data= matrix(nrow= 100,ncol = 20)
for(i in 1:20){
  x=runif(100)
  data[,i]=x
  moyenne=c(ecart,sd1(x))
  iqr=c(iqr,IQR(x,type=6))
}

moyennes
ecarts_type
iqr_par_serie

mean(moyennes)
sd(moyennes)