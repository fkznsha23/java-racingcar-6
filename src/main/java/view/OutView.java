package view;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import model.OutputImpo;

public class OutView {

	private static final String OUT_RESULT_MESSAGE = "실행결과";
	private static final String OUT_WINNER = "최종 우승자 : ";
	
	public static void showResultMessage() {
		System.out.println(OUT_RESULT_MESSAGE);
	}
	
	public static void showResult(Car car, int i) {
		OutputImpo.showMovingProcess(car, i);
	}

	public static void showWinner(List<Car> carList) {
		System.out.print(OUT_WINNER);
		int max = OutputImpo.WinnerValue(carList);
		
		List<String> winnerList = new ArrayList<>();
		OutputImpo out = new OutputImpo(winnerList);
		for(Car car : carList) {
			winnerList = out.addWinner(car, max);
		}
		
		StringBuilder builder = new StringBuilder();
		for(String winner : winnerList) {
			builder.append(winner).append(", ");
		}
		String formatWinner = builder.toString();
		System.out.println(formatWinner);
	}
}