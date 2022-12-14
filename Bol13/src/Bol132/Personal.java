/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bol132;

/**
 *
 * @author dam1
 */
public class Personal {
    String telefono;
    String correo;

    public Personal() {
    }

    public Personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
@Override
    public String toString() {
        return "Personal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
}
