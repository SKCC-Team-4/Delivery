
package BookStore;

public class PayApproved extends AbstractEvent {

    private Long id;
    private Long order_id;
    private String status;
    private Date payment_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return order_id;
    }

    public void setOrderId(Long order_id) {
        this.order_id = order_id;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Date getPaymentDate() {
        return payment_date;
    }

    public void setPaymentDate(Date payment_date) {
        this.payment_date = payment_date;
    }
}
