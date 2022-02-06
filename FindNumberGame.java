import java.util.Scanner;

class FindNumberGame{
public static void main(String[] args)
{
int answer=(int)(Math.random()*100+1);
int input=0;
int count=0; //사용자 입력 시도횟수

Scanner s=new Scanner(System.in);
do{
count++;
System.out.print("1~100 수 입력 : ");
input=s.nextInt();
if(input<answer)
System.out.println("Up!");
else if(input>answer)
System.out.println("Down!");
else{
System.out.println("시도 횟수  : "+count);
System.out.println("정답입니다. 정답 : "+answer);
break;
}
}
while(true);

}
}