package Lesson1.Invoice;

public class InvoiceItem {
    private String partNumer; //нам нужно в классовой системе присвоить ид
    private String description; // для описания ид
    private int count; // счетчик
    private double unitPrice;//цена

    public InvoiceItem(String partNumer, String description, int count, double unitPrice) {
        this.partNumer = partNumer;
        this.description = description;
        this.count = count;
        this.unitPrice = unitPrice;
    }

    public String getPartNumer() {
        return partNumer;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {

        return String.format("%s '%-15.15s' count =%3d*%05.2f=",partNumer,description,count,unitPrice,count*unitPrice);
        //%s - строковой
        //%d - целый
        //%f - плавающая точка
        // - левое выравнивание
        //15.15 максимальная длина поля и точность
        /*
        return "partNumer='" + partNumer + '\'' +
                ", description='" + description + '\'' +
                ", count=" + count +
                ", unitPrice=" + unitPrice;

         */
    }
}
