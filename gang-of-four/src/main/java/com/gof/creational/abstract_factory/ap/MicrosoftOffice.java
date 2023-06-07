package com.gof.creational.abstract_factory.ap;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Proprietary;

import java.util.Set;

public interface MicrosoftOffice extends OfficeSuite {

    Set<Devices> allowedDevices();

    default License getLicense() {
        return new Proprietary();
    }
}
