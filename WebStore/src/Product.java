import java.io.Serializable;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private double productPrice;
	
	
	public Product(String productId, String productName, double productPrice) {
		notNull(productName, "Method called with null parameter");
        notNull(productPrice, "Method called with null parameter");
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	//all the getter and setter
	//to string
	//and other functions if required
	

}
