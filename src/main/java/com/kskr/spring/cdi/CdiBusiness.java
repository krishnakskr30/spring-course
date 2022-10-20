package com.kskr.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

    @Inject
    CdiDAO cdiDAO;

    public CdiDAO getCdiDAO() {
        return cdiDAO;
    }
}
