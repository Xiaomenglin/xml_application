class MyList{
	private int data;
	private MyList next;
	
	public MyList(int x){
		data=x;
	}
	public void add(MyList x){//插入
		x.next=next;//x指向head所指向的的对象
		next=x;//head指向x
	}
	public void append(MyList x){
		MyList p=this;
		while(p.next!=null){
			p=p.next;
		}
		p.next=x;
	}
	public void show(){
		MyList p=this;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}
	}
}
public class Day081201{
	public static void main(String[] args){
		MyList head=new MyList(10);
		head.append(new MyList(30));
		head.append(new MyList(40));
		head.append(new MyList(50));
		head.append(new MyList(60));
		head.add(new MyList(20));
		head.show();

	}
}