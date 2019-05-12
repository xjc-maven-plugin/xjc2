package org.jvnet.mjiip.v_2.tests.p_o;

import org.hisrc.xjc.maven.AbstractXJC2Mojo;
import org.hisrc.xjc.maven.test.RunXJC2Mojo;

public class RunP_OPlugin extends RunXJC2Mojo {

	@Override
	protected void configureMojo(AbstractXJC2Mojo mojo) {
		super.configureMojo(mojo);
//		mojo.setExtension(true);
//		mojo.setForceRegenerate(true);
	}
}
