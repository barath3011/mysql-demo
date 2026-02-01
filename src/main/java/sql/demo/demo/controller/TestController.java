package sql.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sql.demo.demo.entity.TestRecord;
import sql.demo.demo.repository.TestRecordRepository;

@RestController
public class TestController {

    private final TestRecordRepository repository;

    public TestController(TestRecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/test-db")
    public String testDb() {
        TestRecord record = new TestRecord("Hello from Clever Cloud MySQL");
        repository.save(record);

        return "Saved record with ID: " + record.getId();
    }

    @GetMapping("/test")
    public String test() {
        return "Spring Boot is running!";
    }

    @GetMapping("/health2")
    public String health() {
        return "App + DB config OK2";
    }
}

