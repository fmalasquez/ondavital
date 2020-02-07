
package ejerciciopact;

class Factura {
    private int codigo;
    private double sub_total;
    private double total;

     public Factura() {
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        System.out.println("seteando el subtotal   "+sub_total);
        this.sub_total = sub_total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        System.out.println("seteando el total    "+ total);
        this.total = total;
    }

    public Factura(int codigo, double sub_total) {
        this.codigo = codigo;
        this.sub_total = sub_total;
      
    }
    public void calculartotal(){
        this.total=this.sub_total*1.18;
    }
  
}
