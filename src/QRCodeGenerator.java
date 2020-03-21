import java.io.*;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class QRCodeGenerator {
    public static void main(String args[]) throws Exception
    {
        String str="supriya akula - santhu san:venkat kumari..";
        ByteArrayOutputStream out=QRCode.from(str).to(ImageType.JPG).stream();
        File f=new File("E:\\Libs\\MyChannel.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
}
}