package org.hisrc.xjc.maven.net;

public interface SchemeAwareURILastModifiedResolver extends
		URILastModifiedResolver {

	public String getScheme();

}
