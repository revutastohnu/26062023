package HW12.phoneBook;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
        List<Record> records;

        public Phonebook() {
            this.records = new ArrayList<>();
        }

    public void add(Record record) {
        this.records.add(record);
    }

        public Record find(String name) {
            for (Record record : this.records) {
                if (record.getName().equals(name)) {
                    return record;
                }
            }
            return null;
        }
    public List<Record> findAll() {
        return records.isEmpty() ? null : new ArrayList<>(records);
    }
}
