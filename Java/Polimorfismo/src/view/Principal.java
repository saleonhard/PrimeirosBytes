package view;

import entidade.Ave;
import entidade.Baleia;
import entidade.Mamifero;
import entidade.Morcego;
import entidade.Pessoa;

public class Principal {
    public static void main (String[] args) {
        Mamifero pessoa = new Pessoa ();
        Mamifero mamifero = new Mamifero ();
             
        pessoa.locomover();
        mamifero.locomover();
       
    }
}
