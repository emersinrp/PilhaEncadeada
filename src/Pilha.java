/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elsro
 */
public class Pilha implements Lista {

    private Item topo;

    public Pilha() {
        this.topo = null;
    }
    

    @Override
    public boolean inserir(Item i) {
        if (this.tamanho() == 0) {
            this.topo = i;
        } else {
            i.setProximo(topo);
            this.topo = i;
        }
        return true;
    }
    

    @Override
    public boolean remover() {
        if (tamanho() == 0){
            return false;
        }else{
        topo = topo.getProximo();
        }
        return true;
    }

    
    @Override
    public int tamanho() {
        Item aux = this.topo;
        int t = 0;

        if (aux == null) {
            return t;
        } else {
            t++;
            while (aux.getProximo() != null) {
                t++;
                aux = aux.getProximo();
            }
        }
        return t;
    }

}
