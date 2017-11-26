
public class Adapter extends Robot implements Spieler{

	@Override
	public int geheNachLinks(int a) {
		
		double x = this.getX();
		double y = this.getY();
		this.rolleNach(x - a, y);
		return 0;
	}

	@Override
	public int geheNachRechts(int a) {
		
		double x = this.getX(); 
		double y = this.getY(); 
		this.rolleNach(x + a, y);
		return 0;
	}

	@Override
	public int geheNachOben(int a) {
		
		double x = this.getX();
		double y = this.getY(); 
		this.rolleNach(x, y + a);
		return 0;
	}

	@Override
	public int geheNachUnten(int a) {
		
		double x = this.getX();
		double y = this.getY();
		this.rolleNach(x, y - a);
		return 0;
	}
	
}
