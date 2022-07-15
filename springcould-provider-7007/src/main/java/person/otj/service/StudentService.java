package person.otj.service;
import org.springframework.stereotype.Service;
import person.otj.pojo.Student;
import java.util.List;

public interface StudentService {
    List<Student>selectBySname(Student student);
}