/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author asus note
 */
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new TV();
        Produto p2 = new Celular();
        Produto p3 = new Camera();
        
        System.out.println(p1.getTipoImpressao()+ " " +p1.getNome()+" na promocao "+ p1.getPromocao() + " com desconto de " + p1.desconto()+"%");
        System.out.println(p2.getTipoImpressao()+ " " +p2.getNome()+" na promocao "+ p2.getPromocao() + " com desconto de " + p2.desconto()+"%");
        System.out.println(p3.getTipoImpressao()+ " " +p3.getNome()+" na promocao "+ p3.getPromocao() + " com desconto de " + p3.desconto()+"%");
    }
    
}
