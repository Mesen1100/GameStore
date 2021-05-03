import java.util.ArrayList;

public class Gamer{
	
	ArrayList<Game>games=new ArrayList<Game>();
	private long ID;
	private String name;
	private String nickname;
	private String password;
	private double wallet;
	
	public Gamer() {
		
	}
	
	public Gamer(long iD, String name, String nickname, String password, double wallet) {
		super();
		ID = iD;
		this.name = name;
		this.nickname = nickname;
		this.password = password;
		this.wallet = wallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public long getID() {
		return ID;
	} 
	public void gamebag() {
		for(int i=0;i<games.size();i++) {
			System.out.println(games.get(i).toString());
		}
	}

	

}
