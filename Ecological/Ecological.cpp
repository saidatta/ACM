/* Ecological Bin Packing
   bay #102*/
   

#include <stdio.h>
#include <string.h>
int main(void) {
	while (1) {
		int b[3], g[3], c[3];
		if (scanf("%d%d%d%d%d%d%d%d%d\n", b, g, c,
				b+1, g+1, c+1, b+2, g+2, c+2)<9) break;
		
		char sol[4]={'Z'};
		int min=2147483647;
		
		/* choose B bin */
		for (int i=0;i<3;i++) {
			char s[4]={0};
			s[i]='B';
			/* choose G bin */
			for (int j=0;j<3;j++) {
				if (i==j) continue;
				s[j]='G';
				/* C bin is remaining bin */
				int k=3-i-j;
				s[k]='C';
				int move=g[i]+c[i]+b[j]+c[j]+b[k]+g[k];
				
				/* take solution with minimum cost */
				if (move<min || move==min&&strcmp(s, sol)<0) {
					min=move;
					memcpy(sol, s, sizeof(s));
				}
			}
		}
		printf("%s %d\n", sol, min);
	}
}