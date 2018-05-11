package ozobot.xdsml.ozobotl.adapters.ozobotlmt.model;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory;
import ozobot.xdsml.ozobotlmt.model.Block;
import ozobot.xdsml.ozobotlmt.model.Light;
import ozobot.xdsml.ozobotlmt.model.ModelFactory;
import ozobot.xdsml.ozobotlmt.model.ModelPackage;
import ozobot.xdsml.ozobotlmt.model.Move;
import ozobot.xdsml.ozobotlmt.model.Ozobot;
import ozobot.xdsml.ozobotlmt.model.OzobotProgram;
import ozobot.xdsml.ozobotlmt.model.Repeat;
import ozobot.xdsml.ozobotlmt.model.Rotate;
import ozobot.xdsml.ozobotlmt.model.Transition;
import ozobot.xdsml.ozobotlmt.model.Wait;

@SuppressWarnings("all")
public class ModelFactoryAdapter extends EFactoryImpl implements ModelFactory {
  private OzobotLMTAdaptersFactory adaptersFactory = ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory.getInstance();
  
  private ozobot.xdsml.ozobotl.model.ModelFactory modelAdaptee = ozobot.xdsml.ozobotl.model.ModelFactory.eINSTANCE;
  
  @Override
  public OzobotProgram createOzobotProgram() {
    return adaptersFactory.createOzobotProgramAdapter(modelAdaptee.createOzobotProgram(), null);
  }
  
  @Override
  public Move createMove() {
    return adaptersFactory.createMoveAdapter(modelAdaptee.createMove(), null);
  }
  
  @Override
  public Light createLight() {
    return adaptersFactory.createLightAdapter(modelAdaptee.createLight(), null);
  }
  
  @Override
  public Rotate createRotate() {
    return adaptersFactory.createRotateAdapter(modelAdaptee.createRotate(), null);
  }
  
  @Override
  public Wait createWait() {
    return adaptersFactory.createWaitAdapter(modelAdaptee.createWait(), null);
  }
  
  @Override
  public Repeat createRepeat() {
    return adaptersFactory.createRepeatAdapter(modelAdaptee.createRepeat(), null);
  }
  
  @Override
  public Ozobot createOzobot() {
    return adaptersFactory.createOzobotAdapter(modelAdaptee.createOzobot(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(modelAdaptee.createBlock(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(modelAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getModelPackage();
  }
  
  public ModelPackage getModelPackage() {
    return ozobot.xdsml.ozobotlmt.model.ModelPackage.eINSTANCE;
  }
}
