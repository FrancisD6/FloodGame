package code;

import java.util.Scanner;

public class LinkedList {
	private static NodeGrid first;
	public static boolean flag = false;
	public static int constantnum=0;
	
	public LinkedList(int dimension)
	{
		first= new NodeGrid();
		
		//NodeGrid coloumnmarker= new NodeGrid();
		
		NodeGrid rowmarker=first;
		NodeGrid columnmarker=first;
		for(int x=0;x<dimension-1;x++)
		{
			NodeGrid temp= new NodeGrid();
			columnmarker.setRight(temp);
			temp.setLeft(columnmarker);
			columnmarker=temp;
		}
		for(int y=0; y<dimension-1;y++)
		{
			NodeGrid temp= new NodeGrid();
			temp.setUp(rowmarker);
			rowmarker.setDown(temp);
			columnmarker=temp;
			
			for(int x=0; x<dimension-1; x++)
			{
				temp=new NodeGrid();
				temp.setLeft(columnmarker);
				columnmarker.setRight(temp);
				temp.setUp(columnmarker.getUp().getRight());
				temp.getUp().setDown(temp);
				columnmarker=temp;
			}
			rowmarker=rowmarker.getDown();
		}
	}
	
	public void display()
	{
		
		NodeGrid temp=first;
		NodeGrid rowmarker=first;
		
		while(temp!=null)
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getRight();
			}
			System.out.println("");
			temp=rowmarker.getDown();
			rowmarker=temp;
		}
		
	}
	public static boolean flood(int number)
	{
		constantnum=first.getData();
		change(first, number);
		return flag;
	}
	
	public static void change (NodeGrid Node, int number)
	{
		if(flag==false)
		{
			
			Node.setData(number);
			
			if(Node.getRight()!=null&&Node.getRight().getData()==constantnum)
			{
				change(Node.getRight(), number);
			}
			if(Node.getDown()!=null&&Node.getDown().getData()==constantnum)
			{
				change(Node.getDown(), number);
			}
			if(Node.getUp()!=null&&Node.getUp().getData()==constantnum) 
			{
				change(Node.getUp(), number);
			}
			if(Node.getLeft()!=null&&Node.getLeft().getData()==constantnum) 
			{
				change(Node.getLeft(), number);
			}
			
			
		}
		
		
		
		NodeGrid temp=first;
		NodeGrid rowmarker=first;
		while(temp!=null)
		{
			while(temp!=null)
			{
				if(temp.getData()!=first.getData())
				{
					flag = false;
					break;
				}
				else 
					flag = true;
				
				temp=temp.getRight();
			}
			if(flag==false)
				break;
			temp=rowmarker.getDown();
			rowmarker=temp;
		}
		//try to figure out how the main program will percieve the changes
		//and impliment code that will make main program see the changes to the nodes
		//and display accordingly
		
		
		
	}
	
	
	
	
}


