/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.Random;

/**
 *
 * @author casa
 */
public class Alocador {
    
    private int tamRestante;
    private Principal atualiza;
    private mapeamentoHeap mp;
    private Desalocador dh;
    
    public Alocador(Principal p, mapeamentoHeap mp){
        this.mp = mp;
        this.atualiza = p;
        this.dh = new Desalocador(p);
    }
    
    void alocaHeap(Requisicao nova){
        Random random = new Random();
        this.tamRestante = nova.getTamanho();
        while(this.tamRestante != 0){
            for(int i = 0; i < mp.getTamHeap(); i++){
                if(mp.tabHeap[i][1] == 0){
                    this.tamRestante--;
                    mp.tabHeap[i][1] = 1;
                    mp.tabHeap[i][0] = nova.getIdentificador();
                    mp.tabHeap[i][2] = this.tamRestante;
                    mp.heap[i] = random.nextInt();
                }
                if(this.tamRestante == 0)   break;
            }
            if(this.tamRestante != 0)   dh.desalocadorHeap(mp);
        }
        
        if(mp.getOcupacaoHeap() >= (mp.getTamHeap() * (mp.getLimiarMax() / 100))){
            dh.desalocadorHeap(mp);
        }
        mp.setOcupacaoHeap(mp.getOcupacaoHeap() + 1);
        
        //impressao
        String val;
        for(int i = 0; i < mp.heap.length; i++){
            val = "" + mp.heap[i];
            atualiza.atualizarHeap(val, i);
       }
        
    }
    
}