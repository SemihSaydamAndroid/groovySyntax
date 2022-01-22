package mediumCompileTimeMetaProg.Singleton
/**
 * @author Semih Saydam
 * @since 22.01.2022
 */
@Singleton  //Singleton sayesinde o class'tan sadece 1 tane instance olduğunu biliyoruz.
class DatabaseConnection {

    static void main(String[] args) {
//        DatabaseConnection dbConnection = new DatabaseConnection()
//        println(dbConnection)

        DatabaseConnection dbConnection = DatabaseConnection.instance
        println(dbConnection)
    }
}
