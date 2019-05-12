package org.hisrc.xjc.maven.tests.MAVEN_JAXB2_PLUGIN_53.b;

import java.io.File;

import org.hisrc.xjc.maven.AbstractXJC2Mojo;
import org.hisrc.xjc.maven.test.RunXJC2Mojo;

public class RunMAVEN_JAXB2_PLUGIN_53Mojo extends RunXJC2Mojo {

	@Override
	protected void configureMojo(AbstractXJC2Mojo mojo) {
		super.configureMojo(mojo);
		mojo.setCatalog(new File(getBaseDir(), "src/main/resources/catalog.cat"));
		mojo.setUseDependenciesAsEpisodes(true);

		mojo.setForceRegenerate(true);
	}

}
