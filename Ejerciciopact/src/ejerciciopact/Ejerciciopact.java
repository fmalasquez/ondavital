
package ejerciciopact;

public class Ejerciciopact {

    
    public static void main(String[] args) {
       //Factura ofac = new Factura(1,100);
       
       Factura ofac1 = new Factura();
       ofac1.setCodigo(2);
       ofac1.setSub_total(120);
       ofac1.calculartotal(); // se setea el total
       Double total=ofac1.getTotal(); // obtengo el total
        System.out.println("Total : "+total);
    }
    
}
