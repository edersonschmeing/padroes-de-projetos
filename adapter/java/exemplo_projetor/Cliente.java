/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Adaptador
*
*/

package adapter.java.exemplo_projetor;

import adapter.java.exemplo_projetor.adapters.Projetor;
import adapter.java.exemplo_projetor.adapters.ProjetorLGAdapter;
import adapter.java.exemplo_projetor.adapters.ProjetorSamsungAdapter;
import adapter.java.exemplo_projetor.modelo.ProjetorLG;
import adapter.java.exemplo_projetor.modelo.ProjetorSamsung;


public class Cliente {

    public static void main(String[] args) {
        
        Projetor projetorSamsung = new ProjetorSamsungAdapter(new ProjetorSamsung());
        //ProjetorSamsung projetorSamsung = new ProjetorSamsungAdapter(new ProjetorSamsung());
        
        Projetor projetorLG = new ProjetorLGAdapter(new ProjetorLG());
        //Projetor projetorLG = new ProjetorLGAdapter(new ProjetorLG());
        

        ControleDeProjetores controlaProjetores = new ControleDeProjetores();
        
        controlaProjetores.inicia(projetorSamsung);  
        controlaProjetores.inicia(projetorLG);      

     }

    
}
