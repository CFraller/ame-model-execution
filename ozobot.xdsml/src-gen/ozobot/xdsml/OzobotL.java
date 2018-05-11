package ozobot.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ozobot.xdsml.OzobotLMT;

@SuppressWarnings("all")
public class OzobotL implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static OzobotL load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    OzobotL mm = new OzobotL();
    mm.setResource(res);
    return mm ;
  }
  
  public OzobotLMT toOzobotLMT() {
    ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLAdapter adaptee = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
