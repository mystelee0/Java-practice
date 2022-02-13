class Unit{
	int x,y;

	Unit(){ this(1,1); }
	Unit(int x, int y){ this.x=x; this.y=y;}
	void move(int x, int y){
		System.out.println(this.x+","+this.y+"에서 "+x+","+y+"로 이동");
	}
	void stop() {
		System.out.println("멈춘다");
	}
}

class Marine extends Unit{
	void stimPack(){
		System.out.println("스팀팩~~");
	}
}
class Tank extends Unit{
	void changeMode(){
		System.out.println("시즈모드 변경");
	}
}
class Dropship extends Unit{
	void load(){System.out.println("탑승!");}
	void unload(){System.out.println("하차!");}
}

public class Main{
	public static void main(String[] args){
		Tank t=new Tank();
		Marine m=new Marine();

		t.move(4,5);
		m.move(3,4);
		t.stop();
		m.stop();
		t.changeMode();
		m.stimPack();
	}
}