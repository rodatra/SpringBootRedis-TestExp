import data.redis.model.Student;
import data.redis.repo.StudentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EntFileTest extends ApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test1(){
//        Add key
        Student engStudent = new Student(
                "Eng2015001", "John Doe", Student.Gender.MALE, 1);
        Student medStudent = new Student(
                "Med2015001", "Gareth Houston", Student.Gender.MALE, 2);
        studentRepository.save(engStudent);
        studentRepository.save(medStudent);

//        Get key
//        Student retrievedStudent =
//                studentRepository.findById("Eng2015001").get();
//        System.out.println(retrievedStudent);

//        Update key
//        Student retrievedStudent =
//                studentRepository.findById("Eng2015001").get();
//        retrievedStudent.setName("Richard Watson");
//        studentRepository.save(retrievedStudent);

//        Delete key
//        studentRepository.deleteById("Eng2015001");

//        Get all keys
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        students.stream().forEach(System.out::println);

    }
}