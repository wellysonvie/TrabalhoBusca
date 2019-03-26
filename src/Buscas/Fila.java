
package Buscas;

import java.util.ArrayList;

public class Fila {
    
    private ArrayList<Estado> fila;
    
    public Fila(){
        this.fila = new ArrayList<Estado>() {};
    }
    
    public Estado getAndRemove(){
        Estado e = this.fila.get(0);
        this.fila.remove(0);
        return e;
    }
    
    public Estado get(int i){
        return this.fila.get(i);
    }
    
    public void add(ArrayList<Estado> novos){
        this.fila.addAll(novos);
    }
    
    public void add(Estado novo){
        this.fila.add(novo);
    }
    
    public int size(){
        return this.fila.size();
    }
    
    public boolean isEmpty(){
        return this.fila.isEmpty();
    }
    
}
