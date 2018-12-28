package design.zhaowd.½á¹¹.adapter;

/**
 * 
 * Person-->adapter-->user
 * @author Administrator
 *
 */
public class Adapter {
	Person p;
	
	Adapter(Person p){
		this.p = p;
	}
	
	public User conver() {
		
		return new User(p.getPersonMsg().get("userName"), p.getPersonMsg().get("passward"));
	}
}
