package no.andsim.service;

import java.util.List;

import generated.Vare;

import javax.jws.WebService;

@WebService
public interface VareService {
    String sayHi(String text);
    boolean sendVare(Vare vare);
    List<Vare> listVarer();
}

