/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistence;

import br.com.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author bruno_figueiredo
 */
public interface MarcaDAO {
    
    
    void inserir (Marca m);
    void atualizar (Marca m);
    void excluir (int id);
    List<Marca> getMarcas();
    List<Marca> getMarcasByNome(String nome);
    Marca getMarcasbyId(int id);
            
    
}
