all:
	javac -d ../classes/ -cp ../classes/ EmptyStackException.java
	javac -d ../classes/ -cp ../classes/ StackInterface.java
	javac -d ../classes/ -cp ../classes/ Stack.java
	javac -d ../classes/ -cp ../classes/ StackTester.java
	javac -d ../classes/ -cp ../classes/ FabricBreakup.java
	java -cp ../classes/ FabricBreakup sampleInputFile.txt > myoutfile.txt
	java -cp ../classes/ StackTester
	py verify.py C:\Users\pwd\Downloads\College\COL106\Assignments\A1\Starter Code\Part_B\testin C:\Users\pwd\Downloads\College\COL106\Assignments\A1\Starter Code\Part_B\testout


clean:
	rm ../classes/EmptyStackException.class ../classes/StackInterface.class ../classes/Stack.class ../classes/StackTester.class ../classes/FabricBreakup.class
