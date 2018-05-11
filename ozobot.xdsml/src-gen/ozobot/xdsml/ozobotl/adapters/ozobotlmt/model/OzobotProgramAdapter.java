package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.OzobotProgram;
import ozobot.xdsml.ozobotlmt.model.Block;
import ozobot.xdsml.ozobotlmt.model.Command;

@SuppressWarnings("all")
public class OzobotProgramAdapter extends EObjectAdapter<OzobotProgram> implements ozobot.xdsml.ozobotlmt.model.OzobotProgram {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public OzobotProgramAdapter() {
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
  public Command getCurrent() {
    return (Command) adaptersFactory.createAdapter(adaptee.getCurrent(), eResource);
  }
  
  @Override
  public void setCurrent(final Command o) {
    if (o != null)
    	adaptee.setCurrent(((ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter) o).getAdaptee());
    else adaptee.setCurrent(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getOzobotProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__BLOCK:
    		return getBlock();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__CURRENT:
    		return getCurrent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__BLOCK:
    		return getBlock() != null;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__CURRENT:
    		return getCurrent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__BLOCK:
    		setBlock(
    		(ozobot.xdsml.ozobotlmt.model.Block)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT_PROGRAM__CURRENT:
    		setCurrent(
    		(ozobot.xdsml.ozobotlmt.model.Command)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
