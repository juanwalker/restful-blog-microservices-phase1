package com.benjsicam.restfulblog.service;

import com.benjsicam.restfulblog.domain.Author;
import com.benjsicam.restfulblog.domain.Credentials;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Juan on 13/12/2016.
 */
public class AuthorService {

    public Author findByUsername(String userName) {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl =	"http://localhost:8181/resources/author/";
        HttpEntity<String> request = new HttpEntity<String>(buildHeaders());
        return restTemplate.exchange(fooResourceUrl.concat("/").concat(userName), HttpMethod.GET,request, Author.class).getBody();
//        return 	restTemplate.getForObject(fooResourceUrl.concat("/").concat(userName), Author.class);
    }

    private HttpHeaders buildHeaders(){
        String plainCreds = "admin:admin";
        byte[] plainCredsBytes = plainCreds.getBytes();
        byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        String base64Creds = new String(base64CredsBytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        return headers;
    }

}
