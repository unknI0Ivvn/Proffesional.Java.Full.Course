package Lesson1;

import Lesson1.Invoice.Invoice;
import Lesson1.Invoice.InvoiceItem;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InvoiceTest {
    @Test

    //Напишите метод тестируший правильность вычисления суммы иновйма
    public void checkSum()
    {
        InvoiceItem[] i = new InvoiceItem[]{
                new InvoiceItem("abc123","Гвозди обойные",12,0.02),
                new InvoiceItem("cbd123","Молоток",1,4.5),
                new InvoiceItem("cee331","Изолента",3,.5)
        };

        Invoice invoice = new Invoice(i);
        assertEquals(6.24,invoice.calculate(),0.00001);
}
}
//public class TestRectangleArea {
//    @Test
//    public void testArea()