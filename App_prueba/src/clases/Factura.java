/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author l11m14
 */

public class Factura {
    private int codigo;
    private double subtotal;
    private double total;
    

    public Factura() {
    }

    public Factura(int codigo, double subtotal, double total) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double hallartotal(){
        double total=0;
        total=subtotal*1.18;
        return total;
    }
      public static void main(String args[])
	{
		int max=10;
		int j=1,k=0;
 
		// primer arbol
 
		System.out.println();
		for(int i=0;i<=max;i+=2)
		{
			int spc=(5+(int)Math.ceil(max/2)-j);
			String spaces=new String(new char[spc]).replace("\0"," ");
			String asteri=new String(new char[i+1]).replace("\0","*");
			System.out.println(spaces+asteri);
			j++;
		}
		if(max>=5)
		{
			int spc=(5+(int)Math.ceil(max/2)-2);
			String spaces=new String(new char[spc]).replace("\0"," ");
			String asteri=new String(new char[3]).replace("\0","*");
			System.out.println(spaces+asteri);
			System.out.println(spaces+asteri);
		}
		System.out.println();
 
		
    
        }
     
 
}

    
