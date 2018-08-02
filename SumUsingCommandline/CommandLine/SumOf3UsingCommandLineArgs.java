package CommandLine;

public class SumOf3UsingCommandLineArgs {

	public static void main(String[] args) {
		//ASSIGNING COMMANDLINE ARGUMENTS TO i,j,k
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int k=Integer.parseInt(args[2]);
		int result=i+j+k;//adding all three and assigning to result
		System.out.println("sum will be- "+result);
	}

}
