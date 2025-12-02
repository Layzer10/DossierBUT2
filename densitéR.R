densite=seq(from=8,to=9.1, by=0.1)
effectif=c(4,20,43,100,200,250,190,113,50,19,6,5)
sd1= function(x){
  return(sqrt(mean(x**2)-mean(x)**2))
}
sd2= function(x,n){
  return(sqrt(weighted.mean(x**2,n)-(weighted.mean(x,n))**2))
}

binf=moyenne-ecart

bsup=moyenne+ecart

for(i in 1:12){
  if(densite[i]<bsup & densite[i]>binf){
    S=S+eff[i]
  }
}