
public class Example {
	public static void main(String[] args) {
		String inputString = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		
		// Parse the input string using the delimiter '\'
		String[] parsedString = inputString.split("\\\\");
		
		// Extract the drive, folders, and file names
		String drive = parsedString[0];
		String fileName = parsedString[parsedString.length-1];
		StringBuilder foldersBuilder = new StringBuilder();
		for(int i=1; i<parsedString.length-1; i++) {
			foldersBuilder.append(parsedString[i]);
			if(i != parsedString.length-2) {
				foldersBuilder.append(" || ");
			}
		}
		String folders = foldersBuilder.toString();
		
		// Display the result in the required format
		System.out.println("Drive: "+ drive);
		System.out.println("Folders: "+ folders);
		System.out.println("File"+ fileName);
	}
}
