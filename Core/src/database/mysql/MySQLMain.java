package database.mysql;

public class MySQLMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MySQLAccess dao = new MySQLAccess();
			dao.readDataBase();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
