public class Codec {
    HashMap<String,String> map=new HashMap<>();
    int n=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encoded="http://tinyurl.com/"+String.valueOf(n);
        n++;
        map.put(encoded,longUrl);
        return encoded;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));