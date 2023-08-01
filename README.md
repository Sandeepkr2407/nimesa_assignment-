# nimesa_test_project

QA Engineer Intern_Assignment Round


Test cases
---------------
	
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
------------------------------

Output
-------------------------------------


{2019-03-27=[278.76, 278.4, 277.71, 277.32, 276.96, 276.491]}
{2019-03-27=[1.6, 1.49, 1.58, 1.66, 1.6, 1.38]}
{2019-03-27=[1031.934, 1033.061, 1033.968, 1034.661, 1035.082, 1035.273]}
{2019-03-28=[276.081, 275.712, 275.358, 274.954, 274.805, 274.744, 275.267, 277.0, 278.8, 280.6, 281.8, 282.933, 283.888, 284.6, 285.021, 284.9, 284.231, 282.595, 280.849, 279.9, 279.3, 278.775, 278.326, 278.0]}
{2019-03-28=[1.13, 0.93, 0.76, 0.58, 0.48, 0.49, 0.61, 1.04, 1.61, 2.25, 2.77, 3.01, 3.12, 3.31, 3.49, 3.64, 3.5, 3.21, 3.21, 3.16, 2.96, 2.65, 2.37, 2.12]}
{2019-03-28=[1035.227, 1035.094, 1035.008, 1035.01, 1035.079, 1035.228, 1035.421, 1034.79, 1034.179, 1033.734, 1033.315, 1032.889, 1032.449, 1031.936, 1031.435, 1031.28, 1031.355, 1031.93, 1033.033, 1033.945, 1034.455, 1034.815, 1034.999, 1034.992]}
{2019-03-29=[277.6, 277.16, 276.739, 276.465, 276.078, 275.682, 276.125, 277.8, 279.874, 281.851, 283.525, 284.836, 285.888, 286.551, 286.945, 286.874, 286.426, 284.8, 282.945, 281.849, 281.1, 280.464, 279.896, 279.443]}
{2019-03-29=[1.96, 1.95, 2.0, 2.1, 2.28, 2.39, 2.5, 3.05, 3.45, 3.88, 4.18, 4.23, 4.01, 3.68, 3.32, 2.94, 2.59, 2.37, 2.43, 2.47, 2.32, 1.88, 1.46, 1.21]}
{2019-03-29=[1034.874, 1034.624, 1034.345, 1034.124, 1033.979, 1033.842, 1033.614, 1032.628, 1031.838, 1031.349, 1030.794, 1030.155, 1029.426, 1028.625, 1027.913, 1027.432, 1027.195, 1027.564, 1028.448, 1029.256, 1029.672, 1029.773, 1029.712, 1029.667]}
{2019-03-30=[279.011, 278.65, 278.319, 277.98, 277.707, 277.295, 277.977, 280.019, 282.377, 284.504, 286.404, 287.804, 288.805, 289.331, 289.448, 289.3, 288.852, 287.0, 284.921, 284.107, 283.481, 282.731, 282.031, 281.345]}
{2019-03-30=[1.06, 1.07, 1.22, 1.47, 1.61, 1.63, 1.65, 1.66, 1.86, 1.91, 1.99, 2.16, 2.26, 2.22, 2.05, 1.85, 1.54, 1.05, 0.75, 0.37, 0.44, 1.24, 1.7, 1.9]}
{2019-03-30=[1029.659, 1029.548, 1029.405, 1029.25, 1029.092, 1029.07, 1028.86, 1027.856, 1026.804, 1025.983, 1025.078, 1024.221, 1023.499, 1022.782, 1022.062, 1021.556, 1021.245, 1021.473, 1022.206, 1022.954, 1023.319, 1023.413, 1023.284, 1023.085]}
{2019-03-31=[280.755, 280.239, 280.065, 280.302, 280.533, 280.4, 280.652, 281.777, 282.933, 283.906, 284.568, 286.2, 285.683, 285.221, 284.535, 283.6, 282.695, 281.5]}
{2019-03-31=[2.02, 2.05, 1.99, 2.05, 2.15, 2.34, 2.48, 2.72, 2.59, 2.34, 1.9, 3.19, 5.29, 5.97, 5.84, 5.41, 5.33, 5.0]}
{2019-03-31=[1022.786, 1022.381, 1022.085, 1021.907, 1021.802, 1021.819, 1021.732, 1021.023, 1020.601, 1020.44, 1020.102, 1019.724, 1019.562, 1019.558, 1019.713, 1020.222, 1020.903, 1021.88]}

