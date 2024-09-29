import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Banco {

    private ArrayList<Cuenta> cuentas;

    public Banco() {
       cuentas = new ArrayList<Cuenta>();
    }

    public CuentaCorriente abrirCuentaCorriente(int dni, double descubierto) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(300.00, dni, descubierto);
        cuentas.add(cuentaCorriente);
        return cuentaCorriente;
    }

    public CuentaDeAhorro abrirCajaDeAhorro(int dni) {
        CuentaDeAhorro cuentaDeAhorro = new CuentaDeAhorro(400, dni);
        cuentas.add(cuentaDeAhorro);
        return cuentaDeAhorro;
    }

    public double totalSaldoEnDescubierto() {
        double total = 0;
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaCorriente) {
                CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
                total += cuentaCorriente.getLimiteDescubierto();
            }
        }
        return total;
    } // devuelve la suma de los saldos de todas las cuentas corrientes que están en
      // descubierto,

    public void listarCuentas() {
        Collections.sort(cuentas, Comparator.comparingDouble(Cuenta::getSaldo));

        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.toString());
        }
    } // que muestra los datos de todas las cuentas del banco, ordenado por saldo de
      // manera ascendente.

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Abrir cuentas en el banco
        banco.abrirCuentaCorriente(12345678, 500);
        banco.abrirCajaDeAhorro(87654321);
        banco.abrirCuentaCorriente(56789123, 1000);

        // Agregar dinero a las cuentas y poner algunas en descubierto
        Cuenta cuenta1 = banco.abrirCuentaCorriente(11111111, 300);
        cuenta1.depositar(100);
        cuenta1.retirar(200); // Esta cuenta estará en descubierto

        // Listar las cuentas ordenadas por saldo
        banco.listarCuentas();

        Cuenta cuenta2 = banco.abrirCuentaCorriente(418682900, 7000);
        cuenta2.transferir(cuenta1, 3000);

        // Calcular el saldo total en descubierto
        System.out.println("Total en descubierto: " + banco.totalSaldoEnDescubierto());
    }
}
