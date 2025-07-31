package codeguard.licensing;

import java.io.UnsupportedEncodingException;
import java.util.Random;

//quf
public final class Obfuscator {
  private static final String CODIROVKA = new String(new char[] { 'U', 'T', 'F', '8' });
  
  private final long[] lbx;
  
  public static void main(String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length; b++)
      System.out.println(obfuscate(paramArrayOfString[b])); 
  }
  
  public static String obfuscate(String paramString) {
    byte[] arrayOfByte;
    if (-1 != paramString.indexOf("\0"))
      throw new IllegalArgumentException((new Obfuscator(new long[] { 2598583114197433456L, -2532951909540716745L, 1850312903926917213L, -7324743161950196342L, 3319654553699491298L })).toString());
    try {
      arrayOfByte = paramString.getBytes(CODIROVKA);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
    Random random = new Random();
    while (true) {
      long l = random.nextLong();
      if (l != 0L) {
        random = new Random(l);
        StringBuffer stringBuffer = new StringBuffer((new Obfuscator(new long[] { -6733388613909857970L, -557652741307719956L, 563088487624542180L, 5623833171491374716L, -2309350771052518321L, 2627844803624578169L })).toString());
        itm(stringBuffer, l);
        int i = arrayOfByte.length;
        for (byte b = 0; b < i; b += 8) {
          long l1 = random.nextLong();
          long l2 = itm(arrayOfByte, b) ^ l1;
          stringBuffer.append(", ");
          itm(stringBuffer, l2);
        } 
        stringBuffer.append((new Obfuscator(new long[] { 4756003162039514438L, -7241174029104351587L, 2576762727660584163L, 2432800632635846553L })).toString());
        stringBuffer.append(paramString.replaceAll("\\\\", (new Obfuscator(new long[] { 7866777055383403009L, -5101749501440392498L })).toString()).replaceAll("\"", (new Obfuscator(new long[] { -8797265930671803829L, -5738757606858957305L })).toString()));
        stringBuffer.append((new Obfuscator(new long[] { -4228881123273879289L, 1823585417647083411L })).toString());
        return stringBuffer.toString();
      } 
    } 
  }
  
  private static void itm(StringBuffer paramStringBuffer, long paramLong) {
    paramStringBuffer.append('0');
    paramStringBuffer.append('x');
    paramStringBuffer.append(Long.toHexString(paramLong).toUpperCase());
    paramStringBuffer.append('L');
  }
  
  private static long itm(byte[] paramArrayOfbyte, int paramInt) {
    int i = Math.min(paramArrayOfbyte.length, paramInt + 8);
    long l = 0L;
    int j = i;
    while (--j >= paramInt) {
      l <<= 8L;
      l |= (paramArrayOfbyte[j] & 0xFF);
    } 
    return l;
  }
  
  private static void itm(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    int i = Math.min(paramArrayOfbyte.length, paramInt + 8);
    for (int j = paramInt; j < i; j++) {
      paramArrayOfbyte[j] = (byte)(int)paramLong;
      paramLong >>= 8L;
    } 
  }
  
  public Obfuscator(long[] paramArrayOflong) {
    this.lbx = (long[])paramArrayOflong.clone();
  }
  
  public String toString() {
    String str;
    int i = this.lbx.length;
    byte[] arrayOfByte = new byte[8 * (i - 1)];
    long l = this.lbx[0];
    Random random = new Random(l);
    for (byte b = 1; b < i; b++) {
      long l1 = random.nextLong();
      itm(this.lbx[b] ^ l1, arrayOfByte, 8 * (b - 1));
    } 
    try {
      str = new String(arrayOfByte, CODIROVKA);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
    int j = str.indexOf("\0");
    return (-1 == j) ? str : str.substring(0, j);
  }
}


/* Location:              C:\User\\user\Downloads\license-bundle-1.6.0.jar!\codeguard\licensing\qyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */