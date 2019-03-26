
package Buscas;

import java.util.ArrayList;

public class BuscaLargura {
    
    Fila fronteira;
    
    public BuscaLargura(){
        this.fronteira = new Fila();
    }
    
    public Solucao buscar(int[] tabInicial, int maxProfundidade){
        
        Estado estInicial = new Estado(tabInicial, 1, null);
        int qNos = 0;
        
        for(int i = 1; i <= maxProfundidade; i++){
            
            if(i == 1){
                fronteira.add(estInicial);
            }else{
                int tamFronteira = fronteira.size();
                for(int j = 0; j < tamFronteira; j++){
                    Estado e = fronteira.getAndRemove();
                    e.expandirNo();
                    fronteira.add(e.filhos);
                }   
            }
            
            System.out.println("Nível: "+i+" - fronteira: "+fronteira.size());
            qNos += fronteira.size();
            
            for(int k = 0; k < fronteira.size(); k++){
                Estado e = fronteira.get(k);
                if(this.isSolution(e.tabuleiro)){
                    System.out.println("*********************** Encontrou a solução *******************");
                    this.printTabuleiro(e.tabuleiro);
                    return this.construirSolucao(e, qNos, i);
                }
            }
        }
        
        return null;
    }
    
    public Solucao construirSolucao(Estado eFinal, int qNos, int qNiveis){
        
        Pilha caminho = new Pilha();
        ArrayList<int[]> passos = new ArrayList<>();
        
        Estado atual = eFinal;
        while(atual.pai != null){
            caminho.push(atual);
            atual = atual.pai;
        }
        
        caminho.push(atual);
        
        while(! caminho.isEmpty()){
            passos.add(caminho.pop().tabuleiro);
        }
        
        return new Solucao(passos, qNiveis, qNos);
    }
    
    public boolean isSolution(int[] estado){
        int[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        for(int i = 0; i < 9; i++){
            if(solution[i] != estado[i])
                return false;
        }
        return true;
    }
    
    private void printTabuleiro(int[] tab){
        System.out.println(tab[0]+"  "+tab[1]+"  "+tab[2]);
        System.out.println(tab[3]+"  "+tab[4]+"  "+tab[5]);
        System.out.println(tab[6]+"  "+tab[7]+"  "+tab[8]);
    }
    
}
