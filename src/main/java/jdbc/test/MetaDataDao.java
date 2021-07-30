package jdbc.test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetaDataDao {

    private DataSource dataSource;

    public MetaDataDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getTableNames(){
        try (
                Connection conn = dataSource.getConnection()
                ) {
            DatabaseMetaData meta = conn.getMetaData();

            return getTableNamesByMetaData(meta);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot read table names", sqle);
        }
    }

    private List<String> getTableNamesByMetaData(DatabaseMetaData meta) throws SQLException {
        try(
                ResultSet rs = meta.getTables(null, null, null, null)
                ) {
            List<String> names = new ArrayList<>();
            while(rs.next()){
                String name = rs.getString(3);
                names.add(name);
            }
            return names;
        }
    }
}
