package ros;

/**
 * Created by Rosbin on 08/11/2017.
 */
public class Pilas {
    private Nodo top;

    public Pilas(){
        top=null;
    }
    public boolean vacia(){
        return (top==null);
    }

    public void push(int valor){ //insertar
        Nodo nodoNuevo;
        if (vacia())
            top=new Nodo(valor);
        else {
            nodoNuevo = new Nodo(valor);
            nodoNuevo.setProx(top);
            top=nodoNuevo;
        }
    }

    public void peek(){//mostrar
        Nodo temp = top;
        if (temp!=null){
            System.out.println("La pila es :");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println(" PILA VACIA ");
    }

    public void cima(){//buscar
        if (!vacia())
            System.out.println("cima :" + top.getValor() );
        else
            System.out.println("La pila esta vacia");
    }

    public void pop(){//borrar
        if (!vacia()){
            System.out.println("Dato extraido : " + top.getValor());
            top=top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }
}
