package nestedclass;

import java.sql.SQLException;
/**
 * 사원 정보의 등록/변경/삭제를 실시하는 업무 로직 클래스
 * @author S. ParkMoonSeok
 * @version 2.1
 * @since 1.0
 */
public class EmployeeService {
	/**
	 * 사원 정보를 업데이트한다
	 * @param employeeId 업데이트 대상의 사원ID
	 * @param employeeName 업데이트 후의 사원 이름
	 * @return 업데이트한 건 수
	 * @throws SQLException 업데이트 시에 오류가 발생한 경우
	 */
public int updateEmployee(int employeeId, String employeeName) throws SQLException {
		return 0;
	}
}

