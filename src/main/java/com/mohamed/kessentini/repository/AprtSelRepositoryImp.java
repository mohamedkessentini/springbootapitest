package com.mohamed.kessentini.repository;

import com.mohamed.kessentini.entity.Aprt;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AprtSelRepositoryImp implements AprtSelRepository{
    private final JdbcTemplate jdbcTemplate;
    public AprtSelRepositoryImp (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public String testMka() {
        return null;
    }

    @Override
    public String callAprtsel(String aidprt) {
        String sp_name="ADMIN..aprt_sel_01 @aidprt=?, @sft=?";
        return sp_name;
    }
    @Override
    public List<Map<String, Object>> executeSp(String aidprt, String sft) {
/*		jdbcTemplate.execute("Drop table #apri_01  \n");
        String sqlCreate = "CREATE TABLE #apri_01  (" +
                "    azprto CHAR(7), " +
                "    azprtc CHAR(7) NULL, " +
                "    allprt CHAR(30) NULL, " +
                "    acdtpo CHAR(2) NULL, " +
                "    alltpo CHAR(30) NULL, " +
                "    type CHAR(1) NULL " +
                ")";*/

      //  jdbcTemplate.execute(sqlCreate);

        String sql ="EXEC "+ callAprtsel(aidprt);//"EXEC ADMIN..aprt_sel_01 @aidprt=?, @sft=?";
        return jdbcTemplate.queryForList(sql, aidprt, sft);
    }

}
