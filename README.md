# JAXB2 Maven Plugin #

Welcome to the `org.hisrc.xjc:xjc23-maven-plugin`, the most advanced and feature-full Maven plugin for XML Schema compilation.

This Maven plugin wraps and enhances the [JAXB](https://jaxb.java.net/) [Schema Compiler (XJC)](http://docs.oracle.com/javase/6/docs/technotes/tools/share/xjc.html) and allows
compiling XML Schemas (as well as WSDL, DTDs, RELAX NG) into Java classes in Maven builds.

> If you are interested in the Mojohaus JAXB2 Maven Plugin (`org.codehaus.mojo:jaxb2-maven-plugin`),
> please follow [this link](https://github.com/mojohaus/jaxb2-maven-plugin) to the corresponding website.

## Quick start ##

* Put your schemas (`*.xsd`) and bindings (`*.xjb`) into the `src/main/resources` folder.
* Add the plugin to your `pom.xml`:

```xml
<project ...>
	...
	<build>
		<plugins>
			...
			<plugin>
				<groupId>org.hisrc.xjc</groupId>
				<artifactId>xjc23-maven-plugin</artifactId>
				<version>0.14.0</version>
				<executions>
					<execution>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			...
		</plugins>
	</build>
	...
</project>
```

### JAXB Versions

If you need a specific JAXB version, you can explicitly use one of the following variants:

* `org.hisrc.xjc:maven-jaxb20-plugin` - JAXB 2.0.
* `org.hisrc.xjc:maven-jaxb21-plugin` - JAXB 2.1.
* `org.hisrc.xjc:maven-jaxb22-plugin` - JAXB 2.2.
* `org.hisrc.xjc:maven-jaxb23-plugin` - JAXB 2.3.
* `org.hisrc.xjc:xjc23-maven-plugin` - "most actual version", at the moment same as `org.hisrc.xjc:maven-jaxb23-plugin`.

### Java versions

Supported Java versions are `1.7`, `1.8`, `9` (only `xjc23-maven-plugin` and `maven-jaxb23-plugin`).

Java version `1.6` is no longer supported (since version `0.14.0`).

## [Documentation](https://github.com/xjc-maven-plugin/xjc2/wiki) ##

Please refer to the [wiki](https://github.com/xjc-maven-plugin/xjc2/wiki) for the full documentation.


* [User Guide](https://github.com/xjc-maven-plugin/xjc2/wiki/User-Guide)
* Maven Documentation  (Work in progress)
* [Configuration Cheat Sheet](https://github.com/xjc-maven-plugin/xjc2/wiki/Configuration-Cheat-Sheet)
* [Common Pitfalls and Problems](https://github.com/xjc-maven-plugin/xjc2/wiki/Common-Pitfalls-and-Problems) (Work in progress)
* [Best Practices](https://github.com/xjc-maven-plugin/xjc2/wiki/Best-Practices) (Work in progress)
* [FAQ](https://github.com/xjc-maven-plugin/xjc2/wiki/FAQ)
* [Sample Projects](https://github.com/xjc-maven-plugin/xjc2/wiki/Sample-Projects)
* [Support](https://github.com/xjc-maven-plugin/xjc2/wiki/Support)
* [License](https://github.com/xjc-maven-plugin/xjc2/blob/master/LICENSE)


## Disclaimer ##

This project is not developed, supported or in any other way affiliated with Apache. The `org.hisrc.xjc:xjc23-maven-plugin` is not an Apache product (and does not pretend to be one), it is a completely independent development.

This project is also *not* developed by or affiliated with Oracle or Sun. Even if it is featured on [https://jaxb.java.net/](https://jaxb.java.net) pages, 

**This plugin is in no way _official_ JAXB2 Maven plugin by Sun or Oracle.**

This is a completely indepentent development. [I](https://github.com/highsource) am *not* an Oracle employee.