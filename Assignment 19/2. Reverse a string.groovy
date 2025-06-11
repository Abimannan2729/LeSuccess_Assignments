Scanner sc= new Scanner(System.in)

println "Enter a input String"
 def s= sc.nextLine()
 def chars = s.toCharArray()
 def l=0,r=s.size()-1
 while(l<r){
     temp= chars[r]
     chars[r]=chars[l]
     chars[l]=temp
     l++;
     r--;
 }
 println new String(chars)