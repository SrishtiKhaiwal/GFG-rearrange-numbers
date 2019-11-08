package Srishti.com;

public class RearrangeNumbers 
{
public static void main(String args[])
{
	int arr[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
	int n=arr.length;
	int ii=-1;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<0)
		{
			ii++;
			int temp=arr[i];
			arr[i]=arr[ii];
			arr[ii]=temp;
		}
	}
	int pos=ii+1 , neg=0;
	while(pos<n && neg<pos && arr[neg]<0)
	{
		int temp=arr[neg];
		arr[neg]=arr[pos];
		arr[pos]=temp;
		pos++;
		neg+=2;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
