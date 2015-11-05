@Entity
@Table(name = "ORDER")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private String orderId;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "product_id")
	private String productId;
	public Order(String orderId, String customerId, String productId) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
	}
	public String getOrderId() {
		return orderId;
	}
	//all the getter and setter
	//to string
	//and other functions if required
	
	

}
