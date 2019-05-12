package org.hisrc.xjc.maven;

import java.net.URL;

import org.apache.maven.plugin.MojoExecutionException;

public interface DependencyResourceResolver {
	public URL resolveDependencyResource(DependencyResource dependencyResource)
			throws MojoExecutionException;

}
