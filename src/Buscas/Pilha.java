
package Buscas;

import java.util.ArrayList;


public class Pilha {
    
    private ArrayList<Estado> pilha;
    private int topo;
    
    public Pilha(){
        this.pilha = new ArrayList<Estado>() {};
        this.topo = -1;
    }
    
    public Estado pop(){
        if(!isEmpty()){
            Estado e = this.pilha.get(topo);
            this.pilha.remove(topo);
            this.topo--;
            return e;
        }
        return null;
    }
    
    public void push(Estado i){
        this.pilha.add(i);
        this.topo++;
    }
    
    public Estado getTopo(){
        return this.pilha.get(topo);
    }
    
    public boolean isEmpty(){
        return this.pilha.isEmpty();
    }
    
    public int size(){
        return this.pilha.size();
    }
    
}
