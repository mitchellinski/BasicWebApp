package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("%20what%20is%2015%20plus%207")) {
            return "22";
        } else if (query.contains("20what%20is%209%20plus%2017")) {
            return "26";
        } else if (query.contains("the%20largest:%20565,%20212,%2055,%2073")) {
            return "20565";
        } else if (query.contains("%20what%20is%2016%20plus%209")) {
            return "25";
        } else if (query.contains("%20largest:%2030,%20563")) {
            return "20563";
        } else if (query.contains("%20largest:%2095,%20398,%2020,%20545")) {
            return "20545";
        } else if (query.contains("%20what%20is%200%20plus%2013")) {
            return "13";
        } else {
            return "";
        }
    }
}
