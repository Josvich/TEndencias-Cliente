package controlador;

import sv.Access;
import sv.Access_Service;
import sv.User;
import vista.Acceso;

public class AccesoCtrl {

    Acceso login = new Acceso();
    Access_Service service = new Access_Service();
    Access cliente = service.getAccessPort();

    public AccesoCtrl() {
        login.btnLoguin.addActionListener(l -> logIn());
        login.btnRegister.addActionListener(l -> signUp());
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private void logIn() {
        User user = cliente.login(login.txtUser.getText(), login.txtPassword.getText().trim());
        if (user == null) {
            login.lblValLoguin.setText("Usuario no existente");
        } else {
            login.lblValLoguin.setText("Credenciales correctas");
            TransaccionCtrl sign = new TransaccionCtrl(user);
            login.dispose();
        }
    }

    private void signUp() {
        RegistroCtrl sigUp = new RegistroCtrl();
        login.dispose();
    }
}

//class Test {
//    public static void main(String[] args) {
//        AccesoCtrl acc = new AccesoCtrl();
//    }
//}
