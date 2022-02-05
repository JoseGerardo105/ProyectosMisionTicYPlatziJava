package Model;

/**
*
* @author Andres Mesa - Nairo Pérez
*/
public class Product {
   private String idProduct;
   private String description;
   private double value;
   private short stock;
   private byte stockMin;
   private float iva;
   public Product(){
       
   }
   public Product(String idProduct, String description,double value,short stock,byte stockMin,float iva){
       this.idProduct=idProduct;
       this.description=description;
       this.value=value;
       this.stock=stock;
       this.stockMin=stockMin;
       this.iva=iva;
   }
   public String getIdProduct() {
       return idProduct;
   }

   public String getDescription() {
       return description;
   }

   public double getValue() {
       return value;
   }

   public short getStock() {
       return stock;
   }

   public byte getStockMin() {
       return stockMin;
   }

   public float getIva() {
       return iva;
   }

   public void setIdProduct(String idProduct) {
       this.idProduct = idProduct;
   }

   public void setDescription(String description) {
       this.description = description;
   }

   public void setValue(double value) {
       this.value = value;
   }

   public void setStock(short stock) {
       this.stock = stock;
   }

   public void setStockMin(byte stockMin) {
       this.stockMin = stockMin;
   }

   public void setIva(float iva) {
       this.iva = iva;
   }
   public double calcValue(){
       return (value)+(value*(iva/100));
   }
   @Override
   public String toString() {
       return "Product{" + "code=" + idProduct + ", description=" + description + ", value=" + value + ", stock=" + stock + ", stockMin=" + stockMin + ", iva=" + iva + '}';
   }
  
}
