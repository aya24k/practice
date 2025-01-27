public abstract class TangibleAsset extends Asset implements Thing{
	
	
	private int price;
	private String color;
	private double weight;	
	
	public TangibleAsset(String name,int price ,String Color{
   		this.name =name;
    		this.price=price;
    		this.color=color;
  	}
	
	//メソッド
	
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
	public double getWeight() {return this.weight;}
	
	public void setPrice(int p) {this.price=p;}
	public void setColor(String c) {this.color=c;}
	public void setWeight(double d) {this.weight=d;}		


}
