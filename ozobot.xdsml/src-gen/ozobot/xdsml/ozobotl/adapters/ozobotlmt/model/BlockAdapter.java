package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Block;
import ozobot.xdsml.ozobotlmt.model.Command;
import ozobot.xdsml.ozobotlmt.model.Transition;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements ozobot.xdsml.ozobotlmt.model.Block {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
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
  
  private EList<Command> commands_;
  
  @Override
  public EList<Command> getCommands() {
    if (commands_ == null)
    	commands_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCommands(), adaptersFactory, eResource);
    return commands_;
  }
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public void initialize() {
    ozobot.xdsml.ozobotl.aspects.BlockAspect.initialize(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__COMMANDS:
    		return getCommands();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__TRANSITIONS:
    		return getTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__COMMANDS:
    		return getCommands() != null && !getCommands().isEmpty();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__COMMANDS:
    		getCommands().clear();
    		getCommands().addAll((Collection) newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.BLOCK__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
