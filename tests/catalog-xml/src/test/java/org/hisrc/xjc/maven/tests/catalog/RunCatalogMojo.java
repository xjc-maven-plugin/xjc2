package org.hisrc.xjc.maven.tests.catalog;

import java.io.File;

import org.hisrc.xjc.maven.resolver.tools.ClasspathCatalogResolver;
import org.hisrc.xjc.maven.test.RunXJC2Mojo;
import org.hisrc.xjc.maven.AbstractXJC2Mojo;

public class RunCatalogMojo extends RunXJC2Mojo {

	@Override
	protected void configureMojo(AbstractXJC2Mojo mojo) {
		super.configureMojo(mojo);

		mojo
				.setCatalog(new File(getBaseDir(),
						"src/main/resources/catalog.cat"));
		mojo.setCatalogResolver(ClasspathCatalogResolver.class.getName());

		mojo.setForceRegenerate(true);
	}

}
