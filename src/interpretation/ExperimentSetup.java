package interpretation;

import java.util.List;

public class ExperimentSetup {
	List<Ressource> resources;
	List<ClassifierSetup> setups;
	
	public void addResource(Ressource resource) {
		resources.add(resource);
	}
	
	public void addClassifierSetup(ClassifierSetup setup) {
		setups.add(setup);
	}
}