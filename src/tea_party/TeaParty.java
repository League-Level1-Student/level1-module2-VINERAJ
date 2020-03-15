package tea_party;

public class TeaParty {
	public String name;
	public boolean isWoman;
	public boolean isKnighted;
    public String welcome(String name, boolean isWoman, boolean isKnighted){
    	if(isWoman==true&&isKnighted==true) {
    		return "Hello Lady " + name;
    	}
    	else if(isWoman==false&&isKnighted==true) {
    		return "Hello Sir " + name;
    	}
    	else if(isWoman==true&&isKnighted==false) {
    		return "Hello Ms. " + name;
    	}
    	else {
    		return "Hello Mr. " + name;
    	}
}

}

