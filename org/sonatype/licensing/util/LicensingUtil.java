package org.sonatype.licensing.util;

import codeguard.licensing.Obfuscator;
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class LicensingUtil {
  public static final String LINE_SEPERATOR = System.getProperty("line.separator");
  
  public static final String PACKAGE_PREFIX = (new Obfuscator(new long[] { -1956725044763736505L, -8653607204494632877L, -1534585266971579493L })).toString();
  
  private static final char yyj = '\\';
  
  public static String unobfuscate(long[] paramArrayOflong) {
    return (new Obfuscator(paramArrayOflong)).toString();
  }
  
  public static String obfuscate(String paramString) {
    return Obfuscator.obfuscate(paramString);
  }
  
  public static String getPackage(String paramString) {
    return PACKAGE_PREFIX + "/" + paramString;
  }
  
  public static void clearPreferences() throws BackingStoreException {
    Preferences preferences = Preferences.userRoot().node(PACKAGE_PREFIX);
    itm(preferences);
  }
  
  private static void itm(Preferences paramPreferences) throws BackingStoreException {
    for (String str : paramPreferences.childrenNames()) {
      Preferences preferences = paramPreferences.node(str);
      for (String str1 : preferences.keys())
        preferences.remove(str1); 
      itm(preferences);
    } 
  }
  
  public static void main(String[] paramArrayOfString) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str;
    while ((str = bufferedReader.readLine()) != null) {
      String str1 = Obfuscator.obfuscate(str);
      System.out.println(str1);
    } 
  }
  
  public static String encodeDNPart(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfChar = new char[paramString.length()];
    paramString.getChars(0, paramString.length(), arrayOfChar, 0);
    for (char c : arrayOfChar) {
      switch (c) {
        case '"':
        case '#':
        case '+':
        case ',':
        case ';':
        case '\\':
          stringBuilder.append('\\').append(c);
          break;
        case '\n':
          stringBuilder.append(' ');
          break;
        default:
          stringBuilder.append(c);
          break;
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static String decodeDNPart(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    char[] arrayOfChar = new char[paramString.length()];
    paramString.getChars(0, paramString.length(), arrayOfChar, 0);
    boolean bool = false;
    for (char c : arrayOfChar) {
      switch (c) {
        case '\\':
          if (bool) {
            stringBuilder.append(c);
            break;
          } 
          bool = true;
          break;
        default:
          bool = false;
          stringBuilder.append(c);
          break;
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static List<String> getDNParts(String paramString) {
    ArrayList<String> arrayList = Lists.newArrayList();
    if (paramString == null || paramString.length() == 0)
      return arrayList; 
    StringBuilder stringBuilder = new StringBuilder();
    String str = paramString.trim();
    char[] arrayOfChar = new char[str.length()];
    str.getChars(0, paramString.length(), arrayOfChar, 0);
    boolean bool = false;
    for (char c : arrayOfChar) {
      switch (c) {
        case '\\':
          if (bool) {
            stringBuilder.append(c);
            break;
          } 
          bool = true;
          break;
        case ',':
          if (bool) {
            stringBuilder.append(c);
            bool = false;
            break;
          } 
          arrayList.add(stringBuilder.toString());
          stringBuilder = new StringBuilder();
          break;
        default:
          bool = false;
          stringBuilder.append(c);
          break;
      } 
    } 
    arrayList.add(stringBuilder.toString());
    return arrayList;
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\org\sonatype\licensin\\util\LicensingUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */