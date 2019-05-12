package org.hisrc.xjc.maven.tests;

import java.io.InputStream;

import org.codehaus.plexus.util.IOUtil;
import org.hisrc.xjc.maven.RawXJC2Mojo;
import org.junit.Assert;
import org.junit.Test;

public class AddIfExistsToEpisodeSchemaBindingsTest {

	@Test
	public void transformationResourceIsAccessible() {
		InputStream is = RawXJC2Mojo.class
				.getResourceAsStream(RawXJC2Mojo.ADD_IF_EXISTS_TO_EPISODE_SCHEMA_BINDINGS_TRANSFORMATION_RESOURCE_NAME);
		Assert.assertNotNull(is);
		IOUtil.close(is);
	}
}
