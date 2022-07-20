import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class wallscript {

  wallscript() {
    File tempWallpDir = new File("tempWallpDir.txt");
    try {
      getWallPaperDir();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // if (fileExists()) {
    // // do something
    // }

  }

  public boolean fileExists() {
    File myObj = new File("tempWallpDir.txt");
    if (myObj.exists()) {
      return true;
    } else {
      return false;
    }
  }

  public void createTempWpDirFile() {

  }

  public void getWallPaperDir() throws IOException {
    File file = new File("wallpaperDirectory.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String wallpaperDirectory = br.readLine();
    br.close();
  }

  // public String selectRandom() {

  // }

  public void setWallpaper() {

  }

}
