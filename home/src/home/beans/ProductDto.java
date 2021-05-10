package home.beans;

//DTO
//data transfer object
//포장용클래스
//DB의 1줄을 옮겨담을 수 있는 클래스

public class ProductDto {

	private String name;
	private String type;
	private int price;


	private int no;
	private String made;
	private String expire;
	
	public ProductDto() {
		super();
	}
	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", type=" + type + ", price=" + price + ", no=" + no + ", made=" + made
				+ ", expire=" + expire + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getExpire() {
		return expire;
	}
	public void setExpire(String expire) {
		this.expire = expire;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}
	
	
}
