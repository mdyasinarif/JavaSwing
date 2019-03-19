
package ssbbss.DBOperation;

import java.util.List;
import ssbbss.pojo.SavingAC;



public interface TransationDAO {
     void save(SavingAC ts);
     SavingAC getByAccountNo(int AccountNo);
     List<SavingAC> findAll();
}
