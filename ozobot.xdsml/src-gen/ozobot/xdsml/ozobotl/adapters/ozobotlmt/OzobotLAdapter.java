package ozobot.xdsml.ozobotl.adapters.ozobotlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import ozobot.xdsml.OzobotLMT;
import ozobot.xdsml.ozobotlmt.model.ModelFactory;

@SuppressWarnings("all")
public class OzobotLAdapter extends ResourceAdapter implements OzobotLMT {
  public OzobotLAdapter() {
    super(ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ModelFactory getModelFactory() {
    return new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.ModelFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getModelFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
