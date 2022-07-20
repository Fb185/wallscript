import java.io.File;
import java.io.IOException;

public class wallscript {

  wallscript() {
    if (fileExists()) {

    }

  }

  public void getWallPaperDir() {

  }

  public boolean fileExists() {
    File myObj = new File("tempWallpDir.txt");
    if (myObj.exists()) {
      return true;
    } else {
      return false;
    }
  }
}
