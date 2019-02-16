
package swingJdbcBasdic.Serivce;

import java.util.List;
import swingJdbcBasdic.pojo.Student;


public interface CommonDAO {
     void save(Student obj);
     void update(Student obj);
     void delete(Student obj);
     void deleteById(int id);
     Student getById(int id);
     List<Student> findAll();
}
