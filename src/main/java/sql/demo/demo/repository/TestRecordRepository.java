package sql.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sql.demo.demo.entity.TestRecord;

public interface TestRecordRepository extends JpaRepository<TestRecord, Long> {
}

