package no.andsim.service;

import generated.Vare;

import javax.jws.WebService;

@WebService
public interface VareService {
    String sayHi(String text);
    boolean sendVare(Vare vare);
}

