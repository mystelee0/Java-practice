class Product
{
	int price;
	int bonusPoint;

	Product(int price)
	{
	this.price=price;
	bonusPoint=(int)(price/10.0);
	}
	Product()
	{
	price=0;
	bonusPoint=0;
	}
}
class Tv extends Product{
	Tv(){
	super(100);
	}
	public String toString(){
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
	super(200);
	}
	public String toString(){
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
	super(50);
	}
	public String toString(){
		return "Audio";
	}
}
class Buyer{
	int money=1000;
	int bonusPoint=0;
	Product[] item=new Product[10];
	int i=0;
	
	void buy(Product p){
	if(money<p.price){
	System.out.println("잔액 부족");
	return ;
	}
	money-=p.price;
	bonusPoint+=p.bonusPoint;
	item[i++]=p;
	System.out.println(p+"를 구매했습니다.");
	}
	void summary(){
	int sum=0;
	String itemList="";

	for(int i=0;i<item.length;i++){
		if(item[i]==null) break;
		sum+=item[i].price;
		itemList+=(i==0) ? " " +item[i] : ", "+item[i] ;
	}
	System.out.println("구입하신 물품의 총 금액은" + sum+"입니다.");
	System.out.println("구입하신 제품은 " +itemList+"입니다.");
	}
	
}

class PolyArgumentTest{
	public static void main(String[] args){
	Buyer b=new Buyer();
	Tv tv= new Tv();
	Computer computer=new Computer();
	Audio audio=new Audio();
	b.buy(tv);
	b.buy(computer);
	b.buy(audio);
	b.summary();
	}
}