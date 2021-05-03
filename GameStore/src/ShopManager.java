import java.util.ArrayList;

public class ShopManager implements IBaseManager {

	ArrayList<Game>gameonchart=new ArrayList<Game>();
	@Override
	public void add(Game game) {
		gameonchart.add(game);
		System.out.println(game.getName()+" Maðazaya Eklendi");
		
	}
	@Override
	public void delete(Game game) {
		for(int i=0;i<gameonchart.size();i++) {
			if(gameonchart.get(i).getStorecode()==game.getStorecode()) {
				gameonchart.remove(i);
			}
			
		}
		
	}
	@Override
	public void update(Game game) {
		for(int i=0;i<gameonchart.size();i++) {
			if(gameonchart.get(i).getStorecode()==game.getStorecode()) {
				gameonchart.get(i).setPrice(game.getPrice());
				gameonchart.get(i).setName(game.getName());
				
			}
			
		}
		
	}
	
	
	
}
