package com.mohamed.kessentini.services;

import com.mohamed.kessentini.repository.AprtSelRepositoryImp;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

@Service
public class AprtService {
    private final AprtSelRepositoryImp aprtSelRepositoryImp;

    public AprtService(AprtSelRepositoryImp aprtSelRepositoryImp) {
        this.aprtSelRepositoryImp = aprtSelRepositoryImp;
    }

    public List<Map<String, Object>> firstService(String aidprt, String sft){
        List<Map<String, Object>> rst=aprtSelRepositoryImp.executeSp(aidprt,sft);
        return rst;}

       /* int count = 0;int j = 0;
        do {
            try (ResultSet resultSet = rst) {

                if (statement.getWarnings() != null) {

                    System.out.println("Warning: " + statement.getWarnings().getMessage());
                    statement.clearWarnings();
                    statement.getMoreResults();

                }
                if (resultSet != null) {
                    System.out.println("Résultat #" + (++count));

                    while (resultSet.next()) {
                        for (int i = 1; i <= resultSet.getMetaData().getColumnCount();  i++) {
                            System.out.println(resultSet.getMetaData().getColumnName(i)) ;
                            // Choose the appropriate get method based on the column type

                            if(resultSet.getMetaData().getColumnName(i).equals("aprt_aidgrp"))
                            {
                                System.out.println("ENTREE");
                                aprtObj.setAidgrp(resultSet.getObject(i).toString());

                            }
//                               int columnType = resultSet.getMetaData().getColumnType(i);
//                               switch (columnType) {
//                                   case Types.INTEGER:
//                                       System.out.print(resultSet.getInt(i) + "\t");
//
//                                       break;
//                                   case Types.VARCHAR:
//
//                                       System.out.print(resultSet.getString(i) + "\t");
//                                       break;
//                                   // Add cases for other types as needed
//                                   default:
//                                       System.out.print(resultSet.getObject(i) + "\t");
                            //   }
                        }
                    }
                }
            }   catch (SQLException e) {
                e.printStackTrace();
            }
            j++;
            //  System.out.println(j);
            if(j>100000)
                break;
            statement.getMoreResults();
            //     System.out.println(  statement.getUpdateCount());
        } while (1==1   );*/
    }
//}
