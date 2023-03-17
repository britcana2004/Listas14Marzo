
package Modelo;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ListaModel {
   Queue<Clientes> ListaClientes = new LinkedList();
    
    public void EncolarCliente(String ape, String nom) {
        
        Clientes nuevoCliente = new Clientes(ape, nom);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO A LA LISTA");
    }
    
    public Queue ListarClientes(){
        
        return this.ListaClientes;
        
    }
    
    public void DesEncolar() {
        
        this.ListaClientes.poll();
    }
}

