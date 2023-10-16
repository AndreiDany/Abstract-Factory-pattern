
public class CargoPlaneFactory implements Factory {
	
	public JetPlane createJetPlane() {
		JetPlane jetPlane = new JetPlane(4, 1000, 3);
		return jetPlane;
	};
	
	public PropulsionPlane createPropulsionPlane() {
		PropulsionPlane propulsionPlane = new PropulsionPlane(4, 1000, 3);
		return propulsionPlane;
	};
}
