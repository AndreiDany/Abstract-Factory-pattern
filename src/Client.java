
public class Client {

	public static void main(String[] args) {
		
		Factory cargoFactory = new CargoPlaneFactory();
		
		JetPlane cargoJetPlane = cargoFactory.createJetPlane();

	}
}
