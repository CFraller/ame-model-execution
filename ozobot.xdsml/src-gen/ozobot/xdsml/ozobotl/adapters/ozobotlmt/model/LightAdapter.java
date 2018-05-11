package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Light;
import ozobot.xdsml.ozobotlmt.model.Color;
import ozobot.xdsml.ozobotlmt.model.Transition;

@SuppressWarnings("all")
public class LightAdapter extends EObjectAdapter<Light> implements ozobot.xdsml.ozobotlmt.model.Light {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public LightAdapter() {
    super(ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory.getInstance());
    adaptersFactory = ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Color getColor() {
    return ozobot.xdsml.ozobotlmt.model.Color.get(adaptee.getColor().getValue());
  }
  
  @Override
  public void setColor(final Color o) {
    adaptee.setColor(ozobot.xdsml.ozobotl.model.Color.get(o.getValue()));
  }
  
  @Override
  public Transition getOutgoing() {
    return (Transition) adaptersFactory.createAdapter(adaptee.getOutgoing(), eResource);
  }
  
  @Override
  public void setOutgoing(final Transition o) {
    if (o != null)
    	adaptee.setOutgoing(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter) o).getAdaptee());
    else adaptee.setOutgoing(null);
  }
  
  @Override
  public Transition getIncoming() {
    return (Transition) adaptersFactory.createAdapter(adaptee.getIncoming(), eResource);
  }
  
  @Override
  public void setIncoming(final Transition o) {
    if (o != null)
    	adaptee.setIncoming(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter) o).getAdaptee());
    else adaptee.setIncoming(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static Color COLOR_EDEFAULT = ozobot.xdsml.ozobotlmt.model.Color.NONE;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getLight();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__OUTGOING:
    		return getOutgoing();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__INCOMING:
    		return getIncoming();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__COLOR:
    		return getColor();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__OUTGOING:
    		return getOutgoing() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__INCOMING:
    		return getIncoming() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__COLOR:
    		return getColor() != COLOR_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__OUTGOING:
    		setOutgoing(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__INCOMING:
    		setIncoming(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.LIGHT__COLOR:
    		setColor(
    		(ozobot.xdsml.ozobotlmt.model.Color)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
