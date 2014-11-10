import java.util.*;
public int maxDepth()
{
	return maxDepth(root);
}
private int maxDepth(Node node)
{
	if(node==null)
		return 0;
	else
	{
		return (Math.max(maxDepth(node.left)),maxDepth(node.right))+1;
	}
}