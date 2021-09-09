import java.util.Random;
import java.util.Scanner;

public class PasswoerterManager {

	Random rng = new Random();
	List<Passwort> Liste = new List<Passwort>();
	Passwort pass = new Passwort();
	String gWeb;
	Passwort tPass;
	int gPass;
	String[] WebPages = {"Google","Netflix","Amazon","Instagram","Facebook","Twitch","Youtube","JudTube"};
	
	public void Start() {
		addList();
	}
	public void addList() {
		for(int i=0;i<10;i++) {
			Passwort pPass = new Passwort();
			gWeb = WebPages[rng.nextInt(WebPages.length)];
			System.out.println(gWeb);
			pPass.setWeb(gWeb);
			gPass = rng.nextInt(8000000)+1000000;
			pPass.setPass(gPass);
			Liste.append(pPass);
		}

		GibWebPage();
	}
	
    public void GibWebPage(){
    	System.out.print("Website: ");
    	Scanner web = new Scanner();
    	Liste.toFirst();
    	for(int i =0;i<10;i++) {
    		tPass = Liste.getContent();
    		if(tPass.getWeb() == web) {
    			System.out.println(tPass.getPass());
    			break;
    		}
    		Liste.next();
    	}
    }
	
}
