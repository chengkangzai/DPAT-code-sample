package com.company.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFacade<T> {

    public List<T> list = new ArrayList<>();

    public List<T> get() {
        return this.list;
    }
}
