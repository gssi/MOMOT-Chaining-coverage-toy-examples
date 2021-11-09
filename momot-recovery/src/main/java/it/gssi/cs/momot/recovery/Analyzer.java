package it.gssi.cs.momot.recovery;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class Analyzer {
	
	public static void main(String []args) throws CoreException, URISyntaxException, IOException, SAXException {
		Path root;
		try {
		root = Paths.get(Analyzer.class.getResource("").toURI());
		
		Path modelsRoot = root.getParent().resolve(Analyzer.getRepoFolder(root+ "/settings.properties"));
		
		Path mmRoot = root.getParent().resolve("metamodels");
		
		genGraphEcore(modelsRoot, mmRoot);
		
		parseLaunchConfig(modelsRoot, mmRoot);
		
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	
	
	
	private static void parseLaunchConfig(Path modelsRoot, Path mmRoot) throws URISyntaxException, IOException, SAXException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

	      try {

	          // optional, but recommended
	          // process XML securely, avoid attacks like XML External Entities (XXE)
	          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

	          // parse XML file
	          DocumentBuilder db = dbf.newDocumentBuilder();
	          
	         
	          Iterator repoiterator = Files.list(modelsRoot).filter(path -> path.getFileName().toString().endsWith(".launch")).iterator();

	          while(repoiterator.hasNext()) {
	        		Path pf=(Path)repoiterator.next();
	        		Document doc = db.parse(URI.createFileURI(new File(modelsRoot.resolve(pf.getFileName()).toString()).getAbsolutePath()).toString());

	    	        
	  	          	doc.getDocumentElement().normalize();
	  	          	
	  	          	System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
	  	          	
	  	          	if(doc.getDocumentElement().getAttribute("type").equals("org.epsilon.etl.eclipse.dt.launching.EtlLaunchConfigurationDelegate")) {
	  	          		//ETL transformation launcher
	  	          	NodeList list = doc.getElementsByTagName("listAttribute");
		  	          
		  	          for (int temp = 0; temp < list.getLength(); temp++) {

			              Node node = list.item(temp);

			              if (node.getNodeType() == Node.ELEMENT_NODE ) {
			            	  
			            	  Element element = (Element) node;
			            	  if(element.getAttribute("key").equals("models")) {
			            		 
			            		  NodeList listentry = element.getElementsByTagName("listEntry")  ;
			            		  for (int templist = 0; templist < listentry.getLength(); templist++) {
			            			  
			            			  Node entrynode = listentry.item(templist);
			            			  if (entrynode.getNodeType() == Node.ELEMENT_NODE ) {
			            				  Node enode = (Element) entrynode;
			            				  //System.out.println(enode.getAttributes().getNamedItem("value").getTextContent());
			            				  //System.out.println("========");
			            				  Map<String, String> map = new HashMap<String, String>();
			            				  String configstring=  enode.getAttributes().getNamedItem("value").getTextContent();
			            				  //System.err.println(configstring);
			            				  List<String> fixedLenghtList = Arrays.asList((configstring.split("\n")));
			            				
			            				  for (String entry : fixedLenghtList) {
			            					  String[] mapstring=entry.split("=");
			            					  if(mapstring.length>1) {
			            						  
				            					  map.put(mapstring[0], mapstring[1]);

			            						  
			            					  }
			            				  }
			            				  
			            				  createMMNode(map.get("metamodelFile"));
			            			  }
			            			
			            		  }
			            	  }
			                  	
			                 
			              }
		  	          }
		  	          //create transformation node
		  	        NodeList trafolist = doc.getElementsByTagName("stringAttribute");
		  	      for (int temp = 0; temp < trafolist.getLength(); temp++) {

		              Node node = trafolist.item(temp);
		              
		              if (node.getNodeType() == Node.ELEMENT_NODE ) {
		            	  
		            	  Element element = (Element) node;
		            	  if(element.getAttribute("key").equals("source")) {
		            		  String trafo=(element.getAttribute("value"));
		            		  createTrafoNode(trafo);
		            	  }
		  	    		   
	  	          	}
	  	          	
	  	          
	          }
		  	 }
	          }
	         

	      } catch (ParserConfigurationException e) {
	          e.printStackTrace();
	      }
	}



	private static void createTrafoNode(String trafo) {
		// TODO Auto-generated method stub
		//create transformation element
	}



	private static void createMMNode(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void registerMMs(Path modelsRoot) {
		// TODO Auto-generated method stub
		long starttime=System.currentTimeMillis();
		System.out.println("Registering all metamodels...");
		
		Iterator iterator;
		try {
			iterator = Files.list(modelsRoot).iterator();
		
		while (iterator.hasNext()) {
			
			Path pf=(Path)iterator.next();
			System.out.println(pf.getFileName());
			if( pf.toString().endsWith(".ecore") ) {
			
			org.eclipse.emf.common.util.URI mmuri = org.eclipse.emf.common.util.URI.createURI(pf.toString());
			
			EmfUtil.register(mmuri, EPackage.Registry.INSTANCE);
			
			}
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endtime=System.currentTimeMillis();
		
		System.out.println("*********************************");
		System.out.println("Metamodel registration took : "+(endtime-starttime)+" ms");
	}
	

	




private static void genGraphEcore( Path modelsRoot, Path mmRoot) {
		// TODO Auto-generated method stub
	String ecosystemMM = mmRoot.resolve("MDEEcosystemMM.ecore").toAbsolutePath().toUri().toString();
	
	
	Iterator repoiterator;
	
	try {
		repoiterator = Files.list(modelsRoot).filter(path -> path.getFileName().toString().endsWith(".ecore")).iterator();
	
	
	
	while(repoiterator.hasNext()) {
	Path pf=(Path)repoiterator.next();
	//System.out.println(pf.getFileName());
	String mm =  URI.createFileURI(new File(modelsRoot.resolve(pf.getFileName()).toString()).getAbsolutePath()).toString();
		System.out.println(mm);
		
		//generate metamodel element 
		createMMNode(mm);
	}
			
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public static String getRepoFolder(String path) {
	Properties prop = new Properties();
	try (InputStream input = new FileInputStream(path)) {

        // load a properties file
        prop.load(input);

        // get the property value and print it out
        System.out.println("Repository folder:"+prop.getProperty("repository.package"));
       

    } catch (IOException ex) {
        ex.printStackTrace();
    }
	return prop.getProperty("repository.package");
}
}
