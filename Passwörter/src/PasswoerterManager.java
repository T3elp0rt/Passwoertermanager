
public class PasswoerterManager {

	List<Passwort> Liste = new List<Passwort>();
	Passwort pass = new Passwort();
	
	public void Start() {
		System.out.print("Website: ");
		String Website = System.console().readLine();
	}
	public void addList() {
		Passwort pPass = new Passwort();
		
		Liste.append(pPass);
	}
	
}
