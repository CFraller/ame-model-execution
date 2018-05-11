package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Transition;
import ozobot.xdsml.ozobotlmt.model.Command;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements ozobot.xdsml.ozobotlmt.model.Transition {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  public Command getSource() {
    return (Command) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final Command o) {
    if (o != null)
    	adaptee.setSource(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public Command getTarget() {
    return (Command) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final Command o) {
    if (o != null)
    	adaptee.setTarget(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__SOURCE:
    		return getSource();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__SOURCE:
    		setSource(
    		(ozobot.xdsml.ozobotlmt.model.Command)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.TRANSITION__TARGET:
    		setTarget(
    		(ozobot.xdsml.ozobotlmt.model.Command)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
