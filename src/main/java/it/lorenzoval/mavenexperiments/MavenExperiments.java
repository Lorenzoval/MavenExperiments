package it.lorenzoval.mavenexperiments;

import java.io.InputStream;
import java.io.IOException;

import java.net.URL;
import java.net.MalformedURLException;

import org.apache.commons.io.IOUtils;

public class MavenExperiments {

	public static void main(String[] args) {
		try (InputStream in = new URL("https://commons.apache.org").openStream()) {
			System.out.println(IOUtils.toString(in, "UTF-8"));
		} catch (MalformedURLException mue) {
			System.out.println("MalformedURLException");
		} catch (IOException ioe) {
			System.out.println("IOException");
		}

	}

}
