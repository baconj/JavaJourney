import java.sql.*;

public class testQuery {
    /** connect to the database */
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:c://sqlite/testDB.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Select all rows in the table
     */
    public void selectAll() {
        String sql = "SELECT name, phone, email FROM contacts";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through result set
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" +
                        rs.getString("phone") + "\t" +
                        rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        public static void main(String[] args) {
            testQuery query = new testQuery();
            query.selectAll();
            }
        }


