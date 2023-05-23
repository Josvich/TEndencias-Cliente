package controlador;

import sv.Access;
import sv.Access_Service;
import vista.Acceso;
import vista.Registro;


public class RegistroCtrl {
    
    Registro register = new Registro();
    Access_Service service = new Access_Service();
    Access cliente = service.getAccessPort();
    
    public RegistroCtrl() {
        register.btnRegistrar.addActionListener(l -> sigup());
        register.setLocationRelativeTo(null);
        register.setVisible(true);
    }
    
    public void sigup(){
        boolean enter = cliente.singUp(register.txtUsuario.getText(), register.txtContraseña.getText(), 
                Integer.parseInt(register.txtSaldo.getText()));
         if (enter == false) {
            register.lblValRegistro.setText("Usuario existente");
        } else {
            AccesoCtrl reg = new AccesoCtrl();
            register.dispose();
        }
       
    }
}
