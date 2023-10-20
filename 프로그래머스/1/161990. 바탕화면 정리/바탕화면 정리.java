class Solution {
    public int[] solution(String[] wallpaper) {
        int row = wallpaper.length;
		int col = wallpaper[0].length();
		int row_min = row;
		int row_max = 0;
		int col_min = col;
		int col_max = 0;
        
        for(int a = 0; a<row;a++) {
			for(int b=0; b<col;b++) {
				if(wallpaper[a].charAt(b)=='#') {
					if(a<row_min) {
						row_min = a;
					}
					if(b<col_min) {
						col_min = b;
					}
					if(a>row_max) {
						row_max = a;
					}
					if(b>col_max) {
						col_max = b;
					}
				}
			}
		}
        int[] answer = {row_min,col_min,row_max+1,col_max+1};
        return answer;
    }
}