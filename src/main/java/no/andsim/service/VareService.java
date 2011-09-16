package no.andsim.service;

import javax.jws.WebService;

import no.vareservice.andsim.vare.Vare;
import no.vareservice.andsim.varelist.VareList;

@WebService
public interface VareService {
    String sayHi(String text);
    boolean sendVare(Vare vare);
    VareList listVarer();
}

