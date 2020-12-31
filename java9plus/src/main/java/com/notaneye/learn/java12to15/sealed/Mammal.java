package com.notaneye.learn.java12to15.sealed;


/**
 * <p>
 * This interface is sealed, thanks to the presence of the {@code sealed}
 * keyword. It must declare which classes may implement it using the
 * {@code permits} keyword, followed by a list of classes.
 * </p>
 * <p>
 * There are a couple of important caveats to keep in mind. See the JEP for more
 * details.
 * </p>
 * <ul>
 *     <li>The allowed implementors/extenders must reside in the same module, or
 *     same package (if the class resides in the unnamed module.</li>
 *     <li>Sealing is transitive, so permitted classes must either stop the
 *     sealing, by being declared {@code final}, explicitly declaring their own
 *     sealed subclasses, or explicitly being unsealed for extension.</li>
 * </ul>
 *
 * @see <a href="https://openjdk.java.net/jeps/360">JEP-360</a>
 */
public sealed interface Mammal permits Cetacean, Gorilla, Horse {

}
