public class Fatorial{
  public int calcularFatorial(int n){
     in resultado =1;
     for(int i = 2; i<=n; i++){
         resultado *=i;
     }
     return resultado;
  }
}