package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

/**
 * Learn how to create Flux instances.
 *
 * @author Daniel Felipe Marin
 * @email felipemaringiraldo@hotrmail.com
 * v. 1.0
 */
public class Part01Flux {



	// TODO Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.empty();
	}

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo","bar");
	}


	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		return Flux.fromIterable(Arrays.asList("foo","bar"));
	}


	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}


	// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		return Flux.interval(Duration.ofMillis(100))
				.take(10);
	}

}
