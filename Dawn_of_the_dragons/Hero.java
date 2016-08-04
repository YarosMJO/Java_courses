package Dawn_of_the_dragons;

public class Hero {
private String id;
private  Being being;
public Hero(String id,Being being){
	this.id=id;
	this.being=being;
	
}
	public Being getBeing() {
		return being;
	}

public void setBeing(Being being){
	this.being=being;
}

public void removeBeing(){
	this.being=null;
}
public String getId(){
	return id;
}
public void setId(String id){
	this.id=id;
}

}
