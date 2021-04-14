package designpattern;


abstract class Connection {
	// 임의의 처리 
}

abstract class Configuration {
	// 임의의 처리 
}

interface Factory {
	Connection getConnection();
	Configuration getConfiguration(); 
}

class OracleConnection extends Connection {
	OracleConnection(){
		System.out.println("오라클 연결");
	}
}

class OracleConfiguration extends Configuration {
	OracleConfiguration(){
		System.out.println("오라클 환경 설정");
	}
}

class OracleFactory implements Factory { 
	@Override
	public Connection getConnection() { 
		return new OracleConnection();
	}
	@Override
	public Configuration getConfiguration() {
		return new OracleConfiguration();
	}
}



class MySQLConnection extends Connection {
	MySQLConnection(){
		System.out.println("MySQL 연결");
	}
}

class MySQLConfiguration extends Configuration {
	MySQLConfiguration(){
		System.out.println("MySQL 환경 설정");
	}
}

class MySQLFactory implements Factory { 
	@Override
	public Connection getConnection() { 
		return new MySQLConnection();
	}
	@Override
	public Configuration getConfiguration() {
		return new MySQLConfiguration(); 
	}
}

class DBFactory{
	public static Factory createFactory(String env) { 
		switch (env) {
		case "Oracle":
			return new OracleFactory();
		case "MySQL":
			return new MySQLFactory();
		default:
			throw new IllegalArgumentException(env);
		} 
	}
}

public class AbstracFactoryPattern {

	public static void main(String[] args) {
		String env = "Oracle";
		Factory factory = DBFactory.createFactory(env);
		Connection connection = factory.getConnection(); 
		Configuration configuration = factory.getConfiguration();

	}
}
