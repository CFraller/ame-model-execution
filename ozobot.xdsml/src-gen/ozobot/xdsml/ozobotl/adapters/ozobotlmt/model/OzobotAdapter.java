package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotl.model.Ozobot;
import ozobot.xdsml.ozobotlmt.model.OzobotProgram;

@SuppressWarnings("all")
public class OzobotAdapter extends EObjectAdapter<Ozobot> implements ozobot.xdsml.ozobotlmt.model.Ozobot {
  private OzobotLMTAdaptersFactory adaptersFactory;
  
  public OzobotAdapter() {
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
  
  private EList<OzobotProgram> programs_;
  
  @Override
  public EList<OzobotProgram> getPrograms() {
    if (programs_ == null)
    	programs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPrograms(), adaptersFactory, eResource);
    return programs_;
  }
  
  @Override
  public void initialize() {
    ozobot.xdsml.ozobotl.aspects.OzobotAspect.initialize(adaptee);
  }
  
  @Override
  public float getOrientation() {
    return ozobot.xdsml.ozobotl.aspects.OzobotAspect.orientation(adaptee);
  }
  
  @Override
  public void setOrientation(final float orientation) {
    ozobot.xdsml.ozobotl.aspects.OzobotAspect.orientation(adaptee, orientation
    );
  }
  
  @Override
  public float getXposition() {
    return ozobot.xdsml.ozobotl.aspects.OzobotAspect.xposition(adaptee);
  }
  
  @Override
  public void setXposition(final float xposition) {
    ozobot.xdsml.ozobotl.aspects.OzobotAspect.xposition(adaptee, xposition
    );
  }
  
  @Override
  public float getYposition() {
    return ozobot.xdsml.ozobotl.aspects.OzobotAspect.yposition(adaptee);
  }
  
  @Override
  public void setYposition(final float yposition) {
    ozobot.xdsml.ozobotl.aspects.OzobotAspect.yposition(adaptee, yposition
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float ORIENTATION_EDEFAULT = 0.0F;
  
  protected final static float XPOSITION_EDEFAULT = 0.0F;
  
  protected final static float YPOSITION_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE.getOzobot();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__NAME:
    		return getName();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__PROGRAMS:
    		return getPrograms();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__ORIENTATION:
    		return new java.lang.Float(getOrientation());
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__XPOSITION:
    		return new java.lang.Float(getXposition());
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__YPOSITION:
    		return new java.lang.Float(getYposition());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__PROGRAMS:
    		return getPrograms() != null && !getPrograms().isEmpty();
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__ORIENTATION:
    		return getOrientation() != ORIENTATION_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__XPOSITION:
    		return getXposition() != XPOSITION_EDEFAULT;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__YPOSITION:
    		return getYposition() != YPOSITION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__PROGRAMS:
    		getPrograms().clear();
    		getPrograms().addAll((Collection) newValue);
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__ORIENTATION:
    		setOrientation(((java.lang.Float) newValue).floatValue());
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__XPOSITION:
    		setXposition(((java.lang.Float) newValue).floatValue());
    		return;
    	case ozobot.xdsml.ozobotlmt.model.ModelPackage.OZOBOT__YPOSITION:
    		setYposition(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
