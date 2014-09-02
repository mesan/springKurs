package no.mesan.spring.personregister.service;

import java.util.List;

import no.mesan.spring.personregister.domain.Person;

/**
 * Service for operasjoner knyttet til {@link Person}er
 *
 * @author Torbjørn S. Knutsen
 */
public interface PersonService {

    /**
     * Henter {@link Person} med gitt id.
     *
     * @param id   til {@link Person}en som skal hentes
     * @return     en {@link Person}
     */
    Person hentPerson(Long id);

    /**
     * Henter alle {@link Person}er
     *
     * @return    en liste med {@link Person}er
     */
    List<Person> hentAllePersoner();
}
