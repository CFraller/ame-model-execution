package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Move;
import ozobot.xdsml.ozobotlmt.model.Transition;
import ozobot.xdsml.ozobotlmt.model.Velocity;

@SuppressWarnings("all")
public class MoveAdapter extends EObjectAdapter<Move> implements ozobot.xdsml.ozobotlmt.model.Move {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public MoveAdapter() {
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
  public int getDistance() {
    return adaptee.getDistance();
  }
  
  @Override
  public void setDistance(final int o) {
    adaptee.setDistance(o);
  }
  
  @Override
  public Velocity getVelocity() {
    return ozobot.xdsml.ozobotlmt.model.Velocity.get(adaptee.getVelocity().getValue());
  }
  
  @Override
  public void setVelocity(final Velocity o) {
    adaptee.setVelocity(ozobot.xdsml.ozobotl.model.Velocity.get(o.getValue()));
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
  
  protected final static int DISTANCE_EDEFAULT = 0;
  
  protected final static Velocity VELOCITY_EDEFAULT = ozobot.xdsml.ozobotlmt.model.Velocity.VERY_SLOW;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getMove();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__OUTGOING:
    		return getOutgoing();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__INCOMING:
    		return getIncoming();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__DISTANCE:
    		return new java.lang.Integer(getDistance());
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__VELOCITY:
    		return getVelocity();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__OUTGOING:
    		return getOutgoing() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__INCOMING:
    		return getIncoming() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__DISTANCE:
    		return getDistance() != DISTANCE_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__VELOCITY:
    		return getVelocity() != VELOCITY_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__OUTGOING:
    		setOutgoing(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__INCOMING:
    		setIncoming(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__DISTANCE:
    		setDistance(((java.lang.Integer) newValue).intValue());
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.MOVE__VELOCITY:
    		setVelocity(
    		(ozobot.xdsml.ozobotlmt.model.Velocity)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
