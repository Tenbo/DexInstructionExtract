package main;


public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ��Ҫɾ������ʱ����
		 */

		if(args.length < 1) {
			System.out.printf("\n\tjava -jar readdex.jar <dex file>\n");
			System.exit(0);
		}
		String fp = args[0];
		int ftype;
		ftype = Utils.getFileType(fp);
		switch (ftype) {
		//file type��APK
		case 0:
			
			break;
		//file type��dex
		case 1:
			byte[] bt = Utils.getData(fp);
			Utils.extraInstructions(bt);
			break;
		default:
			
			break;
		}	
	}	
}
