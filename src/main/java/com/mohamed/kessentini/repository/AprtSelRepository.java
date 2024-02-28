package com.mohamed.kessentini.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface AprtSelRepository {
    List<Map<String, Object>> executeSp(String aidprt, String sft);
    String testMka();
    String callAprtsel(String aidprt);

}
