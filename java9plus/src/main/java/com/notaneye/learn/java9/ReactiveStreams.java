package com.notaneye.learn.java9;


/**
 * <h1>Reactive Streams</h1>
 * <p>
 * This enhancement sounds grandiose, but in fact is just 4 simple interfaces,
 * added to the {@link java.util.concurrent} package (within the
 * {@link java.util.concurrent.Flow Flow} class). They extended from the work
 * done on the <a href="http://www.reactive-streams.org/">Reactive Streams</a>
 * specification.
 * </p>
 * <p>
 * On their own, they don't provide much utility, but do set the JDK up to
 * support competing-but-interoperable reactive framework implementations. It
 * also provides the foundation to build other reactive components of the JDK
 * on, such as the {@link java.net.http.HttpClient HttpClient} or reactive
 * database connectors.
 * </p>
 * <h2>Reactive Development</h2>
 * <p>
 * What is "reactive" development? Briefly, it's a non-blocking concurrent
 * programming technique to handle streams of data or events in a scalable &amp;
 * reliable manner. Think of them as a combination of Java 8's Streams with a
 * Publish/Subscribe model.
 * </p>
 * <p>
 * A central concept is "backpressure", which allows a Subscriber to control how
 * it handles events that are published too quickly. Additionally, most reactive
 * frameworks define a set of standard operators, such as transformers &amp;
 * compositors.
 * </p>
 * <h2>Reactive Frameworks</h2>
 * <p>
 * Currently, there are two main reactive frameworks in the Java ecosystem:
 * <a href="http://reactivex.io/">ReactiveX</a> and
 * <a href="https://projectreactor.io">Project Reactor</a>. ReactiveX is the
 * older of the 2, and publishes or promotes implementations for a variety of
 * languages and runtimes. Project Reactor is sponsored by Pivotal, and is the
 * framework that underpins their reactive web framework, WebFlux.
 * </p>
 * <p>
 * Functionally, both are very similar, so the choice is largely one of
 * preference. Project Reactor has some existing integration with Spring, so
 * might be the easiest choice on a Spring project. ReactiveX, being polyglot,
 * might be best for a full-stack application, such that a similar programming
 * model can be used across different components.
 * </p>
 */
public class ReactiveStreams {

}
