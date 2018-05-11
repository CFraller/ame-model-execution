package ozobot.xdsml.ozobotl.adapters.ozobotlmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.BlockAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.LightAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.MoveAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.NamedElementAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotProgramAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RepeatAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RotateAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter;
import ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.WaitAdapter;
import ozobot.xdsml.ozobotl.model.Block;
import ozobot.xdsml.ozobotl.model.Command;
import ozobot.xdsml.ozobotl.model.Light;
import ozobot.xdsml.ozobotl.model.Move;
import ozobot.xdsml.ozobotl.model.NamedElement;
import ozobot.xdsml.ozobotl.model.Ozobot;
import ozobot.xdsml.ozobotl.model.OzobotProgram;
import ozobot.xdsml.ozobotl.model.Repeat;
import ozobot.xdsml.ozobotl.model.Rotate;
import ozobot.xdsml.ozobotl.model.Transition;
import ozobot.xdsml.ozobotl.model.Wait;

@SuppressWarnings("all")
public class OzobotLMTAdaptersFactory implements AdaptersFactory {
  private static OzobotLMTAdaptersFactory instance;
  
  public static OzobotLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.OzobotLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public OzobotLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ozobot.xdsml.ozobotl.model.OzobotProgram){
    	return createOzobotProgramAdapter((ozobot.xdsml.ozobotl.model.OzobotProgram) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Move){
    	return createMoveAdapter((ozobot.xdsml.ozobotl.model.Move) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Light){
    	return createLightAdapter((ozobot.xdsml.ozobotl.model.Light) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Rotate){
    	return createRotateAdapter((ozobot.xdsml.ozobotl.model.Rotate) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Wait){
    	return createWaitAdapter((ozobot.xdsml.ozobotl.model.Wait) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Repeat){
    	return createRepeatAdapter((ozobot.xdsml.ozobotl.model.Repeat) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Ozobot){
    	return createOzobotAdapter((ozobot.xdsml.ozobotl.model.Ozobot) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Block){
    	return createBlockAdapter((ozobot.xdsml.ozobotl.model.Block) o, res);
    }
    if (o instanceof ozobot.xdsml.ozobotl.model.Transition){
    	return createTransitionAdapter((ozobot.xdsml.ozobotl.model.Transition) o, res);
    }
    
    return null;
  }
  
  public NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.NamedElementAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.NamedElementAdapter) adapter;
    }
  }
  
  public OzobotProgramAdapter createOzobotProgramAdapter(final OzobotProgram adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotProgramAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotProgramAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotProgramAdapter) adapter;
    }
  }
  
  public CommandAdapter createCommandAdapter(final Command adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.CommandAdapter) adapter;
    }
  }
  
  public MoveAdapter createMoveAdapter(final Move adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.MoveAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.MoveAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.MoveAdapter) adapter;
    }
  }
  
  public LightAdapter createLightAdapter(final Light adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.LightAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.LightAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.LightAdapter) adapter;
    }
  }
  
  public RotateAdapter createRotateAdapter(final Rotate adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RotateAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RotateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RotateAdapter) adapter;
    }
  }
  
  public WaitAdapter createWaitAdapter(final Wait adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.WaitAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.WaitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.WaitAdapter) adapter;
    }
  }
  
  public RepeatAdapter createRepeatAdapter(final Repeat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RepeatAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RepeatAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.RepeatAdapter) adapter;
    }
  }
  
  public OzobotAdapter createOzobotAdapter(final Ozobot adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.OzobotAdapter) adapter;
    }
  }
  
  public BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.BlockAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.BlockAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter) adapter;
    else {
    	adapter = new ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ozobot.xdsml.ozobotl.adapters.ozobotlmt.model.TransitionAdapter) adapter;
    }
  }
}
