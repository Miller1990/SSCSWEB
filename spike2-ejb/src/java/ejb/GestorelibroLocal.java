/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author marcoevangelisti
 */
@Local
public interface GestorelibroLocal {

    void aggiungiLibro(String titolo, String autore);

    List<Libro> getLibro();
    
}
