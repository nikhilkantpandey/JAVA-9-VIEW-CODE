
/*public class Tester {

}*/
public class Tester {
  /* public static void main(String []args) {
      LogOracle log = new LogOracle();
      log.logInfo("");
      log.logWarn("");
      log.logError("");
      log.logFatal("");
      LogMySql log1 = new LogMySql();
      log1.logInfo("");
      log1.logWarn("");
      log1.logError("");
      log1.logFatal("");
   }
}
final class LogOracle implements Logging {
   @Override
   public void logInfo(String message) {
      getConnection();
      System.out.println("Log Message : " + "INFO");
      closeConnection();
   }
   @Override
   public void logWarn(String message) {
      getConnection();
      System.out.println("Log Message : " + "WARN");
      closeConnection();
   }
   @Override
   public void logError(String message) {
      getConnection();
      System.out.println("Log Message : " + "ERROR");
      closeConnection();
   }
   @Override
   public void logFatal(String message) {
      getConnection();
      System.out.println("Log Message : " + "FATAL");
      closeConnection();
   }
   @Override
   public void getConnection() {
      System.out.println("Open Database connection");
   }
   @Override
   public void closeConnection() {
      System.out.println("Close Database connection");
   }
}
final class LogMySql implements Logging {
   @Override
   public void logInfo(String message) {
      getConnection();
      System.out.println("Log Message : " + "INFO");
      closeConnection();
   }
   @Override
   public void logWarn(String message) {
      getConnection();
      System.out.println("Log Message : " + "WARN");
      closeConnection();
   }
   @Override
   public void logError(String message) {
      getConnection();
      System.out.println("Log Message : " + "ERROR");
      closeConnection();
   }
   @Override
   public void logFatal(String message) {
      getConnection();
      System.out.println("Log Message : " + "FATAL");
      closeConnection();
   }
   @Override
   public void getConnection() {
      System.out.println("Open Database connection");
   }
   @Override
   public void closeConnection() {
      System.out.println("Close Database connection");
   }
}
interface Logging {
   String ORACLE = "Oracle_Database";
   String MYSQL = "MySql_Database";

   void logInfo(String message);
   void logWarn(String message);
   void logError(String message);
   void logFatal(String message);

   void getConnection();
   void closeConnection();
}*/
	public interface TempI {
		 
	    public abstract void div(int a, int b);
	 
	public default void
	    add(int a, int b)
	    {
	        System.out.print("Answer by Default method = ");
	        System.out.println(a + b);
	    }
	 
	    public static void mul(int a, int b)
	    {
	        System.out.print("Answer by Static method = ");
	        System.out.println(a * b);
	    }
	}
	 
	static class Temp implements TempI {
	 
	    @Override
	    public void div(int a, int b)
	    {
	        System.out.print("Answer by Abstract method = ");
	        System.out.println(a / b);
	    }
	 
	    public static void main(String[] args)
	    {
	        TempI in = new Temp();
	        in.div(8, 2);
	        in.add(3, 1);
	        TempI.mul(4, 1);
	    }
	}
}
