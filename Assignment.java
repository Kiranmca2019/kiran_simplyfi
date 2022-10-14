package Task;

import java.util.Arrays;

public class Assignment {
	
	static int show(char[] str, char one, int p,
            int q)
{

int cIndex = p;


for (int i = p + 1; i <= q; i++)
if (str[i] > one && str[i] < str[cIndex])
cIndex = i;

return cIndex;
}


static void sortedPermutations(char[] str)
{

int size = str.length;


Arrays.sort(str);


boolean isDone = false;
while (!isDone) {

System.out.println(String.valueOf(str));


int i;
for (i = size - 2; i >= 0; --i)
if (str[i] < str[i + 1])
break;


if (i == -1)
isDone = true;
else {

int cIndex = show(str, str[i], i + 1,size - 1);


char temp = str[i];
str[i] = str[cIndex];
str[cIndex] = temp;


Arrays.sort(str, i + 1, size);
}
}
}
public static void main(String[] args)
{
char[] str = { 'A', 'B', 'C' };
sortedPermutations(str);
}
}

