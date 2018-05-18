package ozobot.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

import ozobot.model.Block;
import ozobot.model.Command;
import ozobot.model.OzobotProgram;

public class OzobotAnimationServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("Ozobot", "Animation"));

		return res;
	}

}
