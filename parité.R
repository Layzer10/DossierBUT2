lance <- fonction(){
  sampl <- sample(0,1)
  if(sampl==1){
    return ("TRUE")
  }
  else{
    return ("FALSE")
  }
}

name <- as.numeric(readline(prompt = "entré le nombre d'itérations"))