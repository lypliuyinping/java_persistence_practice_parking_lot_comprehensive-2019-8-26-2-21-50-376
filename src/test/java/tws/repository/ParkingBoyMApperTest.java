package tws.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingBoyMApperTest {

	@Autowired
	private ParkingBoyMapper parkingBoyMapper;
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "parking_boy");
    }
    // 查询测试
    @Test
    public void shouldFetchAllParkingboys() {
    	//given
    	jdbcTemplate.execute("INSERT INTO PARKING_BOY VALUES(5,'zhangsan',21);");   	
    	//when
    	List<ParkingBoy>  parkingBoys = parkingBoyMapper.selectAll();   	
    	//then
    	assertEquals(1, parkingBoys.size());
    }
    // 插入测试
    @Test
    public void shouldFetchParkingboysWhenInsterParkingboys() {
    	//given
    	jdbcTemplate.execute("INSERT INTO PARKING_BOY VALUES(5,'zhangsan',21);");  	
    	//when
    	List<ParkingBoy>  parkingBoys = parkingBoyMapper.selectAll();
    	//then	
    	assertEquals("zhangsan", parkingBoys.get(0).getParkingBoyName()); 
    } 
}
