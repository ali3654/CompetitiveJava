public class Knapsackproblem {
	private int weight[];
	private int Value[];
	private int result;
	
	
	public Knapsackproblem(int weight[]) {
		this.weight = weight;
		this.Value = new int[weight.length];
	}
	
	public int KS(int spot, int C) {
		if (spot == 0 || C == 0) {
			result = 0;
		}
		else if (weight[spot] > C) {
			result = KS(spot-1, C);
			}else {
				int tmp1 = KS(spot-1, C);
				int tmp2 = Value[spot] + KS(spot-1, C - weight[spot]);
				result = Math.max(tmp1, tmp2);
	
				}
		return result;
			}
		}
		
		
	

