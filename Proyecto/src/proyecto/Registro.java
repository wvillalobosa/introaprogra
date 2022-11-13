/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;
public class Registro {

public String[] productos;
public String[] marca;
public String[] categoria;

//Constructor
public Registro (){
    this.productos = new String[100];
    this.marca = new String[100];
    this.categoria = new String[100]; 
}
 
public String[] getProductos(){
    return productos;
}

public String[] getMarca(){
    return marca;
}

public String[] getCategoria(){
    return categoria;
}

public void mostrarMenu(int ContProd, int ContMarc, int ContCate){
    String salir = "no";
    int registro;
    while (salir.equalsIgnoreCase("no")){
      do {
      registro = Integer.parseInt(JOptionPane.showInputDialog(null, "Registro \n\n1. Registrar Nuevos Productos \n2. Registrar Una Marca \n3. Registrar Una Categoria \n4. Salir "));
      switch (registro){
        case 1: 
            JOptionPane.showMessageDialog(null, "Registrar Nuevos Prodcutos:");
            productos[ContProd]=JOptionPane.showInputDialog("Ingrese el producto a registrar:");
            break;
        case 2:
            JOptionPane. showMessageDialog(null,"Registrar Una Marca");
            marca[ContMarc]=JOptionPane.showInputDialog("Ingrese la marca a registrar:");
            break;
        case 3: 
            JOptionPane. showMessageDialog(null,"Registrar Una Categoria");
            categoria[ContCate]=JOptionPane.showInputDialog("Ingrese la categoria a registrar:");
            break;
        case 4:
            salir = JOptionPane.showInputDialog(null,"Salir");
            break;
         default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta, Digite Una Correcta");
      }} while (registro<1||registro>4);  
}}

public void mostrarProductos(){
    for (int i = 0;i<productos.length;i++){
    JOptionPane.showMessageDialog(null, productos [i]+marca[i]+categoria[i]);
}
}
}
    
    
  