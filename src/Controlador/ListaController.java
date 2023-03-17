
package Controlador;

import Modelo.Clientes;
import Modelo.ListaModel;
import Vista.frmListas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Queue;

public class ListaController implements ActionListener {
    frmListas VistaLista;
    ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        
        this.VistaLista.bttnAgregarCliente.addActionListener(this);
        this.VistaLista.bttnAtenderTodos.addActionListener(this);
        this.VistaLista.bttnIngresarCliente.addActionListener(this);
        
        
        //LEVANTAR A LA VISTA LISTA
        
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
        
    }
    
  
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.bttnIngresarCliente){
            
          this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(), this.VistaLista.txtNombre.getText());
            
          //TRAE LA LISTA CLIENTES DESDE EL MODELO
           Queue<Clientes> ListaLocal = this.ModeloLista.ListarClientes();
        
           
          //MOSTRAR DATOS DENTRO DEL TEXT AREA  
          String Cadena = "";
          for(Clientes MiListaClientes: ListaLocal) {
              
              Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
              this.VistaLista.txtListaClientes.setText(Cadena);
          }            
         
           
        }
        
    }
}
