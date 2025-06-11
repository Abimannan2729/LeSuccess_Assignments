 // using groovy 
Scanner sc= new Scanner(System.in)

println "Enter a input String"
 def s= sc.nextLine()
 count=0;
 for( i=0;i<s.size();i++){
     def ch=Character.toLowerCase(s.charAt(i))
     if (ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) count++;
 }
 println count