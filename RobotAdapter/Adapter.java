
public class Adapter implements Spieler{

	Robot Robb; 
	
	Adapter(Robot r){
		this.Robb = r;
	}
	@Override
	public int geheNachLinks(int a) {
		
		double x = Robb.getX() - a;
		double y = Robb.getY();
	    Robb.rolleNach(x - a, y);
		return (int) x;
	}

	@Override
	public int geheNachRechts(int a) {
		
		double x = Robb.getX() + a; 
		double y = Robb.getY(); 
	    Robb.rolleNach(x, y);
		return (int) x;
	}

	@Override
	public int geheNachOben(int a) {
		
		double x = Robb.getX();
		double y = Robb.getY() + a; 
		Robb.rolleNach(x, y + a);
		return (int)y;
	}

	@Override
	public int geheNachUnten(int a) {
		
		double x = Robb.getX();
		double y = Robb.getY() - a;
		Robb.rolleNach(x,y);
		return (int) y;
	}
	
}
