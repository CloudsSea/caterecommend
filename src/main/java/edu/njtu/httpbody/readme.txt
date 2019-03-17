阿里云返回报文示例:
public abstract class AlipayResponse implements Serializable {
 private static final long   serialVersionUID = 5014379068811962022L;

    private String              code;
    private String              msg;
    private String              subCode;
    private String              subMsg;
    private String              body;
    private Map<String, String> params;

    public boolean isSuccess() {
        return StringUtils.isEmpty(subCode);
    }
}
public class AlipayCommerceCityfacilitatorVoucherBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4649388926538216194L;

	/**
	 * 查询到的订单信息列表
	 */
	@ApiListField("tickets")
	@ApiField("ticket_detail_info")
	private List<TicketDetailInfo> tickets;

	public void setTickets(List<TicketDetailInfo> tickets) {
		this.tickets = tickets;
	}
	public List<TicketDetailInfo> getTickets( ) {
		return this.tickets;
	}

}