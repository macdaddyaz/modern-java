package com.notaneye.learn.java9;


/**
 * <h2>The Java Platform Module System</h2>
 * <p>
 * A full tutorial and example are beyond the scope of this project and
 * presentation, but in a nutshell, the Module System provides additional
 * loading and scoping capabilities (i.e. encapsulation) to the Java Platform.
 * </p>
 * <p>
 * In addition to Java's original mechanisms for controlling the visibility of
 * members within packages, module authors can control the visibility of the
 * packages themselves. A new manifest file indicates which packages of a
 * JAR file should be "exported" to other modules, and which service
 * implementations are provided.
 * </p>
 * <p>
 * The same manifest file also declares external modules that the module depends
 * on, along with the scope of those dependencies (runtime, compile-time, and
 * transitive). In addition, it specifies rules regarding the usage of
 * reflection against the module.
 * </p>
 * <p>
 * The primary user of the Module System is the JDK itself. The entire JDK has
 * been restructured and repackaged as modules. The runtime also provides tools
 * for using and building modules.
 * </p>
 * <p>
 * Two very interesting new capabilities that Modules unlock are:
 * <ol>
 *     <li>Java Linker</li>
 *     <li>Multi-release JAR files</li>
 * </ol>
 * <h2>Java Linker</h2>
 * <p>
 * The {@code jlink} tool creates custom runtime images from a set of modules.
 * This runtime can then be a portable distribution for an application. See
 * <a href="http://openjdk.java.net/jeps/282">JEP 282</a> and
 * <a href="http://openjdk.java.net/jeps/220">JEP 220</a> for more details.
 * </p>
 * <h3>Multi-Release JAR Files</h3>
 * <p>
 * The Module System allows JAR files to contain classes that are only relevant
 * to particular Java Platform versions. In other words, a library author can
 * build a JAR file that contains more than one version of a particular class or
 * classes. The JAR would be structured and loaded such that versions of those
 * classes that require a particular level of the Java Platform would be loaded
 * before the "generic" versions of those classes. See
 * <a href="http://openjdk.java.net/jeps/238">JEP 238</a> for details.
 * </p>
 * <h3>Adoption</h3>
 * <p>
 * Interestingly, despite JPMS being one of the most fundamental changes to the
 * Java Platform ever, reception by the development community has been lukewarm.
 * Most frameworks rely on "auto-modules", which doesn't always work seamlessly,
 * especially if the framework relies on reflection or portions of the JDK that
 * have been extracted into separate, optional modules.
 * </p>
 * <p>
 * Another factor is the continued prevalence of Java 8. Obviously, apps
 * targeting anything below Java 9 can't use modules, and important frameworks
 * &amp; libraries will need to continue to support Java 8. Modules can coexist
 * with traditional JAR distributions, but the extra effort is seldom worth it.
 * </p>
 * <p>
 * <em>In short, most Java developers will not need to dive too deep into
 * Modules at this time</em>.
 * </p>
 *
 * @see <a href="http://openjdk.java.net/projects/jigsaw/">Project Jigsaw</a>
 * @see <a href="http://openjdk.java.net/projects/jigsaw/quick-start">Quick Start Guide</a>
 * @see <a href="https://www.baeldung.com/java-9-modularity">Baeldung Tutorial</a>
 */
@SuppressWarnings("unused")
public class ModuleSystem {

}
