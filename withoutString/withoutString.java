class Test1{
  public static void main(String args[]){
    System.out.println(withoutString("Hello there","llo"));
    System.out.println(withoutString("Hello there","e"));
    System.out.println(withoutString("Hello there","x"));
    System.out.println(withoutString("This is a FISH","IS"));
  }

  public static String withoutString(String base, String remove) {
    base = base.replaceAll(remove, "");
    base = base.replaceAll(remove.toUpperCase(), "");
    base = base.replaceAll(remove.toLowerCase(), "");
    return base;
  }

}
