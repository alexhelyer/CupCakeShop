/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.data;

import java.util.List;

/**
 *
 * @author alejandro
 */
public class OrdenData {
    
    String id;
    ClienteData cliente;
    VendedorData vendedor;
    CocinaData cocina;
    List<CupCakeData> cupcakes;
    StatusData status;
    CobroData cobro;
    PagoData pago;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClienteData getCliente() {
        return cliente;
    }

    public void setCliente(ClienteData cliente) {
        this.cliente = cliente;
    }

    public VendedorData getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorData vendedor) {
        this.vendedor = vendedor;
    }

    public CocinaData getCocina() {
        return cocina;
    }

    public void setCocina(CocinaData cocina) {
        this.cocina = cocina;
    }

    public List<CupCakeData> getCupcake() {
        return cupcakes;
    }

    public void setCupcake(List<CupCakeData> cupcake) {
        this.cupcakes = cupcake;
    }

    public StatusData getStatus() {
        return status;
    }

    public void setStatus(StatusData status) {
        this.status = status;
    }

    public CobroData getCobro() {
        return cobro;
    }

    public void setCobro(CobroData cobro) {
        this.cobro = cobro;
    }

    public PagoData getPago() {
        return pago;
    }

    public void setPago(PagoData pago) {
        this.pago = pago;
    }
    
    
    
    
    
    
}
