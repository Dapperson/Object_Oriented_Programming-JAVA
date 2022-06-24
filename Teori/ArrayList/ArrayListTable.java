/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author Asus
 */
import javax.swing.table.DefaultTableModel;

public class ArrayListTable extends javax.swing.JFrame {
    DefaultTableModel modelmahasiswa;
    InputData datamahasiswa;

    public ArrayListTable() {
        initComponents();
        datamahasiswa = new InputData();
        viewDataTabel();
    }

    public final void viewDataTabel() {
        String[] namakolom = { "NIM", "Nama", "Alamat" };
        Object[][] objekmahasiswa = new Object[datamahasiswa.getALL().size()][3];
        int i = 0;

        for (Mahasiswa mhs : datamahasiswa.getALL()) {
            String arrayMahasiswa[] = {
                    mhs.getNIM(),
                    mhs.getNama(),
                    mhs.getAlamat()
            };
            objekmahasiswa[i] = arrayMahasiswa;
            i++;
        }
        modelmahasiswa = new DefaultTableModel(objekmahasiswa, namakolom);
        mahasiswaTB.setModel(modelmahasiswa);
    }

    public void ClearTextField() {
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        nimTF.requestFocus();
    }

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {
        datamahasiswa.deleteData(mahasiswaTB.getSelectedRow() + 1);
        viewDataTabel();
    }

    private void simpanBTActionPerformed(java.awt.event.ActionEvent evt) {
        datamahasiswa.insertData(
                nimTF.getText(),
                namaTF.getText(),
                alamatTF.getText());
        viewDataTabel();
        ClearTextField();
    }
}

