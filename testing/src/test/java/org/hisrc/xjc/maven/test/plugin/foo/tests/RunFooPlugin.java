package org.hisrc.xjc.maven.test.plugin.foo.tests;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.hisrc.xjc.maven.test.RunXJC2Mojo;

public class RunFooPlugin extends RunXJC2Mojo {

	@Override
	public File getSchemaDirectory() {
		return new File(getBaseDir(), "src/test/resources");
	}

	@Override
	public List<String> getArgs() {
		return Collections.singletonList("-Xfoo");
	}

}
