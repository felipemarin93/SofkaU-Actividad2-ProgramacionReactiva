package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Daniel Felipe Marin
 * @email felipemaringiraldo@hotrmail.com
 * v. 1.0
 */
public class Part10ReactiveToBlocking {



	// TODO Return the user contained in that Mono
	User monoToValue(Mono<User> mono) {
		return mono.block();
	}



	// TODO Return the users contained in that Flux
	Iterable<User> fluxToValues(Flux<User> flux) {
		return flux.toIterable(); // TO BE REMOVED
	}

}
