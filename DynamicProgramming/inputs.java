package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class inputs
{
    public BufferedReader reader;
    public StringTokenizer token;

    inputs(InputStream str)
    {
        reader=new BufferedReader(new InputStreamReader(str));
        token=null;
    }

    int nextInt()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Integer.parseInt(token.nextToken());
    }

    long nextLong()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Long.parseLong(token.nextToken());
    }

    String next()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return token.nextToken();
    }

}