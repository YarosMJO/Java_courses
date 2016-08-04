package Dawn_of_the_dragons;

public class Fire_Dragon implements Being{
private String name;
public Fire_Dragon(final String name){
	this.name=name;
}
@Override
public void makeSound() {
	System.out.println("Aru -uhu -arrrr!");
	
}

@Override
public String getName() {
	
	return this.name;
}

@Override
public void setName(String name) {
	this.name =name;
	
}
}
