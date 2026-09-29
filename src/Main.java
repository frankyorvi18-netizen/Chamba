import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int trabajadores;
        int productos;
        String texto=JOptionPane.showInputDialog(null, "cantidad de trabajdores ");
        trabajadores=Integer.parseInt(texto);
        String texto2=JOptionPane.showInputDialog(null, "cantidad de productos ");
        productos=Integer.parseInt(texto2);
        try {
           int resultado=productos/trabajadores;
            JOptionPane.showMessageDialog(null , "resultado : "+ resultado);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "nose puede dividir", "error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "el sistema sigue funcionando");
    }
}