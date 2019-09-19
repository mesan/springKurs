package com.netcompany.spring.personregister.service;

import java.util.List;

import com.netcompany.spring.personregister.domain.Person;
import com.netcompany.spring.personregister.repository.PersonRepository;
import org.joda.time.LocalDate;

import javax.annotation.PostConstruct;

/**
 * Standard implementasjon av {@link PersonService}.
 *
 * @author Torbjørn S. Knutsen
 */
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Person hentPerson(final Long id) {
        return personRepository.hentPerson(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Person> hentAllePersoner() {
        return personRepository.hentAllePersoner();
    }

    @PostConstruct
    public void lagPersoner() {
        personRepository.lagrePerson(new Person("Torbjørn",
                                                "Knutsen",
                                                "97714022",
                                                new LocalDate(1986, 8, 31).toDate(),
                                                "torbjornk@netcompany.com"));
        //TODO: Lagre deg selv her?
    }
}
