package Entidad;

public class VentaEntradas {

    private int salaPrincipal;
    private int compraVenta;
    private int vip;
    private int entradasVendidas;
    private int entradasPorVender;

    public VentaEntradas() {
         salaPrincipal = 1000;
        compraVenta = 200;
        vip = 25;
    }

    public VentaEntradas(int salaPrincipal, int compraVenta, int vip, int entradasVendidas, int entradasPorVender) {
        this.salaPrincipal = salaPrincipal;
        this.compraVenta = compraVenta;
        this.vip = vip;
        this.entradasVendidas = entradasVendidas;
        this.entradasPorVender = entradasPorVender;
    }

    public int getSalaPrincipal() {
        return salaPrincipal;
    }

    public void setSalaPrincipal(int salaPrincipal) {
        this.salaPrincipal = salaPrincipal;
    }

    public int getCompraVenta() {
        return compraVenta;
    }

    public void setCompraVenta(int compraVenta) {
        this.compraVenta = compraVenta;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void setEntradasPorVender(int entradasPorVender) {
        this.entradasPorVender = entradasPorVender;
    }
    
    

}
