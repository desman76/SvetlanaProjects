package lesson17;

import java.util.List;
public class University {
        private String name;
        private List<Department> departments;

        public University(String name, List<Department> departments) {
            this.name = name;
            this.departments = departments;
        }
        public String getName() {
            return name;
        }
        public List<Department> getDepartments() {
            return departments;
        }
    }

