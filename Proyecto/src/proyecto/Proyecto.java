/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;
public class Proyecto {

    public static void main(String[] args) {
 
Registro registro1=new Registro();      
registro1.mostrarMenu(0, 0, 0);
registro1.mostrarProductos();
int opcion;
    String salir = "no";
    while (salir.equalsIgnoreCase("no")){do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a Super Mercado los Pollitos!!\n\n1. Registro\n 2.Ingresar Mercaderia \n 3. Editar Precio \n 4. Inventario Completo \n. 5 Salir"));
        switch (opcion){
        case 1:
            JOptionPane.showMessageDialog(null,"Registro");
            break;
       case 2:
            JOptionPane.showMessageDialog(null,"Ingresar Mercaderia");
            break; 
        case 3:
            JOptionPane.showMessageDialog(null,"Editar Precios");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Ver Inventario Completo");
            break;
        case 5:
            salir = JOptionPane.showInputDialog(null,"Desea salir del menu?");
            JOptionPane.showMessageDialog(null,"Salir");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
           
        }
    }while(opcion<1||opcion>6);}
    

int ingresar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Mercaderia\n\n1. Ver Categorias \n2. Ver Marcas \n3. Ver Productos \n4. Salir"));
     
    switch (ingresar){
        case 1:
            JOptionPane.showInputDialog(null,"Ver Categorias");
            break;
        case 2:
            JOptionPane.showInputDialog(null,"Ver Marcas");
            break;
        case 3:
            JOptionPane.showInputDialog(null,"Ver Productos");
            break;
        case 4:
            JOptionPane.showInputDialog(null,"Salir");
        default:
            JOptionPane.showInputDialog(null,"La Categoria/Marca/Producto No Existe");
     }


int editar = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\n1. Ver Lista de Categorias \n2. Ver Lista de Marcas \n3. Ver Lista de Productos \n4. Salir"));   

    switch (editar){
        case 1:
            JOptionPane.showInputDialog(null,"Ver Lista de Categorias");
            break;
        case 2:
            JOptionPane.showInputDialog(null,"Ver Lista de Marcas");
            break;
        case 3:
            JOptionPane.showInputDialog(null,"Ver Lista de Productos");
            break;
        case 4:
            JOptionPane.showInputDialog(null,"Salir");
            break;
        default:
            JOptionPane.showInputDialog(null,"La Categoria/Marca/Productos No Existe");
        
    }
    
int inventario = Integer.parseInt(JOptionPane.showInputDialog(null,"n\n1. Ver Lista de Categorias \n2. Ver Lista de Marcas \n3. Ver Lista de Productos \n4. Salir"));

    switch (inventario){
        case 1:
            JOptionPane.showInputDialog(null,"Ver Lista de Categorias");
            break;
        case 2:
            JOptionPane.showInputDialog(null,"Ver Lista de Marcas");
            break;
        case 3:
            JOptionPane.showInputDialog(null,"Ver Lista de Productos");
            break;
        case 4:
            JOptionPane.showInputDialog(null,"La Categotria/Marca/Productos No Existe");
    }

    }
    
}
