package org.hisrc.xjc.maven.tests;

import org.hisrc.xjc.maven.DependencyResource;
import org.junit.Test;

public class DependencyResourceTest {

	@Test
	public void correctlyParsesDepenencyResource() {
		
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d:");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d:e");
		}

		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b!/c");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:!/c");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c!/d");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:!/d");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d!/e");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b::d!/e");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d:!/e");
		}
		{
			@SuppressWarnings("unused")
			DependencyResource dependencyResource = DependencyResource
					.valueOf("a:b:c:d:e!/f");
		}

	}
}
