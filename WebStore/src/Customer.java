
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_password")
	private String customerPassword;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	public Customer(String customerId, String customerName,
			String customerPassword, String customerAddress) {	
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerAddress = customerAddress;
	}

	//all the getter and setter
	//to string
	//and other functions if required

}
