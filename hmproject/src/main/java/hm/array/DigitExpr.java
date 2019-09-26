package hm.array;

import java.util.ArrayList;
import java.util.List;

public class DigitExpr {
	public ArrayList<String> answer;
	public ArrayList<String> signExpr = new ArrayList<String>();
	public String digits;
	public long target;

	public void recurse(int index, long previousOperand, long currentOperand, long value, ArrayList<String> ops) {
		String nums = this.digits;
		if (index == nums.length()) {
			if (value == this.target && currentOperand == 0) {
				StringBuilder sb = new StringBuilder();
				ops.subList(1, ops.size()).forEach(v -> sb.append(v));
				this.answer.add(sb.toString());
			}
			return;
		}
		currentOperand = Character.getNumericValue(nums.charAt(index));
		String current_val_rep = Long.toString(currentOperand);
		if (currentOperand > 0) {
			recurse(index + 1, previousOperand, currentOperand, value, ops);
		}
		ops.add("+");
		ops.add(current_val_rep);
		recurse(index + 1, currentOperand, 0, value + currentOperand, ops);
		ops.remove(ops.size() - 1);
		ops.remove(ops.size() - 1);

		if (ops.size() > 0) {
			ops.add("-");
			ops.add(current_val_rep);
			recurse(index + 1, -currentOperand, 0, value - currentOperand, ops);
			ops.remove(ops.size() - 1);
			ops.remove(ops.size() - 1);

		}
	}

	public void addOperators(String num, int target) {

		if (num.length() == 0) {
			// return new ArrayList<String>();
		}

		this.target = target;
		this.digits = num;
		this.answer = new ArrayList<String>();
		this.recurse(0, 0, 0, 0, new ArrayList<String>());
		System.out.println("Answer ::" + answer);
		int length = num.length() + (num.length() - 1);
		for (int i = 0; i < answer.size(); i++) {
			if (answer.get(i).length() == length) {
				System.out.println("Passing value is  ::" + answer.get(i));
				getSignExpr(answer.get(i));
				break;
			}

		}
	}

	public List<String> getSignExpr(String answer) {
		char array[] = answer.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("signExpr Answer ::" + array[i]);
			if (array[i] == '+' || array[i] == '-') {
				signExpr.add("" + array[i]);
			}

		}
		System.out.println("signExpr Answer ::" + signExpr);
		return signExpr;
	}

}
