/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Marca;
import br.com.modelo.persistence.MarcaDAO;
import br.com.modelo.persistence.MarcaDAOJDBC;
import java.util.List;

/**
 *
 * @author bruno_figueiredo
 */
public class MarcaController {
    public void inseir ( Marca m){
        MarcaDAO md =  new MarcaDAOJDBC;
        md.inserir(m);
        
    }
    
    public void atualizar (Marca m){
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);
        
    }
    
    public void excluir (int id ){
        MarcaDAO md = new MarcaDAOJDBC();
      md.excluir(id);
        
   
    }            
    public List<Marca> getMarcaByNome(String nome){
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcasByNome(nome);
    }
    
    public Marca getMarcaById (int id){
        MarcaDAO md = new MarcaDAOJDBC ();
        return md.getMarcasbyId(id);
        
    }

    
}
