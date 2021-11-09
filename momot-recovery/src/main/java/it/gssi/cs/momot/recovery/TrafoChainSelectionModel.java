package it.gssi.cs.momot.recovery;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import trafochainselection.Metamodel;
import trafochainselection.ModelTransformationRepository;
import trafochainselection.TrafochainselectionFactory;
import trafochainselection.TrafochainselectionPackage;
import trafochainselection.Transformation;
import trafochainselection.TransformationModel;

public class TrafoChainSelectionModel {
	
private static TrafoChainSelectionModel instance=null;
private TrafochainselectionFactory factory =null;
public static ModelTransformationRepository mymodel ;
private String path=null;


public TrafoChainSelectionModel(String path) {
	super();
	this.path = path;
	TrafochainselectionPackage.eINSTANCE.eClass();
	
    // Retrieve the default factory singleton
    this.factory= TrafochainselectionFactory.eINSTANCE;
    
    this.mymodel=factory.createModelTransformationRepository();
    
}

public static TrafoChainSelectionModel getInstance(String path) {
	 
	if (instance == null) {
         instance = new TrafoChainSelectionModel(path);
     }
	
	return instance;
	
}

public void addMM(String mmpath) {
	Metamodel mm=this.factory.createMetamodel();
	mm.setId(mmpath);
	this.mymodel.getMetamodels().add(mm);
}

public void addTrafo(String trafopath, Map<String, String> map) {
	Transformation trafo=this.factory.createTransformation();
	trafo.setId(trafopath);
	
	//trafo.setSrc();
	//trafo.setTarget();
	this.mymodel.getTransformations().add(trafo);
}

public  void persist() {
	
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();

    // create a resource
    Resource resource = resSet.createResource(URI
            .createURI(this.path));
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
    TransformationModel trafomodel = this.factory.createTransformationModel();
    trafomodel.setModelTransformationRepository(this.mymodel);
    resource.getContents().add(trafomodel);

    // now save the content.
    try {
        resource.save(Collections.EMPTY_MAP);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}


	
	
}
