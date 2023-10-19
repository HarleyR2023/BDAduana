package bdaduana.controlador;

import bdaduana.vista.PantallaGerente;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class ControladorGerente implements ActionListener {

    private String[] titleTable = {"Nombre", "RUC", "NAVE", "ESTADO", "CONTACTO", "TIPO DE NAVE", "TIEMPO"};
    private Double tiempPrice = 0.0;
    private Double price = 0.0;
    private final Object[] almacen = {"Alamcen1"};
    private PantallaGerente pestañaGerente;

    public ControladorGerente(PantallaGerente pestañaGerente) {
        this.pestañaGerente = pestañaGerente;
        pestañaGerente.txtDia.setEnabled(false);
        pestañaGerente.txtSemana.setEnabled(false);
        pestañaGerente.txtMes.setEnabled(false);
        pestañaGerente.txtMes.setEnabled(false);
        pestañaGerente.txtAño.setEnabled(false);
        addActionDocumentSearchPerson(pestañaGerente.txtBuscar);
        fillTableWithRandomData(pestañaGerente.tableRegistros, titleTable, 10);
        jButtonListener();
        radio();
        showNewGerente();

    }

    private void addActionDocumentSearchPerson(JTextField search) {
        search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTableData(search.getText(), pestañaGerente.tableRegistros, titleTable);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTableData(search.getText(), pestañaGerente.tableRegistros, titleTable);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    private void updateTableData(String searchText, JTable table, String[] columnNames) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);//Limpair tabla
        Random random = new Random();//Libreria que importa objetos randomm
        for (int i = 0; i < 10; i++) { //Instancia menor a 10
            Object[] rowData = new Object[columnNames.length];//rowData se guarda aca
            boolean rowMatches = false; //Confirmamos que hay un dato
            for (int j = 0; j < columnNames.length; j++) {
                String randomData = "Dato " + (i + 1);
                if (j == 1) { 
                    randomData = String.valueOf(random.nextInt(1000000));
                }
                rowData[j] = randomData;
                if (randomData.contains(searchText)) {
                    rowMatches = true;
                }
            }
            if (rowMatches) {//Una ves acabado los bucles, verifica si se ha encontrado a la basado que se ha escrito
                model.addRow(rowData);
            }
        }
    }
    
    //no busca datos, obtiene datos 
    public static void fillTableWithRandomData(JTable table, String[] columnNames, int numRows) {
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table.setModel(model);//Enlazarlo con la base de datos 
        Random random = new Random();//aregar una consulta de la base de datos con un modelo.
        for (int i = 0; i < numRows; i++) {
            Object[] rowData = new Object[columnNames.length];
            for (int j = 0; j < columnNames.length; j++) {
                if (j == 1 || j == 6) {
                    rowData[j] = random.nextInt(1000000); 
                } else {
                    rowData[j] = "Dato " + (i + 1); 
                }
            }
            model.addRow(rowData);
        }
    }
   
    private void showNewGerente() {
        DefaultComboBoxModel box = new DefaultComboBoxModel();
        
        pestañaGerente.cbxAlmacen.setModel(box);

        pestañaGerente.setLocationRelativeTo(null);

        pestañaGerente.setVisible(true);

    }

    /**
     * Action Button Listener
     */
    private void jButtonListener() {
        pestañaGerente.bRegistrarTiempo.addActionListener(this);
        pestañaGerente.btConfirt.addActionListener(this);
    }

    /**
     * Action RadioButton
     */
    private void radio() {
        pestañaGerente.RBDia.addActionListener(this);
        pestañaGerente.RBSemana.addActionListener(this);
        pestañaGerente.RBMes.addActionListener(this);
        pestañaGerente.RBAño.addActionListener(this);

    }

    /**
     * Este metodo es de la clase absore el llmado del las acciones externas
     */
    @Override
    public void actionPerformed(ActionEvent e) {//Metodo abstracto de una interfas
        //Union de clases
        if (e.getSource().equals(pestañaGerente.bRegistrarTiempo)) {//Owner establece un parametro-------------

            pestañaGerente.jDialogDate.setSize(704, 584);
            pestañaGerente.jDialogDate.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            pestañaGerente.jDialogDate.setLocationRelativeTo(null);
            pestañaGerente.jDialogDate.setVisible(true);
        }

        if (e.getSource().equals(pestañaGerente.RBDia)) {
            if (pestañaGerente.RBDia.isSelected() == true) {
                pestañaGerente.txtDia.setEnabled(true);
            } else if (pestañaGerente.RBDia.isSelected() == false) {
                pestañaGerente.txtDia.setText("");
                pestañaGerente.txtDia.setEnabled(false);
            }

            /*  tiempPrice = 24.0;
            if (pestañaGerente.RBDia.isSelected() == true) {
                price += tiempPrice * 20;
            } else if (pestañaGerente.RBDia.isSelected() == false) {
                price -= tiempPrice * 20;
            }*/
        }

        if (e.getSource().equals(pestañaGerente.RBSemana)) {
            if (pestañaGerente.RBSemana.isSelected() == true) {
                pestañaGerente.txtSemana.setEnabled(true);
            } else if (pestañaGerente.RBSemana.isSelected() == false) {
                pestañaGerente.txtSemana.setText("");
                pestañaGerente.txtSemana.setEnabled(false);
            }
            /**
             * tiempPrice = 7.0 * 24.0; if (pestañaGerente.RBSemana.isSelected()
             * == true) { price += tiempPrice * 20; } else if
             * (pestañaGerente.RBSemana.isSelected() == false) { price -=
             * tiempPrice * 20; }
             */
        }
        if (e.getSource().equals(pestañaGerente.RBMes)) {
            if (pestañaGerente.RBMes.isSelected() == true) {
                pestañaGerente.txtMes.setEnabled(true);
            } else if (pestañaGerente.RBMes.isSelected() == false) {
                pestañaGerente.txtMes.setText("");
                pestañaGerente.txtMes.setEnabled(false);
            }
            /**
             * tiempPrice = 31.0 * 24; if (pestañaGerente.RBMes.isSelected() ==
             * true) { price += tiempPrice * 20; } else if
             * (pestañaGerente.RBMes.isSelected() == false) { price -=
             * tiempPrice * 20; }
             */
        }
        if (e.getSource().equals(pestañaGerente.RBAño)) {
            if (pestañaGerente.RBAño.isSelected() == true) {
                pestañaGerente.txtAño.setEnabled(true);
            } else if (pestañaGerente.RBAño.isSelected() == false) {
                pestañaGerente.txtAño.setText("");
                pestañaGerente.txtAño.setEnabled(false);
            }
            /*tiempPrice = 365.0 * 24.0;
           if(pestañaGerente.RBAño.isSelected()== true){
              price += tiempPrice * 20; 
           }else if(pestañaGerente.RBAño.isSelected()==false){
              price -= tiempPrice * 20;
           }*/
        }

        if (e.getSource().equals(pestañaGerente.btConfirt)) {
            JTextField[] datos = {pestañaGerente.txtDia, pestañaGerente.txtSemana, pestañaGerente.txtMes, pestañaGerente.txtAño};
            JRadioButton[] radio = {pestañaGerente.RBDia, pestañaGerente.RBAño, pestañaGerente.RBMes, pestañaGerente.RBSemana};
            boolean ver = true;
            for (JRadioButton x : radio) {
                if (x.isSelected() == true && x.equals(pestañaGerente.RBDia)) {
                    if (!datos[0].getText().isEmpty()) {
                        ver = false;
                        price = 24.0;
                        tiempPrice += (Double.parseDouble(datos[0].getText()) * price) * 3;
                    } else {
                        JOptionPane.showMessageDialog(pestañaGerente, "Ingrese un dato");
                        break;
                    }
                }
                if (x.isSelected() == true && x.equals(pestañaGerente.RBAño)) {
                    System.out.println("hola");
                    if (!datos[3].getText().isEmpty()) {
                        ver = false;
                        price = 134 * 24.0;
                        tiempPrice += (Double.parseDouble(datos[3].getText()) * price) * 3;
                    } else {
                        JOptionPane.showMessageDialog(pestañaGerente, "Ingrese un dato");
                        break;
                    }
                }
            }
            if (!ver) {
                pestañaGerente.jDialogDate.setVisible(false);
                pestañaGerente.lblMessage.setText(tiempPrice.toString());
                tiempPrice = 0.0;
            }
        }
    }

}
