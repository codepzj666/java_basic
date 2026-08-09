package cn.codepzj;

public enum OrderStatus {
    ORDER_INIT(1),
    ORDER_PENDING(2),
    ORDER_PAIDSUCCESS(3),
    ORDER_PAIDFAILED(4),
    ORDER_CANCEL(5),
    ORDER_REFUND(6),
    ORDER_EXPIRED(7);

    private int status;

    OrderStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}
