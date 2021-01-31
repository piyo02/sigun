/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zidni
 */
public class model {
    
    inventori_barang.koneksi konek = new inventori_barang.koneksi();
    String tabel="";
    
    public void insert(String query){
        try {
            Connection conn = konek.openkoneksi();
            java.sql.Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data.");
//            btnadd.doClick();
            konek.closekoneksi();
//            GetData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmbarangKategori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
