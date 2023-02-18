package Deneme;


    import java.util.ArrayList;
import java.util.List;

    public class Names {
        private List<String> names;

        public Names() {
            this.names = new ArrayList<>();
            this.names.add("John");
            this.names.add("Jane");
            this.names.add("Jim");
        }

        public void addName(String name) {
            this.names.add(name);
        }

        public void removeName(String name) {
            this.names.remove(name);
        }

        public List<String> getNames() {
            return this.names;
        }
    }


