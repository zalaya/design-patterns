package xyz.zalaya;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Database {

    private static Database instance;

    private Database() { }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

}
