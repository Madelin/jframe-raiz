

package RaizCuadrada;


public class Raiz {
    double valor, raiz;
    
    public void getvalor(double numero){
        this.valor=numero;
    }
 
    public double getraiz(){
         raiz=Math.sqrt(valor);
         return raiz;
    }
    
}
