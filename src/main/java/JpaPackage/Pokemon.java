package JpaPackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.type.StringNVarcharType;

@Entity
public class Pokemon {
	@Column
	@Id
	private  String name;
	@Column(nullable = false)
	private String type;
	@Column
	private int power;
	@Column
	//  private String color;
	
	@Enumerated(EnumType.STRING)
	public Color color;
	
    public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
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
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", power=" + power + ", color=" + color + "]";
	}
		
}
