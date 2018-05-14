package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Repeat;
import ozobot.xdsml.ozobotlmt.model.Block;
import ozobot.xdsml.ozobotlmt.model.Transition;

@SuppressWarnings("all")
public class RepeatAdapter extends EObjectAdapter<Repeat> implements ozobot.xdsml.ozobotlmt.model.Repeat {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public RepeatAdapter() {
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
  public int getCount() {
    return adaptee.getCount();
  }
  
  @Override
  public void setCount(final int o) {
    adaptee.setCount(o);
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
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public void initialize() {
    ozobot.xdsml.ozobotl.aspects.RepeatAspect.initialize(adaptee);
  }
  
  @Override
  public int getRuntimeCounter() {
    return ozobot.xdsml.ozobotl.aspects.RepeatAspect.runtimeCounter(adaptee);
  }
  
  @Override
  public void setRuntimeCounter(final int runtimeCounter) {
    ozobot.xdsml.ozobotl.aspects.RepeatAspect.runtimeCounter(adaptee, runtimeCounter
    );
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
  
  protected final static int COUNT_EDEFAULT = 0;
  
  protected final static int RUNTIME_COUNTER_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getRepeat();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__OUTGOING:
    		return getOutgoing();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__INCOMING:
    		return getIncoming();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__TOPIC:
    		return getTopic();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__COUNT:
    		return new java.lang.Integer(getCount());
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__BLOCK:
    		return getBlock();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__RUNTIME_COUNTER:
    		return new java.lang.Integer(getRuntimeCounter());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__OUTGOING:
    		return getOutgoing() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__INCOMING:
    		return getIncoming() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__TOPIC:
    		return getTopic() != TOPIC_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__COUNT:
    		return getCount() != COUNT_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__BLOCK:
    		return getBlock() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__RUNTIME_COUNTER:
    		return getRuntimeCounter() != RUNTIME_COUNTER_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__OUTGOING:
    		setOutgoing(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__INCOMING:
    		setIncoming(
    		(ozobot.xdsml.ozobotlmt.model.Transition)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__TOPIC:
    		setTopic(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__COUNT:
    		setCount(((java.lang.Integer) newValue).intValue());
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__BLOCK:
    		setBlock(
    		(ozobot.xdsml.ozobotlmt.model.Block)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.REPEAT__RUNTIME_COUNTER:
    		setRuntimeCounter(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
