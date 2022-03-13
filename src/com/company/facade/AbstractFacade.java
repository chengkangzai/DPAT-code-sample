package com.company.facade;

import java.io.IOException;
import java.util.List;

public abstract class AbstractFacade<T> {

    public List<T> list;

    public List<T> get() throws IOException {
        return this.list;
    }

}
