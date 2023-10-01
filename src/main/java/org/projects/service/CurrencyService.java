package org.projects.service;

import java.util.Optional;

public interface CurrencyService {
    Optional<Object> getCurrencyByName (String name);
}
