package controlador;

import sv.Access;
import sv.Access_Service;
import sv.User;
import vista.Transaccion;

public class TransaccionCtrl {

    public Transaccion transs = new Transaccion();
    Access_Service service = new Access_Service();
    Access cliente = service.getAccessPort();
    User user;

    TransaccionCtrl(User user) {
        this.user = user;
        transs.lblNombreUser.setText("Cuenta de usuario: " + user.getUsername());
        transs.txtSaldoCu.setText(String.valueOf(user.getBalance()));
        transs.btnTransaccion.addActionListener(l -> proceso());
        transs.btnRegresar.addActionListener(l -> back());
        transs.setLocationRelativeTo(null);
        transs.setVisible(true);
    }
    
    private void proceso() {
        if (transs.opcionBox.getSelectedItem().toString().equals("Seleccionar")) {
            transs.lblValTransaccion.setText("Seleccione la operacion");
        } else if (transs.opcionBox.getSelectedItem().toString().equals("Deposito")) {
            User update = cliente.update(user.getUsername(),
                    Integer.parseInt(transs.txtValor.getText()), true);
            if (update != null) {
                transs.lblValTransaccion.setText("Operación realizado");
                transs.txtSaldoCu.setText(String.valueOf(update.getBalance()));
            } else {
                transs.lblValTransaccion.setText("Saldo insuficiente");
            }
        } else {
            User update = cliente.update(user.getUsername(),
                    Integer.parseInt(transs.txtValor.getText()), false);
            if (update != null) {
                transs.lblValTransaccion.setText("Operación realizado");
                transs.txtSaldoCu.setText(String.valueOf(update.getBalance()));
            } else {
                transs.lblValTransaccion.setText("Saldo insuficiente");
            }
        }
    }
    
    public void back(){
        AccesoCtrl acc = new AccesoCtrl();
        transs.dispose();
    }

}
