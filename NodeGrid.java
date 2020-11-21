package code;

public class NodeGrid {
	private int data;
	private NodeGrid up;
	private NodeGrid down;
	private NodeGrid left;
	private NodeGrid right;
	
	public NodeGrid(){
		data = (int)(Math.random()*6+1);
	}
	
	public NodeGrid(int data)
	{
		this.data = (int)(Math.random()*6+1);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	//for grid array thingy
	public NodeGrid getLeft() {
		return left;
	}
	public void setLeft(NodeGrid left) {
		this.left = left;
	}
	public NodeGrid getRight() {
		return right;
	}
	public void setRight(NodeGrid right) {
		this.right = right;
	}
	
	public NodeGrid getUp() {
		return up;
	}
	public void setUp(NodeGrid up) {
		this.up = up;
	}
	public NodeGrid getDown() {
		return down;
	}
	public void setDown(NodeGrid down) {
		this.down = down;
	}
}
