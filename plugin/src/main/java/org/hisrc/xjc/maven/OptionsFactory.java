package org.hisrc.xjc.maven;

import org.apache.maven.plugin.MojoExecutionException;

public interface OptionsFactory<O> {

	public O createOptions(OptionsConfiguration optionsConfiguration)
			throws MojoExecutionException;

}
