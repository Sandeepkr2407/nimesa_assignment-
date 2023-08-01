package com.nimesa.nimesa_test_project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NimesaTestProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	LocationServiceTest locationServiceTest;
	
	@Test
	public void testCase1() throws ParseException {
		int input = 1;
		String date = "2019-03-27";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase2() throws ParseException {
		int input = 2;
		String date = "2019-03-27";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase3() throws ParseException {
		int input = 3;
		String date = "2019-03-27";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);

}
	@Test
	public void testCase4() throws ParseException {
		int input = 1;
		String date = "2019-03-28";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase5() throws ParseException {
		int input = 2;
		String date = "2019-03-28";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase6() throws ParseException {
		int input = 3;
		String date = "2019-03-28";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);

}
	@Test
	public void testCase7() throws ParseException {
		int input = 1;
		String date = "2019-03-29";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase8() throws ParseException {
		int input = 2;
		String date = "2019-03-29";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase9() throws ParseException {
		int input = 3;
		String date = "2019-03-29";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);

}
	@Test
	public void testCase10() throws ParseException {
		int input = 1;
		String date = "2019-03-30";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase11() throws ParseException {
		int input = 2;
		String date = "2019-03-30";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase12() throws ParseException {
		int input = 3;
		String date = "2019-03-30";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
}
	@Test
	public void testCase13() throws ParseException {
		int input = 1;
		String date = "2019-03-31";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase14() throws ParseException {
		int input = 2;
		String date = "2019-03-31";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase15() throws ParseException {
		int input = 3;
		String date = "2019-03-31";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
}
	@Test
	public void testCase16() throws ParseException {
		int input = 0;
		String date = "2019-03-27";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase17() throws ParseException {
		int input = 0;
		String date = "2019-03-28";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
}
	@Test
	public void testCase18() throws ParseException {
		int input = 0;
		String date = "2019-03-29";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	
	@Test
	public void testCase19() throws ParseException {
		int input = 0;
		String date = "2019-03-30";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
	}
	@Test
	public void testCase20() throws ParseException {
		int input = 0;
		String date = "2019-03-31";
		Map<String, ArrayList<Double>> result = locationServiceTest.locationTest(input, date);
		System.out.println(result);
}

	
}
