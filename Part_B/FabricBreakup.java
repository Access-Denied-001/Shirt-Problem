import java.util.*;
import java.io.*;
public class FabricBreakup {
	public static void main(String args[]) {
		StackInterface goodStack = new Stack();
		StackInterface maxStack = new Stack();
		StackInterface answerStack = new Stack();
		try {
			FileInputStream f = new FileInputStream(args[0]);
			Scanner scan = new Scanner(f);
			int N = scan.nextInt();
			scan.nextLine();
			for(int i=1;i<=N;i++) {
				int operationId=scan.nextInt();
				int actionId=scan.nextInt();
				if(actionId==1){
					int score =scan.nextInt();
					// First element in good shirt
					if(maxStack.isEmpty()||answerStack.isEmpty()){
						goodStack.push(score);
						maxStack.push(score);
						answerStack.push(0);
					}else{
						int maxScore= (int) maxStack.top();
						if(score<maxScore){
							goodStack.push(score);
							int currentValue = (int)answerStack.pop();
							currentValue++;
							answerStack.push(currentValue);
						}else{
							goodStack.push(score);
							maxStack.push(score);
							answerStack.push(0);
						}
					}
				}else{
					if(maxStack.isEmpty() || answerStack.isEmpty()){
						System.out.println(operationId+" "+-1);
					}else{
						maxStack.pop();
						int answer=(int)answerStack.pop();
						System.out.println(operationId+" "+answer);
					}
				}
			}
		}catch (Exception e){
			System.out.println("File not found");
		}

	}
}
