package ros;

/**
 * Created by Rosbin on 08/11/2017.
 */
public class Nodo {
    private int valor;
    private Nodo prox;

    public Nodo(int valor, Nodo prox) {
        this.valor = 0;
        this.prox = null;
    }

    public Nodo(int v){
        this.valor=v;
        this.prox=null;
    }

    public void setValor(int v){
        valor=v;
    }
    public void setProx(Nodo p){
        prox=p;
    }
    public int getValor(){
        return valor;
    }

    public Nodo getProx(){
        return prox;
    }
}

