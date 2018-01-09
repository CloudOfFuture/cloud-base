package com.kunlun.entity;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class TicketSnapshot extends Ticket {

    private static final long serialVersionUID = -5591916037509019603L;
    /**
     * 优惠券id
     */
    private Long ticketId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
}
