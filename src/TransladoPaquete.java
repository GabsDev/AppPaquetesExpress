
public class TransladoPaquete {

    private String NumRefencia;
    private double ValorPaq;
    private int TipoPaq;
    private double PesoPaq;
    private double DistanciaPaq;

    public TransladoPaquete() {

        this.NumRefencia = "";
        this.ValorPaq=0;
        this.TipoPaq = 0;
        this.PesoPaq = 0;
        this.DistanciaPaq = 0;

    }

     /**
     * @return the NumRefencia
     */
    public String getNumRefencia() {
        return NumRefencia;
    }

    /**
     * @param NumRefencia the NumRefencia to set
     */
    public void setNumRefencia(String NumRefencia) {
        this.NumRefencia = NumRefencia;
    }

    /**
     * @return the TipoPaq
     */
    public int getTipoPaq() {
        return TipoPaq;
    }

    /**
     * @param TipoPaq the TipoPaq to set
     */
    public void setTipoPaq(int TipoPaq) {
        this.TipoPaq = TipoPaq;
    }

    /**
     * @return the PesoPaq
     */
    public double getPesoPaq() {
        return PesoPaq;
    }

    /**
     * @param PesoPaq the PesoPaq to set
     */
    public void setPesoPaq(double PesoPaq) {
        this.PesoPaq = PesoPaq;
    }

    /**
     * @return the ValorPaq
     */
    public double getValorPaq() {
        return ValorPaq;
    }

    /**
     * @param ValorPaq the ValorPaq to set
     */
    public void setValorPaq(double ValorPaq) {
        this.ValorPaq = ValorPaq;
    }

    /**
     * @return the DistanciaPaq
     */
    public double getDistanciaPaq() {
        return DistanciaPaq;
    }

    /**
     * @param DistanciaPaq the DistanciaPaq to set
     */
    public void setDistanciaPaq(double DistanciaPaq) {
        this.DistanciaPaq = DistanciaPaq;
    }

    public double costoPeso() {

        double costoPeso = 0;
        int i;
        if ((int)this.getPesoPaq() <= 20) {
            for (i = 1; i <= (int)this.getPesoPaq(); i++) {
                costoPeso = 15 * i;
            }
        }
        if ((int)this.getPesoPaq() > 20 && (int)this.getPesoPaq() <= 50) {
            for (i = 1; i <= 20; i++) {
                costoPeso = 15 * i;
            }

            for (i = 20; i <= (int)this.getPesoPaq(); i++) {
                costoPeso = 10 * i;
            }
        }

        if ((int)this.getPesoPaq() > 50) {
            for (i = 1; i <= (int)this.getPesoPaq(); i++) {
                costoPeso = 5 * i;
            }
        }
        return costoPeso;
    }

    public double costoDistancia() {

        double costoDistancia = 0;
        int i;

        if ((int)this.getDistanciaPaq() <= 100) {
            for (i = 1; i <= this.getDistanciaPaq(); i++) {
                costoDistancia = 0.85f * i;
            }
        }
        if ((int)this.getDistanciaPaq() > 100) {

            for (i = 1; i <= 100; i++) {
                costoDistancia = 0.85f * i;
            }

            for (i = 100; i <=(int)this.getDistanciaPaq(); i++) {
                costoDistancia = 1.7f * i;

            }

        }
        return costoDistancia;
    }

    public int costoTipoPaq() {

        int costoTipoPaq = 0, i;

        if (this.getTipoPaq() == 1) {

            for (i = 1; i <= (int)this.getPesoPaq(); i++) {
                costoTipoPaq = i;
            }
        }

        return costoTipoPaq;
    }

    public double costoAduana() {

        double costoAduana = 0;

        costoAduana = 0.15f * this.getValorPaq();
        
        return costoAduana;
}

    public double subtotalAPagar() {

        double subtotal = 0;

        subtotal = this.costoPeso() + this.costoDistancia() + this.costoTipoPaq() + this.costoAduana();

        return subtotal;
    }

   public double descuento() {

        double descuento = 0;
        descuento =((int)this.getValorPaq()>100)?0.10f*this.subtotalAPagar():0.05f*this.subtotalAPagar();
        
        return descuento;
    }

    
    
    public double totalAPagar(){
    
        double costoTotal=0;
        
        costoTotal= this.subtotalAPagar()-this.descuento();
        
        return costoTotal;
    }
    
    public int totalColones(){
    
    double colones=0;
    
    colones=this.totalAPagar()*591;
    return (int) colones;
    
    }

  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
