package OOPS;

abstract class Persistence {
    abstract void persist(String data);
}

class FilePersistence extends Persistence {
    @Override
    void persist(String data) {
        System.out.println("Data saved to a file: " + data);
    }
}

class DatabasePersistence extends Persistence {
    @Override
    void persist(String data) {
        System.out.println("Data saved to a database: " + data);
    }
}

public class Client {
    public static void main(String[] args) {
        Persistence persistence;
        boolean useFilePersistence = true;
        if (useFilePersistence) {
            persistence = new FilePersistence();
        } else {
            persistence = new DatabasePersistence();
        }
        persistence.persist("Some data to be saved.");
    }
}