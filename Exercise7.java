//자바의정석 314p 연습문제 7-1, 7-2
class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck()
	{
		for(int i=0;i<20;i++)
		{
			if(i<10&&(i==0||i==2||i==7))
				cards[i]=new SutdaCard(i%10+1,true);
			
			else
				cards[i]=new SutdaCard(i%10+1,false);
		
		}
	}
	void shuffle(){ //두개를 랜덤으로 지정해서 서로 바꾼다
		SutdaCard temp=new SutdaCard();
		int a,b;
		for(int i=0;i<CARD_NUM;i++)
		{
			a=(int)(Math.random()*100)%20;
			b=(int)(Math.random()*100)%20;
			temp=cards[a];
			cards[a]=cards[b];
			cards[b]=temp;
		}
	}
	SutdaCard pick(int index){
		return cards[index];
	}
	SutdaCard pick(){
		return cards[(int)(Math.random()*100)%20];	
	}
}

class SutdaCard{
	final int num;
	final boolean isKwang;

	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public String toString(){
		return num+(isKwang ? "K":"");
	}
}

class Exercise7{
	public static void main(String[] args){
		SutdaDeck deck =new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());

		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+","); //초기화된 카드배열
		System.out.println();
		deck.shuffle();  //섞는다

		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+","); //섞어진 카드 배열

		System.out.println();
		System.out.println(deck.pick(0));
	}
}