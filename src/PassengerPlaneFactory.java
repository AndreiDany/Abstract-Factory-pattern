
public class PassengerPlaneFactory implements Factory {
	
	public JetPlane createJetPlane() {
		JetPlane jetPlane = new JetPlane(64, 100, 32);
		return jetPlane;
	};
	
	public PropulsionPlane createPropulsionPlane() {
		PropulsionPlane propulsionPlane = new PropulsionPlane(64, 100, 32);
		return propulsionPlane;
	};
}
