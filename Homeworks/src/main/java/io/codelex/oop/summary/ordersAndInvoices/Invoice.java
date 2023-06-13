package io.codelex.oop.summary.ordersAndInvoices;

import java.text.DecimalFormat;

public class Invoice {
    private static final double VAT_RATE = 0.21;

    private Order order;
    private String invoiceNumber;
    private InvoiceStatus status;


    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("You can not add EMPTY ORDER!!!!");
        }
        this.order = order;
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    public String generateInvoiceText() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double totalPrice = order.getItems().stream().mapToDouble(SellableThing::getPrice).sum();
        double vatAmount = totalPrice * VAT_RATE;
        double totalAmount = totalPrice + vatAmount;

        sb.append("===================================================\n");
        sb.append(String.format("= INVOICE NUMBER: %-32s=\n", invoiceNumber));
        sb.append(String.format("= STATUS: %-40s=\n", status));
        sb.append("=                                                 =\n");

        int lineNumber = 1;
        for (SellableThing item : order.getItems()) {
            sb.append(String.format("= %d. %-45s=\n", lineNumber, item.getFullInfo()));
            lineNumber++;
        }

        sb.append(String.format("= SUM: %-43s=\n", decimalFormat.format(totalPrice) + " EUR"));
        sb.append(String.format("= VAT (21%%): %-37s=\n", decimalFormat.format(vatAmount) + " EUR"));
        sb.append(String.format("= TOTAL: %-41s=\n", decimalFormat.format(totalAmount) + " EUR"));
        sb.append("===================================================\n");

        return sb.toString();
    }

}

