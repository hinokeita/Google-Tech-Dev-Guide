# README

課題

Fix this duplicate collapsing code: public String collapseDuplicates(String a) { int i = 0; String result = ""; while (i < a.length()) { char ch = a.charAt(i); result += ch; while (a.charAt(i+1) == ch) { i++; } i++; } return result; }

collapseDuplicates("a") → "a"     
collapseDuplicates("aa") → "a"    
collapseDuplicates("abc") → "abc"   
