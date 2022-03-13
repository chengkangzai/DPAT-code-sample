package com.company.facade;

import java.util.List;

public abstract class AbstractFacade<T> {

    public List<T> list;

    public List<T> get() {
        return this.list;
    }

}
