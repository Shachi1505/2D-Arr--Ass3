public class Soln{
  int m=3; int n=3;
  int[][] mat = new int[n][m];
  for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
int[][] arr = new int[n][m];
for (int i = 0; i < n; i++) {
 for (int j = 0; j < m; j++) {
      arr[i][j] = mat[i][j];
   if(i==0 && j==0) continue;
   else if (i==0) arr[i][j] += arr[i][j-1];
   else if(j==0)  arr[i][j] += arr[i - 1][j];
   else arr[i][j] += arr[i - 1][j] + arr[i][j - 1];
     
            }
}
System.out.println("Prefix sum matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
}
