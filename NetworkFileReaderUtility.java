package edu.mhu.cs.johnnyaraya.finalexam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * @author Johnny
 *
 */
public class NetworkFileReaderUtility {
	
	// The BufferedReader to read the input. */
	private BufferedReader br;
	
	/*
	 * Similar to URL Example from resources
	 */
	public String getNextLine() {
		if(br == null) return null;
		try {
			String line = br.readLine();
			if(line == null)
				br.close();
			return line;
		} catch (Exception e) { return null;}
	}
	
	public boolean readFile(String URL) {
	
	
		try {
			URL u = new URL(URL);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			
			br = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}