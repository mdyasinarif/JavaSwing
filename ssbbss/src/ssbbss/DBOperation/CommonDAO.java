
package ssbbss.DBOperation;

import java.util.List;
import ssbbss.domain.CreateInvestment;


public interface CommonDAO {
     void save(CreateInvestment ci);
     void update(CreateInvestment ci);
     void delete(CreateInvestment ci);
     void deleteByAccountNo(String AccountNo);
     CreateInvestment getByAccountNo(int AccountNo);
     List<CreateInvestment> findAll();
}
