
package ssbbss.DBOperation;

import java.util.List;
import ssbbss.domain.OpenInvestment;


public interface InvestmentDAO {
     void save(OpenInvestment ci);
     void update(OpenInvestment ci);
     void delete(OpenInvestment ci);
     void deleteByAccountNo(String AccountNo);
     OpenInvestment getByAccountNo(int AccountNo);
     List<OpenInvestment> findAll();
}
