package cm.CM_ServerSideModel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commoditydetails")
public class CM_Model {

	private String cname;
	private String description;
	private Float cost;
	private Integer qty;
	private Date purchaseDate;
	
	public CM_Model() {
		
	}
	
	public CM_Model(String description, Float cost,Integer qty,Date purchaseDate) {
		
		this.description=description;
		this.cost=cost;
		this.qty=qty;
		this.purchaseDate=purchaseDate;
	}

	@Id
	public String getCname() {
		return cname;
	}

	
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "cost", nullable = false)
	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	@Column(name = "qty", nullable = false)
	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Column(name = "purchaseDate")
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	@Override
	public String toString() {
		return "Commodity {" + "cname="+ cname + "description=" +description+ 
				"Quantity="+qty+ "purchaseDate"+purchaseDate+"}";
	}
}
