package ozobot.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	ozobot.xdsml.ozobotl.model.ModelPackage.eNS_URI,
    	ozobot.xdsml.ozobotl.model.ModelPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor ozobotL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ozobot.xdsml.OzobotL", "", "http://ozobot.xdsml.ozobotl/model/", "ozobot.xdsml.OzobotLMT"
    );
    ozobotL.addAdapter("ozobot.xdsml.OzobotLMT", ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ozobot.xdsml.OzobotL",
    	ozobotL
    );
    MelangeRegistry.ModelTypeDescriptor ozobotLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ozobot.xdsml.OzobotLMT", "", "http://ozobot.xdsml.ozobotlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ozobot.xdsml.OzobotLMT",
    	ozobotLMT
    );
  }
}
