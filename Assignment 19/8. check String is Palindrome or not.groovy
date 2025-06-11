def ispalindrome(s){
      def l=0,r=s.size()-1
       def chars = s.toCharArray()
 while(l<r){
     if(chars[r]!=chars[l] )return false
     l++;
     r--;
 }
 return true
 }
Scanner sc= new Scanner(System.in)
println "Enter a input String"
def s= sc.nextLine()

println (ispalindrome(s))