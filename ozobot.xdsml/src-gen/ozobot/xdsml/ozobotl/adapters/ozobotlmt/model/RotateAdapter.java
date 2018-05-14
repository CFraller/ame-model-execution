package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Rotate;
import ozobot.xdsml.ozobotlmt.model.Direction;
import ozobot.xdsml.ozobotlmt.model.Transition;
import ozobot.xdsml.ozobotlmt.model.Velocity;

@SuppressWarnings("all")
public class RotateAdapter extends EObjectAdapter<Rotate> implements ozobot.xdsml.ozobotlmt.model.Rotate {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public RotateAdapter() {
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
  public Direction getDirection() {
    return ozobot.xdsml.ozobotlmt.model.Direction.get(adaptee.getDirection().getValue());
  }
  
  @Override
  public void setDirection(final Direction o) {
    adaptee.setDirection(ozobot.xdsml.ozobotl.model.Direction.get(o.getValue()));
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
  public float getAngle() {
    return adaptee.getAngle();
  }
  
  @Override
  public void setAngle(final float o) {
    adaptee.setAngle(o);
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
  
  @Override
  public void initialize() {
    ozobot.xdsml.ozobotl.aspects.CommandAspect.initialize(adaptee);
  }
  
  @Override
  public String getTopic() {
    return ozobot.xdsml.ozobotl.aspects.CommandAspect.topic(adaptee);
  }
  
  @Override
  public void setTopic(final String topic) {
    ozobot.xdsml.ozobotl.aspects.CommandAspect.topic(adaptee, topic
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String TOPIC_EDEFAULT = null;
  
  protected final static Direction DIRECTION_EDEFAULT = ozobot.xdsml.ozobotlmt.model.Direction.LEFT;
  
  protected final static Velocity VELOCITY_EDEFAULT = ozobot.xdsml.ozobotlmt.model.Velocity.VERY_SLOW;
  
  protected final static float ANGLE_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getRotate();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__OUTGOING:
    		return getOutgoing();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__INCOMING:
    		return getIncoming();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__TOPIC:
    		return getTopic();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__DIRECTION:
    		return getDirection();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__VELOCITY:
    		return getVelocity();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__ANGLE:
    		return new java.lang.Float(getAngle());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__OUTGOING:
    		return getOutgoing() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__INCOMING:
    		return getIncoming() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__TOPIC:
    		return getTopic() != TOPIC_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__DIRECTION:
    		return getDirection() != DIRECTION_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__VELOCITY:
    		return getVelocity() != VELOCITY_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__ANGLE:
    		return getAngle() != ANGLE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__OUTGOING:
    		setOutgoing(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__INCOMING:
    		setIncoming(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__TOPIC:
    		setTopic(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__DIRECTION:
    		setDirection(
    		(ozobot.xdsml.ozobotlmt.model.Direction)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__VELOCITY:
    		setVelocity(
    		(ozobot.xdsml.ozobotlmt.model.Velocity)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.ROTATE__ANGLE:
    		setAngle(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
