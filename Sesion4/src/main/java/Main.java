import models.Circle;
import models.Calculadora;
import models.Cuenta;
import models.Serie;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido");
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        Circle circle = new Circle(radio);
        Calculadora calc = new Calculadora();
        JOptionPane.showMessageDialog(null, "El área del círculo es " + calc.calcularArea(circle));


        Cuenta cuenta = new Cuenta("Silvio", 1000);
        cuenta.ingresar(500);
        cuenta.retirar(300);
        JOptionPane.showMessageDialog(null, "Cuenta: " + cuenta.toString());


        Serie serie = new Serie("Stranger Things", 4, "Ciencia Ficción", "Los Hermanos Duffer");
        JOptionPane.showMessageDialog(null, "Serie: " + serie.toString());
    }
}
